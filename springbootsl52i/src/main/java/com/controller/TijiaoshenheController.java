package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.TijiaoshenheEntity;
import com.entity.view.TijiaoshenheView;

import com.service.TijiaoshenheService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 提交审核
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-01 21:22:38
 */
@RestController
@RequestMapping("/tijiaoshenhe")
public class TijiaoshenheController {
    @Autowired
    private TijiaoshenheService tijiaoshenheService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,TijiaoshenheEntity tijiaoshenhe,
		@RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) Date wanchengshijianstart, 
    		@RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) Date wanchengshijianend,
		HttpServletRequest request){
    	if(!request.getSession().getAttribute("role").toString().equals("管理员")) {
    		tijiaoshenhe.setUserid((Long)request.getSession().getAttribute("userId"));
    	}
        EntityWrapper<TijiaoshenheEntity> ew = new EntityWrapper<TijiaoshenheEntity>();
		if(wanchengshijianstart!=null) ew.ge("wanchengshijian", wanchengshijianstart);
        	if(wanchengshijianend!=null) ew.le("wanchengshijian", wanchengshijianend);
		PageUtils page = tijiaoshenheService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tijiaoshenhe), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,TijiaoshenheEntity tijiaoshenhe, HttpServletRequest request){
    	if(!request.getSession().getAttribute("role").toString().equals("管理员")) {
    		tijiaoshenhe.setUserid((Long)request.getSession().getAttribute("userId"));
    	}
        EntityWrapper<TijiaoshenheEntity> ew = new EntityWrapper<TijiaoshenheEntity>();
		PageUtils page = tijiaoshenheService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, tijiaoshenhe), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( TijiaoshenheEntity tijiaoshenhe){
       	EntityWrapper<TijiaoshenheEntity> ew = new EntityWrapper<TijiaoshenheEntity>();
      	ew.allEq(MPUtil.allEQMapPre( tijiaoshenhe, "tijiaoshenhe")); 
        return R.ok().put("data", tijiaoshenheService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(TijiaoshenheEntity tijiaoshenhe){
        EntityWrapper< TijiaoshenheEntity> ew = new EntityWrapper< TijiaoshenheEntity>();
 		ew.allEq(MPUtil.allEQMapPre( tijiaoshenhe, "tijiaoshenhe")); 
		TijiaoshenheView tijiaoshenheView =  tijiaoshenheService.selectView(ew);
		return R.ok("查询提交审核成功").put("data", tijiaoshenheView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        TijiaoshenheEntity tijiaoshenhe = tijiaoshenheService.selectById(id);
        return R.ok().put("data", tijiaoshenhe);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        TijiaoshenheEntity tijiaoshenhe = tijiaoshenheService.selectById(id);
        return R.ok().put("data", tijiaoshenhe);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody TijiaoshenheEntity tijiaoshenhe, HttpServletRequest request){
    	tijiaoshenhe.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(tijiaoshenhe);
    	tijiaoshenhe.setUserid((Long)request.getSession().getAttribute("userId"));
        tijiaoshenheService.insert(tijiaoshenhe);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody TijiaoshenheEntity tijiaoshenhe, HttpServletRequest request){
    	tijiaoshenhe.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(tijiaoshenhe);
    	tijiaoshenhe.setUserid((Long)request.getSession().getAttribute("userId"));
        tijiaoshenheService.insert(tijiaoshenhe);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody TijiaoshenheEntity tijiaoshenhe, HttpServletRequest request){
        //ValidatorUtils.validateEntity(tijiaoshenhe);
        tijiaoshenheService.updateById(tijiaoshenhe);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        tijiaoshenheService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<TijiaoshenheEntity> wrapper = new EntityWrapper<TijiaoshenheEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}
		if(!request.getSession().getAttribute("role").toString().equals("管理员")) {
    		wrapper.eq("userid", (Long)request.getSession().getAttribute("userId"));
    	}


		int count = tijiaoshenheService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}

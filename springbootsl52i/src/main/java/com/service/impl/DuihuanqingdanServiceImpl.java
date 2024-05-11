package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DuihuanqingdanDao;
import com.entity.DuihuanqingdanEntity;
import com.service.DuihuanqingdanService;
import com.entity.vo.DuihuanqingdanVO;
import com.entity.view.DuihuanqingdanView;

@Service("duihuanqingdanService")
public class DuihuanqingdanServiceImpl extends ServiceImpl<DuihuanqingdanDao, DuihuanqingdanEntity> implements DuihuanqingdanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DuihuanqingdanEntity> page = this.selectPage(
                new Query<DuihuanqingdanEntity>(params).getPage(),
                new EntityWrapper<DuihuanqingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DuihuanqingdanEntity> wrapper) {
		  Page<DuihuanqingdanView> page =new Query<DuihuanqingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DuihuanqingdanVO> selectListVO(Wrapper<DuihuanqingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DuihuanqingdanVO selectVO(Wrapper<DuihuanqingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DuihuanqingdanView> selectListView(Wrapper<DuihuanqingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DuihuanqingdanView selectView(Wrapper<DuihuanqingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

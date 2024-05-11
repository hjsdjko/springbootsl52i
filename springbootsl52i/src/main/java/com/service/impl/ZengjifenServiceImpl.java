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


import com.dao.ZengjifenDao;
import com.entity.ZengjifenEntity;
import com.service.ZengjifenService;
import com.entity.vo.ZengjifenVO;
import com.entity.view.ZengjifenView;

@Service("zengjifenService")
public class ZengjifenServiceImpl extends ServiceImpl<ZengjifenDao, ZengjifenEntity> implements ZengjifenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZengjifenEntity> page = this.selectPage(
                new Query<ZengjifenEntity>(params).getPage(),
                new EntityWrapper<ZengjifenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZengjifenEntity> wrapper) {
		  Page<ZengjifenView> page =new Query<ZengjifenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZengjifenVO> selectListVO(Wrapper<ZengjifenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZengjifenVO selectVO(Wrapper<ZengjifenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZengjifenView> selectListView(Wrapper<ZengjifenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZengjifenView selectView(Wrapper<ZengjifenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

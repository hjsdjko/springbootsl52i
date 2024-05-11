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


import com.dao.WodejifenDao;
import com.entity.WodejifenEntity;
import com.service.WodejifenService;
import com.entity.vo.WodejifenVO;
import com.entity.view.WodejifenView;

@Service("wodejifenService")
public class WodejifenServiceImpl extends ServiceImpl<WodejifenDao, WodejifenEntity> implements WodejifenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WodejifenEntity> page = this.selectPage(
                new Query<WodejifenEntity>(params).getPage(),
                new EntityWrapper<WodejifenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WodejifenEntity> wrapper) {
		  Page<WodejifenView> page =new Query<WodejifenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WodejifenVO> selectListVO(Wrapper<WodejifenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WodejifenVO selectVO(Wrapper<WodejifenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WodejifenView> selectListView(Wrapper<WodejifenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WodejifenView selectView(Wrapper<WodejifenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

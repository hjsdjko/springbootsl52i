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


import com.dao.XiaojifenDao;
import com.entity.XiaojifenEntity;
import com.service.XiaojifenService;
import com.entity.vo.XiaojifenVO;
import com.entity.view.XiaojifenView;

@Service("xiaojifenService")
public class XiaojifenServiceImpl extends ServiceImpl<XiaojifenDao, XiaojifenEntity> implements XiaojifenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaojifenEntity> page = this.selectPage(
                new Query<XiaojifenEntity>(params).getPage(),
                new EntityWrapper<XiaojifenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaojifenEntity> wrapper) {
		  Page<XiaojifenView> page =new Query<XiaojifenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaojifenVO> selectListVO(Wrapper<XiaojifenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaojifenVO selectVO(Wrapper<XiaojifenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaojifenView> selectListView(Wrapper<XiaojifenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaojifenView selectView(Wrapper<XiaojifenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

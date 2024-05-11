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


import com.dao.RenwuDao;
import com.entity.RenwuEntity;
import com.service.RenwuService;
import com.entity.vo.RenwuVO;
import com.entity.view.RenwuView;

@Service("renwuService")
public class RenwuServiceImpl extends ServiceImpl<RenwuDao, RenwuEntity> implements RenwuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RenwuEntity> page = this.selectPage(
                new Query<RenwuEntity>(params).getPage(),
                new EntityWrapper<RenwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RenwuEntity> wrapper) {
		  Page<RenwuView> page =new Query<RenwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RenwuVO> selectListVO(Wrapper<RenwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RenwuVO selectVO(Wrapper<RenwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RenwuView> selectListView(Wrapper<RenwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RenwuView selectView(Wrapper<RenwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

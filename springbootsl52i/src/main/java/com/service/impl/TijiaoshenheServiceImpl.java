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


import com.dao.TijiaoshenheDao;
import com.entity.TijiaoshenheEntity;
import com.service.TijiaoshenheService;
import com.entity.vo.TijiaoshenheVO;
import com.entity.view.TijiaoshenheView;

@Service("tijiaoshenheService")
public class TijiaoshenheServiceImpl extends ServiceImpl<TijiaoshenheDao, TijiaoshenheEntity> implements TijiaoshenheService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TijiaoshenheEntity> page = this.selectPage(
                new Query<TijiaoshenheEntity>(params).getPage(),
                new EntityWrapper<TijiaoshenheEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TijiaoshenheEntity> wrapper) {
		  Page<TijiaoshenheView> page =new Query<TijiaoshenheView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TijiaoshenheVO> selectListVO(Wrapper<TijiaoshenheEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TijiaoshenheVO selectVO(Wrapper<TijiaoshenheEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TijiaoshenheView> selectListView(Wrapper<TijiaoshenheEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TijiaoshenheView selectView(Wrapper<TijiaoshenheEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

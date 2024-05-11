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


import com.dao.DuihuanwupinDao;
import com.entity.DuihuanwupinEntity;
import com.service.DuihuanwupinService;
import com.entity.vo.DuihuanwupinVO;
import com.entity.view.DuihuanwupinView;

@Service("duihuanwupinService")
public class DuihuanwupinServiceImpl extends ServiceImpl<DuihuanwupinDao, DuihuanwupinEntity> implements DuihuanwupinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DuihuanwupinEntity> page = this.selectPage(
                new Query<DuihuanwupinEntity>(params).getPage(),
                new EntityWrapper<DuihuanwupinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DuihuanwupinEntity> wrapper) {
		  Page<DuihuanwupinView> page =new Query<DuihuanwupinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DuihuanwupinVO> selectListVO(Wrapper<DuihuanwupinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DuihuanwupinVO selectVO(Wrapper<DuihuanwupinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DuihuanwupinView> selectListView(Wrapper<DuihuanwupinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DuihuanwupinView selectView(Wrapper<DuihuanwupinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

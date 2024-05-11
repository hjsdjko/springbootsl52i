package com.dao;

import com.entity.DuihuanwupinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DuihuanwupinVO;
import com.entity.view.DuihuanwupinView;


/**
 * 兑换物品
 * 
 * @author 
 * @email 
 * @date 2021-04-01 21:22:38
 */
public interface DuihuanwupinDao extends BaseMapper<DuihuanwupinEntity> {
	
	List<DuihuanwupinVO> selectListVO(@Param("ew") Wrapper<DuihuanwupinEntity> wrapper);
	
	DuihuanwupinVO selectVO(@Param("ew") Wrapper<DuihuanwupinEntity> wrapper);
	
	List<DuihuanwupinView> selectListView(@Param("ew") Wrapper<DuihuanwupinEntity> wrapper);

	List<DuihuanwupinView> selectListView(Pagination page,@Param("ew") Wrapper<DuihuanwupinEntity> wrapper);
	
	DuihuanwupinView selectView(@Param("ew") Wrapper<DuihuanwupinEntity> wrapper);
	
}

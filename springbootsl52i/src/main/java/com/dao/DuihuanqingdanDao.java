package com.dao;

import com.entity.DuihuanqingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DuihuanqingdanVO;
import com.entity.view.DuihuanqingdanView;


/**
 * 兑换清单
 * 
 * @author 
 * @email 
 * @date 2021-04-01 21:22:38
 */
public interface DuihuanqingdanDao extends BaseMapper<DuihuanqingdanEntity> {
	
	List<DuihuanqingdanVO> selectListVO(@Param("ew") Wrapper<DuihuanqingdanEntity> wrapper);
	
	DuihuanqingdanVO selectVO(@Param("ew") Wrapper<DuihuanqingdanEntity> wrapper);
	
	List<DuihuanqingdanView> selectListView(@Param("ew") Wrapper<DuihuanqingdanEntity> wrapper);

	List<DuihuanqingdanView> selectListView(Pagination page,@Param("ew") Wrapper<DuihuanqingdanEntity> wrapper);
	
	DuihuanqingdanView selectView(@Param("ew") Wrapper<DuihuanqingdanEntity> wrapper);
	
}

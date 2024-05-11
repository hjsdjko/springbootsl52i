package com.dao;

import com.entity.RenwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RenwuVO;
import com.entity.view.RenwuView;


/**
 * 任务
 * 
 * @author 
 * @email 
 * @date 2021-04-01 21:22:37
 */
public interface RenwuDao extends BaseMapper<RenwuEntity> {
	
	List<RenwuVO> selectListVO(@Param("ew") Wrapper<RenwuEntity> wrapper);
	
	RenwuVO selectVO(@Param("ew") Wrapper<RenwuEntity> wrapper);
	
	List<RenwuView> selectListView(@Param("ew") Wrapper<RenwuEntity> wrapper);

	List<RenwuView> selectListView(Pagination page,@Param("ew") Wrapper<RenwuEntity> wrapper);
	
	RenwuView selectView(@Param("ew") Wrapper<RenwuEntity> wrapper);
	
}

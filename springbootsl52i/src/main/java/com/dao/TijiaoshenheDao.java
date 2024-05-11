package com.dao;

import com.entity.TijiaoshenheEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TijiaoshenheVO;
import com.entity.view.TijiaoshenheView;


/**
 * 提交审核
 * 
 * @author 
 * @email 
 * @date 2021-04-01 21:22:38
 */
public interface TijiaoshenheDao extends BaseMapper<TijiaoshenheEntity> {
	
	List<TijiaoshenheVO> selectListVO(@Param("ew") Wrapper<TijiaoshenheEntity> wrapper);
	
	TijiaoshenheVO selectVO(@Param("ew") Wrapper<TijiaoshenheEntity> wrapper);
	
	List<TijiaoshenheView> selectListView(@Param("ew") Wrapper<TijiaoshenheEntity> wrapper);

	List<TijiaoshenheView> selectListView(Pagination page,@Param("ew") Wrapper<TijiaoshenheEntity> wrapper);
	
	TijiaoshenheView selectView(@Param("ew") Wrapper<TijiaoshenheEntity> wrapper);
	
}

package com.dao;

import com.entity.ZengjifenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZengjifenVO;
import com.entity.view.ZengjifenView;


/**
 * 增积分
 * 
 * @author 
 * @email 
 * @date 2021-04-01 21:22:38
 */
public interface ZengjifenDao extends BaseMapper<ZengjifenEntity> {
	
	List<ZengjifenVO> selectListVO(@Param("ew") Wrapper<ZengjifenEntity> wrapper);
	
	ZengjifenVO selectVO(@Param("ew") Wrapper<ZengjifenEntity> wrapper);
	
	List<ZengjifenView> selectListView(@Param("ew") Wrapper<ZengjifenEntity> wrapper);

	List<ZengjifenView> selectListView(Pagination page,@Param("ew") Wrapper<ZengjifenEntity> wrapper);
	
	ZengjifenView selectView(@Param("ew") Wrapper<ZengjifenEntity> wrapper);
	
}

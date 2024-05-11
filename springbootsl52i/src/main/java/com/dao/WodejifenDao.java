package com.dao;

import com.entity.WodejifenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WodejifenVO;
import com.entity.view.WodejifenView;


/**
 * 我的积分
 * 
 * @author 
 * @email 
 * @date 2021-04-01 21:22:38
 */
public interface WodejifenDao extends BaseMapper<WodejifenEntity> {
	
	List<WodejifenVO> selectListVO(@Param("ew") Wrapper<WodejifenEntity> wrapper);
	
	WodejifenVO selectVO(@Param("ew") Wrapper<WodejifenEntity> wrapper);
	
	List<WodejifenView> selectListView(@Param("ew") Wrapper<WodejifenEntity> wrapper);

	List<WodejifenView> selectListView(Pagination page,@Param("ew") Wrapper<WodejifenEntity> wrapper);
	
	WodejifenView selectView(@Param("ew") Wrapper<WodejifenEntity> wrapper);
	
}

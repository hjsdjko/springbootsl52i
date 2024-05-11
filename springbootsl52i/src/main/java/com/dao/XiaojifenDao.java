package com.dao;

import com.entity.XiaojifenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaojifenVO;
import com.entity.view.XiaojifenView;


/**
 * 消积分
 * 
 * @author 
 * @email 
 * @date 2021-04-01 21:22:38
 */
public interface XiaojifenDao extends BaseMapper<XiaojifenEntity> {
	
	List<XiaojifenVO> selectListVO(@Param("ew") Wrapper<XiaojifenEntity> wrapper);
	
	XiaojifenVO selectVO(@Param("ew") Wrapper<XiaojifenEntity> wrapper);
	
	List<XiaojifenView> selectListView(@Param("ew") Wrapper<XiaojifenEntity> wrapper);

	List<XiaojifenView> selectListView(Pagination page,@Param("ew") Wrapper<XiaojifenEntity> wrapper);
	
	XiaojifenView selectView(@Param("ew") Wrapper<XiaojifenEntity> wrapper);
	
}

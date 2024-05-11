package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WodejifenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WodejifenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WodejifenView;


/**
 * 我的积分
 *
 * @author 
 * @email 
 * @date 2021-04-01 21:22:38
 */
public interface WodejifenService extends IService<WodejifenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WodejifenVO> selectListVO(Wrapper<WodejifenEntity> wrapper);
   	
   	WodejifenVO selectVO(@Param("ew") Wrapper<WodejifenEntity> wrapper);
   	
   	List<WodejifenView> selectListView(Wrapper<WodejifenEntity> wrapper);
   	
   	WodejifenView selectView(@Param("ew") Wrapper<WodejifenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WodejifenEntity> wrapper);
   	
}


package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaojifenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaojifenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaojifenView;


/**
 * 消积分
 *
 * @author 
 * @email 
 * @date 2021-04-01 21:22:38
 */
public interface XiaojifenService extends IService<XiaojifenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaojifenVO> selectListVO(Wrapper<XiaojifenEntity> wrapper);
   	
   	XiaojifenVO selectVO(@Param("ew") Wrapper<XiaojifenEntity> wrapper);
   	
   	List<XiaojifenView> selectListView(Wrapper<XiaojifenEntity> wrapper);
   	
   	XiaojifenView selectView(@Param("ew") Wrapper<XiaojifenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaojifenEntity> wrapper);
   	
}


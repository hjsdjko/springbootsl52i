package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZengjifenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZengjifenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZengjifenView;


/**
 * 增积分
 *
 * @author 
 * @email 
 * @date 2021-04-01 21:22:38
 */
public interface ZengjifenService extends IService<ZengjifenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZengjifenVO> selectListVO(Wrapper<ZengjifenEntity> wrapper);
   	
   	ZengjifenVO selectVO(@Param("ew") Wrapper<ZengjifenEntity> wrapper);
   	
   	List<ZengjifenView> selectListView(Wrapper<ZengjifenEntity> wrapper);
   	
   	ZengjifenView selectView(@Param("ew") Wrapper<ZengjifenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZengjifenEntity> wrapper);
   	
}


package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RenwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RenwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RenwuView;


/**
 * 任务
 *
 * @author 
 * @email 
 * @date 2021-04-01 21:22:37
 */
public interface RenwuService extends IService<RenwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RenwuVO> selectListVO(Wrapper<RenwuEntity> wrapper);
   	
   	RenwuVO selectVO(@Param("ew") Wrapper<RenwuEntity> wrapper);
   	
   	List<RenwuView> selectListView(Wrapper<RenwuEntity> wrapper);
   	
   	RenwuView selectView(@Param("ew") Wrapper<RenwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RenwuEntity> wrapper);
   	
}


package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TijiaoshenheEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TijiaoshenheVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TijiaoshenheView;


/**
 * 提交审核
 *
 * @author 
 * @email 
 * @date 2021-04-01 21:22:38
 */
public interface TijiaoshenheService extends IService<TijiaoshenheEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TijiaoshenheVO> selectListVO(Wrapper<TijiaoshenheEntity> wrapper);
   	
   	TijiaoshenheVO selectVO(@Param("ew") Wrapper<TijiaoshenheEntity> wrapper);
   	
   	List<TijiaoshenheView> selectListView(Wrapper<TijiaoshenheEntity> wrapper);
   	
   	TijiaoshenheView selectView(@Param("ew") Wrapper<TijiaoshenheEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TijiaoshenheEntity> wrapper);
   	
}


package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DuihuanwupinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DuihuanwupinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DuihuanwupinView;


/**
 * 兑换物品
 *
 * @author 
 * @email 
 * @date 2021-04-01 21:22:38
 */
public interface DuihuanwupinService extends IService<DuihuanwupinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DuihuanwupinVO> selectListVO(Wrapper<DuihuanwupinEntity> wrapper);
   	
   	DuihuanwupinVO selectVO(@Param("ew") Wrapper<DuihuanwupinEntity> wrapper);
   	
   	List<DuihuanwupinView> selectListView(Wrapper<DuihuanwupinEntity> wrapper);
   	
   	DuihuanwupinView selectView(@Param("ew") Wrapper<DuihuanwupinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DuihuanwupinEntity> wrapper);
   	
}


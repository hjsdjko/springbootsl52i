package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DuihuanqingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DuihuanqingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DuihuanqingdanView;


/**
 * 兑换清单
 *
 * @author 
 * @email 
 * @date 2021-04-01 21:22:38
 */
public interface DuihuanqingdanService extends IService<DuihuanqingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DuihuanqingdanVO> selectListVO(Wrapper<DuihuanqingdanEntity> wrapper);
   	
   	DuihuanqingdanVO selectVO(@Param("ew") Wrapper<DuihuanqingdanEntity> wrapper);
   	
   	List<DuihuanqingdanView> selectListView(Wrapper<DuihuanqingdanEntity> wrapper);
   	
   	DuihuanqingdanView selectView(@Param("ew") Wrapper<DuihuanqingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DuihuanqingdanEntity> wrapper);
   	
}


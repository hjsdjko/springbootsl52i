package com.entity.view;

import com.entity.RenwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 任务
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-01 21:22:37
 */
@TableName("renwu")
public class RenwuView  extends RenwuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public RenwuView(){
	}
 
 	public RenwuView(RenwuEntity renwuEntity){
 	try {
			BeanUtils.copyProperties(this, renwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

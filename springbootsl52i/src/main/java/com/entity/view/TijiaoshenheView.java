package com.entity.view;

import com.entity.TijiaoshenheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 提交审核
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-01 21:22:38
 */
@TableName("tijiaoshenhe")
public class TijiaoshenheView  extends TijiaoshenheEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TijiaoshenheView(){
	}
 
 	public TijiaoshenheView(TijiaoshenheEntity tijiaoshenheEntity){
 	try {
			BeanUtils.copyProperties(this, tijiaoshenheEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

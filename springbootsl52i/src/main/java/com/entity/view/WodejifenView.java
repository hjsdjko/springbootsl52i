package com.entity.view;

import com.entity.WodejifenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 我的积分
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-01 21:22:38
 */
@TableName("wodejifen")
public class WodejifenView  extends WodejifenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WodejifenView(){
	}
 
 	public WodejifenView(WodejifenEntity wodejifenEntity){
 	try {
			BeanUtils.copyProperties(this, wodejifenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

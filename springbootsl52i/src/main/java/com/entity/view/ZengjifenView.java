package com.entity.view;

import com.entity.ZengjifenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 增积分
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-01 21:22:38
 */
@TableName("zengjifen")
public class ZengjifenView  extends ZengjifenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZengjifenView(){
	}
 
 	public ZengjifenView(ZengjifenEntity zengjifenEntity){
 	try {
			BeanUtils.copyProperties(this, zengjifenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

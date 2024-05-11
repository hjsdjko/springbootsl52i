package com.entity.vo;

import com.entity.ZengjifenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 增积分
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-01 21:22:38
 */
public class ZengjifenVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 积分
	 */
	
	private String jifen;
		
	/**
	 * 任务编号
	 */
	
	private String renwubianhao;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：积分
	 */
	 
	public void setJifen(String jifen) {
		this.jifen = jifen;
	}
	
	/**
	 * 获取：积分
	 */
	public String getJifen() {
		return jifen;
	}
				
	
	/**
	 * 设置：任务编号
	 */
	 
	public void setRenwubianhao(String renwubianhao) {
		this.renwubianhao = renwubianhao;
	}
	
	/**
	 * 获取：任务编号
	 */
	public String getRenwubianhao() {
		return renwubianhao;
	}
			
}

package com.entity.view;

import com.entity.DiscussdianzishangchengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 电子商城评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-19 05:59:14
 */
@TableName("discussdianzishangcheng")
public class DiscussdianzishangchengView  extends DiscussdianzishangchengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussdianzishangchengView(){
	}
 
 	public DiscussdianzishangchengView(DiscussdianzishangchengEntity discussdianzishangchengEntity){
 	try {
			BeanUtils.copyProperties(this, discussdianzishangchengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

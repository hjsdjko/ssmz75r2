package com.entity.view;

import com.entity.DiscussrementuijianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 热门推荐评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-19 05:59:14
 */
@TableName("discussrementuijian")
public class DiscussrementuijianView  extends DiscussrementuijianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussrementuijianView(){
	}
 
 	public DiscussrementuijianView(DiscussrementuijianEntity discussrementuijianEntity){
 	try {
			BeanUtils.copyProperties(this, discussrementuijianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

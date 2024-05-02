package com.entity.view;

import com.entity.RementuijianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 热门推荐
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-19 05:59:14
 */
@TableName("rementuijian")
public class RementuijianView  extends RementuijianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public RementuijianView(){
	}
 
 	public RementuijianView(RementuijianEntity rementuijianEntity){
 	try {
			BeanUtils.copyProperties(this, rementuijianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

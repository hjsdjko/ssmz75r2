package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 热门推荐
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-19 05:59:14
 */
@TableName("rementuijian")
public class RementuijianEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public RementuijianEntity() {
		
	}
	
	public RementuijianEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 商品编号
	 */
					
	private String shangpinbianhao;
	
	/**
	 * 商品名称
	 */
					
	private String shangpinmingcheng;
	
	/**
	 * 商品类别
	 */
					
	private String shangpinleibie;
	
	/**
	 * 商品品牌
	 */
					
	private String shangpinpinpai;
	
	/**
	 * 商品图片
	 */
					
	private String shangpintupian;
	
	/**
	 * 商品演示
	 */
					
	private String shangpinyanshi;
	
	/**
	 * 上市时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date shangshishijian;
	
	/**
	 * 详细参数
	 */
					
	private String xiangxicanshu;
	
	/**
	 * 赞
	 */
					
	private Integer thumbsupnum;
	
	/**
	 * 踩
	 */
					
	private Integer crazilynum;
	
	/**
	 * 价格
	 */
					
	private Float price;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：商品编号
	 */
	public void setShangpinbianhao(String shangpinbianhao) {
		this.shangpinbianhao = shangpinbianhao;
	}
	/**
	 * 获取：商品编号
	 */
	public String getShangpinbianhao() {
		return shangpinbianhao;
	}
	/**
	 * 设置：商品名称
	 */
	public void setShangpinmingcheng(String shangpinmingcheng) {
		this.shangpinmingcheng = shangpinmingcheng;
	}
	/**
	 * 获取：商品名称
	 */
	public String getShangpinmingcheng() {
		return shangpinmingcheng;
	}
	/**
	 * 设置：商品类别
	 */
	public void setShangpinleibie(String shangpinleibie) {
		this.shangpinleibie = shangpinleibie;
	}
	/**
	 * 获取：商品类别
	 */
	public String getShangpinleibie() {
		return shangpinleibie;
	}
	/**
	 * 设置：商品品牌
	 */
	public void setShangpinpinpai(String shangpinpinpai) {
		this.shangpinpinpai = shangpinpinpai;
	}
	/**
	 * 获取：商品品牌
	 */
	public String getShangpinpinpai() {
		return shangpinpinpai;
	}
	/**
	 * 设置：商品图片
	 */
	public void setShangpintupian(String shangpintupian) {
		this.shangpintupian = shangpintupian;
	}
	/**
	 * 获取：商品图片
	 */
	public String getShangpintupian() {
		return shangpintupian;
	}
	/**
	 * 设置：商品演示
	 */
	public void setShangpinyanshi(String shangpinyanshi) {
		this.shangpinyanshi = shangpinyanshi;
	}
	/**
	 * 获取：商品演示
	 */
	public String getShangpinyanshi() {
		return shangpinyanshi;
	}
	/**
	 * 设置：上市时间
	 */
	public void setShangshishijian(Date shangshishijian) {
		this.shangshishijian = shangshishijian;
	}
	/**
	 * 获取：上市时间
	 */
	public Date getShangshishijian() {
		return shangshishijian;
	}
	/**
	 * 设置：详细参数
	 */
	public void setXiangxicanshu(String xiangxicanshu) {
		this.xiangxicanshu = xiangxicanshu;
	}
	/**
	 * 获取：详细参数
	 */
	public String getXiangxicanshu() {
		return xiangxicanshu;
	}
	/**
	 * 设置：赞
	 */
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
	/**
	 * 设置：踩
	 */
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
	/**
	 * 设置：价格
	 */
	public void setPrice(Float price) {
		this.price = price;
	}
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}

}

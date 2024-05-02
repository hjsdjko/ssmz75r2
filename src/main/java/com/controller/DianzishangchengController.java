package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DianzishangchengEntity;
import com.entity.view.DianzishangchengView;

import com.service.DianzishangchengService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 电子商城
 * 后端接口
 * @author 
 * @email 
 * @date 2021-04-19 05:59:14
 */
@RestController
@RequestMapping("/dianzishangcheng")
public class DianzishangchengController {
    @Autowired
    private DianzishangchengService dianzishangchengService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DianzishangchengEntity dianzishangcheng, 
		HttpServletRequest request){

        EntityWrapper<DianzishangchengEntity> ew = new EntityWrapper<DianzishangchengEntity>();
		PageUtils page = dianzishangchengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dianzishangcheng), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DianzishangchengEntity dianzishangcheng, HttpServletRequest request){
        EntityWrapper<DianzishangchengEntity> ew = new EntityWrapper<DianzishangchengEntity>();
		PageUtils page = dianzishangchengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dianzishangcheng), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DianzishangchengEntity dianzishangcheng){
       	EntityWrapper<DianzishangchengEntity> ew = new EntityWrapper<DianzishangchengEntity>();
      	ew.allEq(MPUtil.allEQMapPre( dianzishangcheng, "dianzishangcheng")); 
        return R.ok().put("data", dianzishangchengService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DianzishangchengEntity dianzishangcheng){
        EntityWrapper< DianzishangchengEntity> ew = new EntityWrapper< DianzishangchengEntity>();
 		ew.allEq(MPUtil.allEQMapPre( dianzishangcheng, "dianzishangcheng")); 
		DianzishangchengView dianzishangchengView =  dianzishangchengService.selectView(ew);
		return R.ok("查询电子商城成功").put("data", dianzishangchengView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DianzishangchengEntity dianzishangcheng = dianzishangchengService.selectById(id);
        return R.ok().put("data", dianzishangcheng);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DianzishangchengEntity dianzishangcheng = dianzishangchengService.selectById(id);
        return R.ok().put("data", dianzishangcheng);
    }
    


    /**
     * 赞或踩
     */
    @RequestMapping("/thumbsup/{id}")
    public R thumbsup(@PathVariable("id") String id,String type){
        DianzishangchengEntity dianzishangcheng = dianzishangchengService.selectById(id);
        if(type.equals("1")) {
        	dianzishangcheng.setThumbsupnum(dianzishangcheng.getThumbsupnum()+1);
        } else {
        	dianzishangcheng.setCrazilynum(dianzishangcheng.getCrazilynum()+1);
        }
        dianzishangchengService.updateById(dianzishangcheng);
        return R.ok();
    }

    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DianzishangchengEntity dianzishangcheng, HttpServletRequest request){
    	dianzishangcheng.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(dianzishangcheng);

        dianzishangchengService.insert(dianzishangcheng);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DianzishangchengEntity dianzishangcheng, HttpServletRequest request){
    	dianzishangcheng.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(dianzishangcheng);

        dianzishangchengService.insert(dianzishangcheng);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DianzishangchengEntity dianzishangcheng, HttpServletRequest request){
        //ValidatorUtils.validateEntity(dianzishangcheng);
        dianzishangchengService.updateById(dianzishangcheng);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        dianzishangchengService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DianzishangchengEntity> wrapper = new EntityWrapper<DianzishangchengEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = dianzishangchengService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}

package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DianzishangchengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DianzishangchengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DianzishangchengView;


/**
 * 电子商城
 *
 * @author 
 * @email 
 * @date 2021-04-19 05:59:14
 */
public interface DianzishangchengService extends IService<DianzishangchengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DianzishangchengVO> selectListVO(Wrapper<DianzishangchengEntity> wrapper);
   	
   	DianzishangchengVO selectVO(@Param("ew") Wrapper<DianzishangchengEntity> wrapper);
   	
   	List<DianzishangchengView> selectListView(Wrapper<DianzishangchengEntity> wrapper);
   	
   	DianzishangchengView selectView(@Param("ew") Wrapper<DianzishangchengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DianzishangchengEntity> wrapper);
   	
}


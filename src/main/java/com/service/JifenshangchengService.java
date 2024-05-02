package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JifenshangchengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JifenshangchengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JifenshangchengView;


/**
 * 积分商城
 *
 * @author 
 * @email 
 * @date 2021-04-19 05:59:14
 */
public interface JifenshangchengService extends IService<JifenshangchengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JifenshangchengVO> selectListVO(Wrapper<JifenshangchengEntity> wrapper);
   	
   	JifenshangchengVO selectVO(@Param("ew") Wrapper<JifenshangchengEntity> wrapper);
   	
   	List<JifenshangchengView> selectListView(Wrapper<JifenshangchengEntity> wrapper);
   	
   	JifenshangchengView selectView(@Param("ew") Wrapper<JifenshangchengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JifenshangchengEntity> wrapper);
   	
}


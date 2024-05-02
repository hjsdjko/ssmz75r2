package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjifenshangchengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjifenshangchengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjifenshangchengView;


/**
 * 积分商城评论表
 *
 * @author 
 * @email 
 * @date 2021-04-19 05:59:14
 */
public interface DiscussjifenshangchengService extends IService<DiscussjifenshangchengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjifenshangchengVO> selectListVO(Wrapper<DiscussjifenshangchengEntity> wrapper);
   	
   	DiscussjifenshangchengVO selectVO(@Param("ew") Wrapper<DiscussjifenshangchengEntity> wrapper);
   	
   	List<DiscussjifenshangchengView> selectListView(Wrapper<DiscussjifenshangchengEntity> wrapper);
   	
   	DiscussjifenshangchengView selectView(@Param("ew") Wrapper<DiscussjifenshangchengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjifenshangchengEntity> wrapper);
   	
}


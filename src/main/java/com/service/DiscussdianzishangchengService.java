package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussdianzishangchengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussdianzishangchengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussdianzishangchengView;


/**
 * 电子商城评论表
 *
 * @author 
 * @email 
 * @date 2021-04-19 05:59:14
 */
public interface DiscussdianzishangchengService extends IService<DiscussdianzishangchengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussdianzishangchengVO> selectListVO(Wrapper<DiscussdianzishangchengEntity> wrapper);
   	
   	DiscussdianzishangchengVO selectVO(@Param("ew") Wrapper<DiscussdianzishangchengEntity> wrapper);
   	
   	List<DiscussdianzishangchengView> selectListView(Wrapper<DiscussdianzishangchengEntity> wrapper);
   	
   	DiscussdianzishangchengView selectView(@Param("ew") Wrapper<DiscussdianzishangchengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussdianzishangchengEntity> wrapper);
   	
}


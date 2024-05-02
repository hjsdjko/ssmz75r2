package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussrementuijianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussrementuijianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussrementuijianView;


/**
 * 热门推荐评论表
 *
 * @author 
 * @email 
 * @date 2021-04-19 05:59:14
 */
public interface DiscussrementuijianService extends IService<DiscussrementuijianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussrementuijianVO> selectListVO(Wrapper<DiscussrementuijianEntity> wrapper);
   	
   	DiscussrementuijianVO selectVO(@Param("ew") Wrapper<DiscussrementuijianEntity> wrapper);
   	
   	List<DiscussrementuijianView> selectListView(Wrapper<DiscussrementuijianEntity> wrapper);
   	
   	DiscussrementuijianView selectView(@Param("ew") Wrapper<DiscussrementuijianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussrementuijianEntity> wrapper);
   	
}


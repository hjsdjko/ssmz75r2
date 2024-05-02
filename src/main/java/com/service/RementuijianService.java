package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RementuijianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RementuijianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RementuijianView;


/**
 * 热门推荐
 *
 * @author 
 * @email 
 * @date 2021-04-19 05:59:14
 */
public interface RementuijianService extends IService<RementuijianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RementuijianVO> selectListVO(Wrapper<RementuijianEntity> wrapper);
   	
   	RementuijianVO selectVO(@Param("ew") Wrapper<RementuijianEntity> wrapper);
   	
   	List<RementuijianView> selectListView(Wrapper<RementuijianEntity> wrapper);
   	
   	RementuijianView selectView(@Param("ew") Wrapper<RementuijianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RementuijianEntity> wrapper);
   	
}


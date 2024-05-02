package com.dao;

import com.entity.RementuijianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RementuijianVO;
import com.entity.view.RementuijianView;


/**
 * 热门推荐
 * 
 * @author 
 * @email 
 * @date 2021-04-19 05:59:14
 */
public interface RementuijianDao extends BaseMapper<RementuijianEntity> {
	
	List<RementuijianVO> selectListVO(@Param("ew") Wrapper<RementuijianEntity> wrapper);
	
	RementuijianVO selectVO(@Param("ew") Wrapper<RementuijianEntity> wrapper);
	
	List<RementuijianView> selectListView(@Param("ew") Wrapper<RementuijianEntity> wrapper);

	List<RementuijianView> selectListView(Pagination page,@Param("ew") Wrapper<RementuijianEntity> wrapper);
	
	RementuijianView selectView(@Param("ew") Wrapper<RementuijianEntity> wrapper);
	
}

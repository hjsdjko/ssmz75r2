package com.dao;

import com.entity.DiscussrementuijianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussrementuijianVO;
import com.entity.view.DiscussrementuijianView;


/**
 * 热门推荐评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-19 05:59:14
 */
public interface DiscussrementuijianDao extends BaseMapper<DiscussrementuijianEntity> {
	
	List<DiscussrementuijianVO> selectListVO(@Param("ew") Wrapper<DiscussrementuijianEntity> wrapper);
	
	DiscussrementuijianVO selectVO(@Param("ew") Wrapper<DiscussrementuijianEntity> wrapper);
	
	List<DiscussrementuijianView> selectListView(@Param("ew") Wrapper<DiscussrementuijianEntity> wrapper);

	List<DiscussrementuijianView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussrementuijianEntity> wrapper);
	
	DiscussrementuijianView selectView(@Param("ew") Wrapper<DiscussrementuijianEntity> wrapper);
	
}

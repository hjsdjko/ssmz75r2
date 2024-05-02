package com.dao;

import com.entity.DiscussdianzishangchengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussdianzishangchengVO;
import com.entity.view.DiscussdianzishangchengView;


/**
 * 电子商城评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-19 05:59:14
 */
public interface DiscussdianzishangchengDao extends BaseMapper<DiscussdianzishangchengEntity> {
	
	List<DiscussdianzishangchengVO> selectListVO(@Param("ew") Wrapper<DiscussdianzishangchengEntity> wrapper);
	
	DiscussdianzishangchengVO selectVO(@Param("ew") Wrapper<DiscussdianzishangchengEntity> wrapper);
	
	List<DiscussdianzishangchengView> selectListView(@Param("ew") Wrapper<DiscussdianzishangchengEntity> wrapper);

	List<DiscussdianzishangchengView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussdianzishangchengEntity> wrapper);
	
	DiscussdianzishangchengView selectView(@Param("ew") Wrapper<DiscussdianzishangchengEntity> wrapper);
	
}

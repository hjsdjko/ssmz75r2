package com.dao;

import com.entity.DiscussjifenshangchengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjifenshangchengVO;
import com.entity.view.DiscussjifenshangchengView;


/**
 * 积分商城评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-19 05:59:14
 */
public interface DiscussjifenshangchengDao extends BaseMapper<DiscussjifenshangchengEntity> {
	
	List<DiscussjifenshangchengVO> selectListVO(@Param("ew") Wrapper<DiscussjifenshangchengEntity> wrapper);
	
	DiscussjifenshangchengVO selectVO(@Param("ew") Wrapper<DiscussjifenshangchengEntity> wrapper);
	
	List<DiscussjifenshangchengView> selectListView(@Param("ew") Wrapper<DiscussjifenshangchengEntity> wrapper);

	List<DiscussjifenshangchengView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjifenshangchengEntity> wrapper);
	
	DiscussjifenshangchengView selectView(@Param("ew") Wrapper<DiscussjifenshangchengEntity> wrapper);
	
}

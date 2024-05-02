package com.dao;

import com.entity.DianzishangchengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DianzishangchengVO;
import com.entity.view.DianzishangchengView;


/**
 * 电子商城
 * 
 * @author 
 * @email 
 * @date 2021-04-19 05:59:14
 */
public interface DianzishangchengDao extends BaseMapper<DianzishangchengEntity> {
	
	List<DianzishangchengVO> selectListVO(@Param("ew") Wrapper<DianzishangchengEntity> wrapper);
	
	DianzishangchengVO selectVO(@Param("ew") Wrapper<DianzishangchengEntity> wrapper);
	
	List<DianzishangchengView> selectListView(@Param("ew") Wrapper<DianzishangchengEntity> wrapper);

	List<DianzishangchengView> selectListView(Pagination page,@Param("ew") Wrapper<DianzishangchengEntity> wrapper);
	
	DianzishangchengView selectView(@Param("ew") Wrapper<DianzishangchengEntity> wrapper);
	
}

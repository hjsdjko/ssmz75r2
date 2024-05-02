package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DianzishangchengDao;
import com.entity.DianzishangchengEntity;
import com.service.DianzishangchengService;
import com.entity.vo.DianzishangchengVO;
import com.entity.view.DianzishangchengView;

@Service("dianzishangchengService")
public class DianzishangchengServiceImpl extends ServiceImpl<DianzishangchengDao, DianzishangchengEntity> implements DianzishangchengService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DianzishangchengEntity> page = this.selectPage(
                new Query<DianzishangchengEntity>(params).getPage(),
                new EntityWrapper<DianzishangchengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DianzishangchengEntity> wrapper) {
		  Page<DianzishangchengView> page =new Query<DianzishangchengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DianzishangchengVO> selectListVO(Wrapper<DianzishangchengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DianzishangchengVO selectVO(Wrapper<DianzishangchengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DianzishangchengView> selectListView(Wrapper<DianzishangchengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DianzishangchengView selectView(Wrapper<DianzishangchengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

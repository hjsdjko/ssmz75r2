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


import com.dao.DiscussdianzishangchengDao;
import com.entity.DiscussdianzishangchengEntity;
import com.service.DiscussdianzishangchengService;
import com.entity.vo.DiscussdianzishangchengVO;
import com.entity.view.DiscussdianzishangchengView;

@Service("discussdianzishangchengService")
public class DiscussdianzishangchengServiceImpl extends ServiceImpl<DiscussdianzishangchengDao, DiscussdianzishangchengEntity> implements DiscussdianzishangchengService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussdianzishangchengEntity> page = this.selectPage(
                new Query<DiscussdianzishangchengEntity>(params).getPage(),
                new EntityWrapper<DiscussdianzishangchengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussdianzishangchengEntity> wrapper) {
		  Page<DiscussdianzishangchengView> page =new Query<DiscussdianzishangchengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussdianzishangchengVO> selectListVO(Wrapper<DiscussdianzishangchengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussdianzishangchengVO selectVO(Wrapper<DiscussdianzishangchengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussdianzishangchengView> selectListView(Wrapper<DiscussdianzishangchengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussdianzishangchengView selectView(Wrapper<DiscussdianzishangchengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

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


import com.dao.DiscussjifenshangchengDao;
import com.entity.DiscussjifenshangchengEntity;
import com.service.DiscussjifenshangchengService;
import com.entity.vo.DiscussjifenshangchengVO;
import com.entity.view.DiscussjifenshangchengView;

@Service("discussjifenshangchengService")
public class DiscussjifenshangchengServiceImpl extends ServiceImpl<DiscussjifenshangchengDao, DiscussjifenshangchengEntity> implements DiscussjifenshangchengService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjifenshangchengEntity> page = this.selectPage(
                new Query<DiscussjifenshangchengEntity>(params).getPage(),
                new EntityWrapper<DiscussjifenshangchengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjifenshangchengEntity> wrapper) {
		  Page<DiscussjifenshangchengView> page =new Query<DiscussjifenshangchengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjifenshangchengVO> selectListVO(Wrapper<DiscussjifenshangchengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjifenshangchengVO selectVO(Wrapper<DiscussjifenshangchengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjifenshangchengView> selectListView(Wrapper<DiscussjifenshangchengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjifenshangchengView selectView(Wrapper<DiscussjifenshangchengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

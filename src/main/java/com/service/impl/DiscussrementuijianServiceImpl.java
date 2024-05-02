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


import com.dao.DiscussrementuijianDao;
import com.entity.DiscussrementuijianEntity;
import com.service.DiscussrementuijianService;
import com.entity.vo.DiscussrementuijianVO;
import com.entity.view.DiscussrementuijianView;

@Service("discussrementuijianService")
public class DiscussrementuijianServiceImpl extends ServiceImpl<DiscussrementuijianDao, DiscussrementuijianEntity> implements DiscussrementuijianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussrementuijianEntity> page = this.selectPage(
                new Query<DiscussrementuijianEntity>(params).getPage(),
                new EntityWrapper<DiscussrementuijianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussrementuijianEntity> wrapper) {
		  Page<DiscussrementuijianView> page =new Query<DiscussrementuijianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussrementuijianVO> selectListVO(Wrapper<DiscussrementuijianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussrementuijianVO selectVO(Wrapper<DiscussrementuijianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussrementuijianView> selectListView(Wrapper<DiscussrementuijianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussrementuijianView selectView(Wrapper<DiscussrementuijianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

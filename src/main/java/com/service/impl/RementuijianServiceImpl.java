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


import com.dao.RementuijianDao;
import com.entity.RementuijianEntity;
import com.service.RementuijianService;
import com.entity.vo.RementuijianVO;
import com.entity.view.RementuijianView;

@Service("rementuijianService")
public class RementuijianServiceImpl extends ServiceImpl<RementuijianDao, RementuijianEntity> implements RementuijianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RementuijianEntity> page = this.selectPage(
                new Query<RementuijianEntity>(params).getPage(),
                new EntityWrapper<RementuijianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RementuijianEntity> wrapper) {
		  Page<RementuijianView> page =new Query<RementuijianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RementuijianVO> selectListVO(Wrapper<RementuijianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RementuijianVO selectVO(Wrapper<RementuijianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RementuijianView> selectListView(Wrapper<RementuijianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RementuijianView selectView(Wrapper<RementuijianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

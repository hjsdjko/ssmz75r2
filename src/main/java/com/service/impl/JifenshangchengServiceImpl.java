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


import com.dao.JifenshangchengDao;
import com.entity.JifenshangchengEntity;
import com.service.JifenshangchengService;
import com.entity.vo.JifenshangchengVO;
import com.entity.view.JifenshangchengView;

@Service("jifenshangchengService")
public class JifenshangchengServiceImpl extends ServiceImpl<JifenshangchengDao, JifenshangchengEntity> implements JifenshangchengService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JifenshangchengEntity> page = this.selectPage(
                new Query<JifenshangchengEntity>(params).getPage(),
                new EntityWrapper<JifenshangchengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JifenshangchengEntity> wrapper) {
		  Page<JifenshangchengView> page =new Query<JifenshangchengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JifenshangchengVO> selectListVO(Wrapper<JifenshangchengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JifenshangchengVO selectVO(Wrapper<JifenshangchengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JifenshangchengView> selectListView(Wrapper<JifenshangchengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JifenshangchengView selectView(Wrapper<JifenshangchengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

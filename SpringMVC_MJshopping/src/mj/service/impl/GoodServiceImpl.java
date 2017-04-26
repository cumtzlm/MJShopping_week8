package mj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import mj.domain.Good;
import mj.mapper.GoodMapper;
import mj.service.GoodService;

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("goodService")
public class GoodServiceImpl implements GoodService{
	@Autowired
	private GoodMapper goodMapper;
	
	@Transactional(readOnly=true)
	@Override
	public List<Good> getAll() {
		return goodMapper.findAll();
	}

}

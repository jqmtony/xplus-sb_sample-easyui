package org.xplus.sample.serviceImpl.basic;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xplus.sample.entity.basic.Dept;
import org.xplus.sample.repository.basic.DeptRepository;
import org.xplus.sample.service.basic.DeptService;

@Service
public class DeptServiceImpl implements DeptService {
	
	private static final Logger log = LoggerFactory.getLogger(DeptServiceImpl.class);
	
	@Autowired
	DeptRepository deptRepository;

	@Override
	public List<Dept> findTree() {
		// TODO Auto-generated method stub
		return null;
	}
}

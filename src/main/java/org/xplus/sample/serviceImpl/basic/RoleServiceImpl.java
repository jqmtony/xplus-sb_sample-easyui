package org.xplus.sample.serviceImpl.basic;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.xplus.sample.entity.basic.Role;
import org.xplus.sample.service.basic.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	private static final Logger log = LoggerFactory.getLogger(RoleServiceImpl.class);

	@Override
	public Page<Role> findAll(int pageNumber, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Role> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}

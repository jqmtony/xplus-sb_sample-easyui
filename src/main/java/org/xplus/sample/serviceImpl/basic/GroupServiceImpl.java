package org.xplus.sample.serviceImpl.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.xplus.sample.entity.basic.Group;
import org.xplus.sample.service.basic.GroupService;

@Service
public class GroupServiceImpl implements GroupService {
	private static final Logger log = LoggerFactory.getLogger(GroupServiceImpl.class);

	@Override
	public Page<Group> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}

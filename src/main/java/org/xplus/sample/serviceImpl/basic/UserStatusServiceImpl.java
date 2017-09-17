package org.xplus.sample.serviceImpl.basic;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.xplus.sample.entity.basic.UserStatus;
import org.xplus.sample.repository.basic.UserStatusRepository;
import org.xplus.sample.service.basic.UserStatusService;

@Service
public class UserStatusServiceImpl implements UserStatusService {

	private static final Logger log = LoggerFactory.getLogger(UserStatusServiceImpl.class);

	@Autowired
	UserStatusRepository userStatusRepository;

	@Override
	public List<UserStatus> findAll() {
		return userStatusRepository.findAll();
	}

	@Override
	public List<UserStatus> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

}

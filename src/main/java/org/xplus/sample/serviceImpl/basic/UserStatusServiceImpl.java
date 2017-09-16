package org.xplus.sample.serviceImpl.basic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xplus.sample.entity.basic.UserStatus;
import org.xplus.sample.repository.basic.UserStatusRepository;
import org.xplus.sample.service.basic.UserStatusService;

@Service
public class UserStatusServiceImpl implements UserStatusService {

	@Autowired
	UserStatusRepository userStatusRepository;

	@Override
	public List<UserStatus> findAll() {
		return userStatusRepository.findAll();
	}

}

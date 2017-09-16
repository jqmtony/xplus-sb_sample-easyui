package org.xplus.sample.serviceImpl.system;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xplus.sample.entity.system.UserStatus;
import org.xplus.sample.repository.system.UserStatusRepository;
import org.xplus.sample.service.system.UserStatusService;

@Service
public class UserStatusServiceImpl implements UserStatusService {

	@Autowired
	UserStatusRepository userStatusRepository;

	@Override
	public List<UserStatus> findAll() {
		return userStatusRepository.findAll();
	}

}

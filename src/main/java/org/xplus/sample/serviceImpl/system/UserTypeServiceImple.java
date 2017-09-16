package org.xplus.sample.serviceImpl.system;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xplus.sample.entity.system.UserType;
import org.xplus.sample.repository.system.UserTypeRepository;
import org.xplus.sample.service.system.UserTypeService;

@Service
public class UserTypeServiceImple implements UserTypeService {

	private static final Logger log = LoggerFactory.getLogger(UserTypeServiceImple.class);

	@Autowired
	UserTypeRepository userTypeRepository;

	@Override
	public List<UserType> findAll() {
		return userTypeRepository.findAll();
	}

}

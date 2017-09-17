package org.xplus.sample.serviceImpl.basic;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.xplus.sample.entity.basic.UserType;
import org.xplus.sample.repository.basic.UserTypeRepository;
import org.xplus.sample.service.basic.UserTypeService;

@Service
public class UserTypeServiceImple implements UserTypeService {

	private static final Logger log = LoggerFactory.getLogger(UserTypeServiceImple.class);

	@Autowired
	UserTypeRepository userTypeRepository;

	@Override
	public List<UserType> findAll() {
		return userTypeRepository.findAll();
	}

	@Override
	public List<UserType> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

}

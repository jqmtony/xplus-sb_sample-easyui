package org.xplus.sample.serviceImpl.system;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xplus.sample.entity.system.Sex;
import org.xplus.sample.repository.system.SexRepository;
import org.xplus.sample.service.system.SexService;

@Service
public class SexServiceImpl implements SexService {

	private static final Logger log = LoggerFactory.getLogger(SexServiceImpl.class);
	
	@Autowired
	SexRepository sexRepository;

	@Override
	public List<Sex> findAll() {
		return sexRepository.findAll();
	}

}

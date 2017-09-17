package org.xplus.sample.serviceImpl.basic;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.xplus.sample.entity.basic.Sex;
import org.xplus.sample.repository.basic.SexRepository;
import org.xplus.sample.service.basic.SexService;

@Service
public class SexServiceImpl implements SexService {

	private static final Logger log = LoggerFactory.getLogger(SexServiceImpl.class);

	@Autowired
	SexRepository sexRepository;

	@Override
	public List<Sex> findAll() {
		return sexRepository.findAll();
	}

	@Override
	public List<Sex> findAll(Sort sort) {
		return sexRepository.findAll(sort);
	}

	@Override
	public List<Sex> findAll(Direction direction) {
		Sort sort = new Sort(direction, Arrays.asList(""));
		return sexRepository.findAll(sort);
	}

}

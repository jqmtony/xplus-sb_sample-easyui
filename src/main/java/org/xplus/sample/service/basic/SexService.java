package org.xplus.sample.service.basic;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.xplus.sample.entity.basic.Sex;

public interface SexService {

	List<Sex> findAll();
	
	List<Sex> findAll(Direction sort);

	List<Sex> findAll(Sort sort);
}

package org.xplus.sample.service.basic;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.xplus.sample.entity.basic.UserType;

public interface UserTypeService {
	
	List<UserType> findAll();

	List<UserType> findAll(Sort sort);
}

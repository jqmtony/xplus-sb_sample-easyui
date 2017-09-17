package org.xplus.sample.service.basic;

import org.springframework.data.domain.Page;
import org.xplus.sample.entity.basic.Group;

public interface GroupService {
	
	Page<Group> findAll();

}

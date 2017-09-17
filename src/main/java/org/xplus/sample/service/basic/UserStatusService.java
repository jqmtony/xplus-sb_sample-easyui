package org.xplus.sample.service.basic;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.xplus.sample.entity.basic.UserStatus;

/**
 * 
 * @author qiming.kong [C]
 *
 */
public interface UserStatusService {

	List<UserStatus> findAll();
	
	List<UserStatus> findAll(Sort sort);
}

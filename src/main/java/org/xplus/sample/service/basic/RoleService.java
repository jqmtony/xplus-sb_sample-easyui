package org.xplus.sample.service.basic;

import org.springframework.data.domain.Page;
import org.xplus.sample.entity.basic.Role;

/**
 * 
 * @author jqmtony
 * @version v1.0
 *
 */
public interface RoleService {
	
	Page<Role> findAll();
}

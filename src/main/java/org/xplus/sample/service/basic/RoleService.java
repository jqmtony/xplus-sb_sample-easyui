package org.xplus.sample.service.basic;

import java.util.List;

import org.springframework.data.domain.Page;
import org.xplus.sample.entity.basic.Role;

/**
 * 
 * @author jqmtony
 * @version v1.0
 *
 */
public interface RoleService {
	
	Page<Role> findAll(int pageNumber,int pageSize);
	List<Role> findAll();
}

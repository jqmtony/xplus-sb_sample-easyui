package org.xplus.sample.repository.basic;

import org.springframework.stereotype.Repository;
import org.xplus.sample.commons.base.repository.BaseRepository;
import org.xplus.sample.entity.basic.Role;

@Repository
public interface RoleRepository extends BaseRepository<Role, String> {

}

package org.xplus.sample.repository.system;

import org.springframework.stereotype.Repository;
import org.xplus.sample.commons.base.repository.BaseRepository;
import org.xplus.sample.entity.system.UserType;

@Repository
public interface UserTypeRepository extends BaseRepository<UserType, String> {

}

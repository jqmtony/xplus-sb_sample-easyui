package org.xplus.sample.repository.basic;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import org.xplus.sample.commons.base.repository.BaseRepository;
import org.xplus.sample.entity.basic.UserType;

@Repository
@Transactional(rollbackOn = Exception.class)
public interface UserTypeRepository extends BaseRepository<UserType, Integer> {

}

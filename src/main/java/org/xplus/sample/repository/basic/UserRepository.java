package org.xplus.sample.repository.basic;

import org.springframework.stereotype.Repository;
import org.xplus.sample.commons.base.repository.BaseRepository;
import org.xplus.sample.entity.basic.User;
import org.xplus.sample.repositoryImpl.basic.UserRepositoryCustom;

@Repository
public interface UserRepository extends BaseRepository<User, String> {

}

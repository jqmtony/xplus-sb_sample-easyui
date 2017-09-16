package org.xplus.sample.repository.system;

import org.springframework.stereotype.Repository;
import org.xplus.sample.commons.base.repository.BaseRepository;
import org.xplus.sample.entity.system.User;

@Repository
public interface UserRepository extends BaseRepository<User, String> {

}

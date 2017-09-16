package org.xplus.sample.repository.basic;

import org.springframework.stereotype.Repository;
import org.xplus.sample.commons.base.repository.BaseRepository;
import org.xplus.sample.entity.basic.Sex;

@Repository
public interface SexRepository extends BaseRepository<Sex, String> {

}

package org.xplus.sample.repository.basic;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import org.xplus.sample.commons.base.repository.BaseRepository;
import org.xplus.sample.entity.basic.Sex;

@Repository
@Transactional(rollbackOn = Exception.class)
public interface SexRepository extends BaseRepository<Sex, Integer> {

}

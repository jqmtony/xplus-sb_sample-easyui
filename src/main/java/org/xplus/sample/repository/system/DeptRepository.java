package org.xplus.sample.repository.system;

import org.springframework.stereotype.Repository;
import org.xplus.sample.commons.base.repository.BaseRepository;
import org.xplus.sample.entity.system.Dept;

@Repository
public interface DeptRepository extends BaseRepository<Dept, String> {

}

package org.xplus.sample.commons.base.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseRepository<T, ID extends Serializable>
		extends JpaRepository<T, Serializable>, CrudRepository<T, Serializable>, JpaSpecificationExecutor<T> {

}

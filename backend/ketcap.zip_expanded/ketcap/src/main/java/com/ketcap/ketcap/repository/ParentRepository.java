package com.ketcap.ketcap.repository;

import org.springframework.data.repository.CrudRepository;

import com.ketcap.ketcap.model.Parent;

public interface ParentRepository  extends CrudRepository<Parent, Long> {

	Parent findBySsn(Long ssn);

}

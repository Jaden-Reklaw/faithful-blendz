package com.fb.faithfulblendzbe.repository;

import com.fb.faithfulblendzbe.model.Religion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ReligionRepository extends CrudRepository<Religion, Integer> {
}


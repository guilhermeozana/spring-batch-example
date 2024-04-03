package com.gcampos.batch.adapter.repository;

import com.gcampos.batch.adapter.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {
}

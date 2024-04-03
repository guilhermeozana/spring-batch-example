package com.gcampos.batch.domain.port;

import com.gcampos.batch.domain.model.Student;

import java.util.List;

public interface StudentServicePort {

    List<Student> findAll();
}

package com.gcampos.batch.domain.service;

import com.gcampos.batch.domain.model.Student;
import com.gcampos.batch.domain.port.StudentRepositoryPort;
import com.gcampos.batch.domain.port.StudentServicePort;

import java.util.List;

public class StudentService implements StudentServicePort {

    private final StudentRepositoryPort studentRepositoryPort;

    public StudentService(StudentRepositoryPort studentRepositoryPort) {
        this.studentRepositoryPort = studentRepositoryPort;
    }

    @Override
    public List<Student> findAll() {
        return studentRepositoryPort.findAll();
    }
}

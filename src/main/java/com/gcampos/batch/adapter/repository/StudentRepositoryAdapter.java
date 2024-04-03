package com.gcampos.batch.adapter.repository;

import com.gcampos.batch.adapter.entity.StudentEntity;
import com.gcampos.batch.domain.model.Student;
import com.gcampos.batch.domain.port.StudentRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class StudentRepositoryAdapter implements StudentRepositoryPort {
    private final StudentRepository studentRepository;

    private final ModelMapper modelMapper;

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll()
                .stream()
                .map(student -> modelMapper.map(student, Student.class)).collect(Collectors.toList());
    }
}

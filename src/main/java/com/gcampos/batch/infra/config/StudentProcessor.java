package com.gcampos.batch.infra.config;

import com.gcampos.batch.adapter.entity.StudentEntity;
import org.springframework.batch.item.ItemProcessor;

public class StudentProcessor implements ItemProcessor <StudentEntity, StudentEntity>{

    @Override
    public StudentEntity process(StudentEntity student) throws Exception {

        return student;
    }
}

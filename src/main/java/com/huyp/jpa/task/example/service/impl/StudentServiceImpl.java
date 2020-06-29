package com.huyp.jpa.task.example.service.impl;

import com.huyp.jpa.task.example.model.vo.StudentVO;
import com.huyp.jpa.task.example.repo.StudentRepo;
import com.huyp.jpa.task.example.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * @author huyapeng
 * @date 2020/6/29
 * */
@Service
@Transactional(rollbackFor = RuntimeException.class)
@Slf4j
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public String updateVerisonById(Integer id) {
        Optional<StudentVO> studentVO1 = studentRepo.findById(id);
        log.info("studentVO1: " + studentVO1.get().toString());
        studentRepo.updateVerisonById(1);
        Optional<StudentVO> studentVO2 = studentRepo.findById(id);
        log.info("studentVO2: " + studentVO2.get().toString());
        return "OK";
    }
}

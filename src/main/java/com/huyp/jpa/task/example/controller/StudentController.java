package com.huyp.jpa.task.example.controller;

import com.huyp.jpa.task.example.service.StudentService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @ApiOperation(value="更新学生version通过ID", notes="更新")
    @PutMapping("/updateVerisonById")
    public String updateVerisonById(@RequestParam("id") Integer id) {
        return studentService.updateVerisonById(id);
    }

}

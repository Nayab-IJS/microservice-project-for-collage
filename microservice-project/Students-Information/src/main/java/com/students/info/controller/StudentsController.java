package com.students.info.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.students.info.service.StudentService;
import com.students.info.student.Students;

@RestController
@RequestMapping("/rest")
public class StudentsController {
	@Autowired
	StudentService studentsService;
	
  @GetMapping("/students")
    public List<Students>getAllStudents(){
	    return studentsService.getAllStudents();	
	}
  @PostMapping("/students")
    public Students createStudents(@RequestBody Students students){
	    return studentsService.createStudents(students);
	}
  @GetMapping("/students/{id}")
	public Students getStudentsById(@PathVariable Long id){	
	    return studentsService.getStudentsById(id);	
	}
  @PutMapping("/students/{id}")
	public ResponseEntity<Students> updateStudents(@PathVariable Long id,@RequestBody Students students){
	    return  studentsService.updateStudents(id , students);
	}
  @DeleteMapping("/students/{id}")
	public  ResponseEntity<HttpStatus> deletStudents(@PathVariable Long id){
		return studentsService.deleteStudents(id);
	}
}

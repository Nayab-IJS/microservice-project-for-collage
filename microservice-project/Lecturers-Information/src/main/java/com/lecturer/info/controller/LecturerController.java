package com.lecturer.info.controller;

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

import com.lecturer.info.lecturer.Lecturer;
import com.lecturer.info.service.LecturerService;

@RestController
@RequestMapping("/rest")
public class LecturerController {
	@Autowired
	LecturerService lecturersService;
	
  @GetMapping("/Lecturers")
    public List<Lecturer>getAllLecturers(){
	    return lecturersService.getAllLecturers();	
	}
  @PostMapping("/Lecturers")
    public Lecturer createLecturers(@RequestBody Lecturer lecturers){
	    return lecturersService.createLecturers(lecturers);
	}
  @GetMapping("/Lecturers/{id}")
	public Lecturer getLecturersById(@PathVariable Long id){	
	    return lecturersService.getLecturersById(id);	
	}
  @PutMapping("/Lecturers/{id}")
	public ResponseEntity<Lecturer> updateLecturers(@PathVariable Long id,@RequestBody Lecturer lecturers){
	    return  lecturersService.updateLecturers(id ,lecturers);
	}
  @DeleteMapping("/Lecturers/{id}")
	public  ResponseEntity<HttpStatus> deletLecturers(@PathVariable Long id){
		return lecturersService.deleteLecturers(id);
		
	}
}

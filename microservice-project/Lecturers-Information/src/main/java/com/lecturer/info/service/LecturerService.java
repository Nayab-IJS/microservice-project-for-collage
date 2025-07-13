package com.lecturer.info.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.lecturer.info.exception.ResoursNotFoundException;
import com.lecturer.info.lecturer.Lecturer;
import com.lecturer.info.repository.LecturerRepository;

@Service
public class LecturerService {
	
	@Autowired
	LecturerRepository lecturersRepository;
  public List<Lecturer>getAllLecturers(){
	return lecturersRepository.findAll();	
	}
  public Lecturer createLecturers(Lecturer lecturers){
	return lecturersRepository.save(lecturers) ;
	}
  public Lecturer getLecturersById(Long id){
	return lecturersRepository.findById(id).orElseThrow(()-> new ResoursNotFoundException("Id Not Found ") ) ;	
	}
  public ResponseEntity<Lecturer>updateLecturers(Long id,Lecturer lecturers){
	  Lecturer ltu= lecturersRepository.findById(id).orElseThrow(()-> new ResoursNotFoundException("Id Not Found ") ) ;
	  ltu.setFirstName(lecturers.getFirstName());
		ltu.setLastName(lecturers.getLastName());
		ltu.setAge(lecturers.getAge());
		ltu.setGender(lecturers.getGender());
		ltu.setEmail(lecturers.getEmail());
		ltu.setPhoneNo(lecturers.getPhoneNo());
		ltu.setJoinDate(lecturers.getJoinDate());
		ltu.setQualification(lecturers.getQualification());
		ltu.setDepartment(lecturers.getDepartment());
		ltu.setDesignation(lecturers.getDesignation());
		ltu.setSalary(lecturers.getSalary());
		ltu.setStatusUpdate(lecturers.getStatusUpdate());
		ltu.setCreatedAt(lecturers.getCreatedAt());
		ltu.setUpdatedAt(lecturers.getUpdatedAt());
		Lecturer updateLtu= lecturersRepository.save(ltu);
	return  ResponseEntity.ok(updateLtu);
   }
  public ResponseEntity <HttpStatus> deleteLecturers (long id){
	  Lecturer lecturers= lecturersRepository.findById(id).orElseThrow(()-> new ResoursNotFoundException("Employee Does Not Exist") ) ;
	  lecturersRepository.delete(lecturers);
	 return new ResponseEntity<>(HttpStatus.NO_CONTENT);	
	}
}

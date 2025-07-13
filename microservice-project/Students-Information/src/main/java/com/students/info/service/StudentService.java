package com.students.info.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.students.info.exception.ResoursNotFoundException;
import com.students.info.ropository.StudentRepositorty;
import com.students.info.student.Students;

@Service
public class StudentService {
	@Autowired
	StudentRepositorty studentsRepository;
public List<Students>getAllStudents(){
	return studentsRepository.findAll();	
	}
public Students createStudents(Students students){
	float  balance =students.getFeez() - students.getPaidFeez();
	students.setBalenceFeez(balance);
	return studentsRepository.save(students) ;
	}
public Students getStudentsById(Long id){
	return studentsRepository.findById(id).orElseThrow(()-> new ResoursNotFoundException("Id Not Found ") ) ;	
	}
public ResponseEntity<Students> updateStudents(Long id,Students students){
	  Students stu= studentsRepository.findById(id).orElseThrow(()-> new ResoursNotFoundException("Id Not Found ") ) ;
	  stu.setAdmissionNo(students.getAdmissionNo());
	  stu.setFirstName(students.getFirstName());
	  stu.setLastName(students.getLastName());
	  stu.setFatherName(students.getFatherName());
	  stu.setDateOfBirth(students.getDateOfBirth());
	  stu.setAge(students.getAge());
	  stu.setGender(students.getGender());
	  stu.setPhoneNo(students.getPhoneNo());
	  stu.setEmail(students.getEmail());
	  stu.setHousenoStreet(students.getHousenoStreet());
	  stu.setVillage(students.getVillage());
	  stu.setDistrict(students.getDistrict());
	  stu.setState(students.getState());
	  stu.setCountry(students.getCountry());
	  stu.setFeez(students.getFeez());
	  stu.setPaidFeez(students.getPaidFeez());
	  stu.setBalenceFeez(students.getBalenceFeez());
		Students updateStu= studentsRepository.save(stu);
	return  ResponseEntity.ok(updateStu);
 }
public ResponseEntity <HttpStatus> deleteStudents (long id){
	  Students students= studentsRepository.findById(id).orElseThrow(()-> new ResoursNotFoundException("Employee Does Not Exist") ) ;
	  studentsRepository.delete(students);
	 return new ResponseEntity<>(HttpStatus.NO_CONTENT);	
	}

}

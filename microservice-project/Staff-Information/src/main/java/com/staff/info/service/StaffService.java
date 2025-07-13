package com.staff.info.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.staff.info.exception.ResoursNotFoundException;
import com.staff.info.repository.StaffRepository;
import com.staff.info.staff.Staff;

@Service
public class StaffService {
	@Autowired
	StaffRepository staffRepository;
  public List<Staff>getAllStaff(){
	return staffRepository.findAll();	
	}
  public Staff createStaff(Staff staff){
	return staffRepository.save(staff) ;
	}
  public Staff getStaffById(Long id){
	return staffRepository.findById(id).orElseThrow(()-> new ResoursNotFoundException("Id Not Found ") ) ;	
	}
  public ResponseEntity<Staff>updateStaff(Long id,Staff staff){
	  Staff sta= staffRepository.findById(id).orElseThrow(()-> new ResoursNotFoundException("Id Not Found ") ) ;
	 sta.setFirstName(staff.getFirstName());
		sta.setLastName(staff.getLastName());
		sta.setAge(staff.getAge());
		sta.setGender(staff.getGender());
		sta.setEmail(staff.getEmail());
		sta.setPhoneNo(staff.getPhoneNo());
		sta.setHireDate(staff.getHireDate());
		sta.setPosition(staff.getPosition());
		sta.setDepartment(staff.getDepartment());
		sta.setSalary(staff.getSalary());
		sta.setStatusUpdate(staff.getStatusUpdate());
		sta.setCreatedAt(staff.getCreatedAt());
		sta.setUpdatedAt(staff.getUpdatedAt());
		Staff updatestaff= staffRepository.save(sta);
	return  ResponseEntity.ok(updatestaff);
   }
  public ResponseEntity <HttpStatus> deleteStaff (long id){
	  Staff staff= staffRepository.findById(id).orElseThrow(()-> new ResoursNotFoundException("Employee Does Not Exist") ) ;
	  staffRepository.delete(staff);
	 return new ResponseEntity<>(HttpStatus.NO_CONTENT);	
	}
}

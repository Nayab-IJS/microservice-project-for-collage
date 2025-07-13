package com.staff.info.controller;

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

import com.staff.info.service.StaffService;
import com.staff.info.staff.Staff;

@RestController
@RequestMapping("/rest")

public class StaffController {
	
		@Autowired
		StaffService staffService;
		
	  @GetMapping("/Staff")
	    public List<Staff>getAllStaff(){
		    return staffService.getAllStaff();	
		}
	  @PostMapping("/Staff")
	    public Staff createStaff(@RequestBody Staff staff){
		    return staffService.createStaff(staff);
		}
	  @GetMapping("/Staff/{id}")
		public Staff getStaffById(@PathVariable Long id){	
		    return staffService.getStaffById(id);	
		}
	  @PutMapping("/Staff/{id}")
		public ResponseEntity<Staff> updateStaff(@PathVariable Long id,@RequestBody Staff staff){
		    return  staffService.updateStaff(id ,staff);
		}
	  @DeleteMapping("/Staff/{id}")
		public  ResponseEntity<HttpStatus> deletStaff(@PathVariable Long id){
			return staffService.deleteStaff(id);
			
		}
	
	}

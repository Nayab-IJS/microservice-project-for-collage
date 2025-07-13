package com.staff.info.staff;

import java.time.LocalDate;


import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="staff_Info") 
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Staff {
 
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	
	private Long id ;
	@Column
    private String firstName;
	@Column
    private String lastName;
	@Column
    private int age;
	@Enumerated(EnumType.STRING)
	@Column(name = "gender")
	private Gender gender;
	@Column
	private String email;
	@Column
	private long phoneNo ;
	@Column
	private String address;
	@Column
	private LocalDate  hireDate ;
	@Column
	private String  position;
	@Column
	private String department;
	@Column
	private  float salary;
	@Enumerated(EnumType.STRING)
	@Column(name = "status_update")
	private StatusUpdate statusUpdate;
	@Column
	private LocalDateTime createdAt ;
	@Column
	private LocalDateTime updatedAt ;
	
	
	}
	
	
	


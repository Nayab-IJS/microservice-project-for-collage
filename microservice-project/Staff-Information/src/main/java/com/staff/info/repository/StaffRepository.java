package com.staff.info.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.staff.info.staff.Staff;

@Repository
public interface StaffRepository extends JpaRepository<Staff,Long> {

}

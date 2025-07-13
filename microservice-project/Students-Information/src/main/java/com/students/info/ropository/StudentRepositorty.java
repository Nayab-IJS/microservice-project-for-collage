package com.students.info.ropository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.students.info.student.Students;

@Repository
public interface StudentRepositorty extends JpaRepository<Students,Long> {

}

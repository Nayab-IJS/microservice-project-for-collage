package com.lecturer.info.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.lecturer.info.lecturer.Lecturer;

@Repository
public interface LecturerRepository extends JpaRepository<Lecturer,Long> {

}

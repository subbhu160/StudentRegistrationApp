package com.subh.studentregi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subh.studentregi.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>
{
	

}

package com.accenture.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.accenture.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

	
}

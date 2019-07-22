package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.StudentAcademicEntity;

public interface StudentAcademicDao extends JpaRepository<StudentAcademicEntity, Integer> {

}

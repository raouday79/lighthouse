package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.StudentDiplomaEntity;

public interface StudentDiplomaDao extends JpaRepository<StudentDiplomaEntity, Integer>{

}

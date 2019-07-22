package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.StudentLoginEntity;

public interface StudentLoginDao extends JpaRepository<StudentLoginEntity, Integer>{

}

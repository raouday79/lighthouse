package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.StudentFirstSemEntity;

public interface StudentFirstSemDao extends JpaRepository<StudentFirstSemEntity, Integer> {

}

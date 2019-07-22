package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.StudentHSCEntity;

public interface StudentHSCDao extends JpaRepository<StudentHSCEntity, Integer> {

}

package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.BranchEntity;

public interface BranchDao extends JpaRepository< BranchEntity , Integer>  {

}

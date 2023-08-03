package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Branch;

public interface BranchRepository extends CrudRepository<Branch, Long> {

}

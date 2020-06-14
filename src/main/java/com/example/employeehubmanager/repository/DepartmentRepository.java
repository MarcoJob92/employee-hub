package com.example.employeehubmanager.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.employeehubmanager.entity.Department;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Integer> {

}

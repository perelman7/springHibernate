package com.hibernateTest.hibernateTest.repository;

import com.hibernateTest.hibernateTest.model.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department, Integer> {
}

package com.project.professorallocation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.professorallocation.model.Department;
import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
	
	//SELECT * FROM department WHERE name = @name
	List<Department> findByNameLike (String partNameString);
	
	
}

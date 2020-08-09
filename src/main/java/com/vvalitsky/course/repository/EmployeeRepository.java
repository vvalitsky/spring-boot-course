package com.vvalitsky.course.repository;

import com.vvalitsky.course.entities.db.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Vladislav Valitsky at 09.08.2020
 */

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findAllByFirstName(String firstName);
}

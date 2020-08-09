package com.vvalitsky.course.service;

import com.vvalitsky.course.entities.dto.EmployeeDto;

import java.util.List;

/**
 * Created by Vladislav Valitsky at 09.08.2020
 */

public interface EmployeeService {
    List<EmployeeDto> getAllEmployees();
    EmployeeDto createEmployee(EmployeeDto employeeDto);
}

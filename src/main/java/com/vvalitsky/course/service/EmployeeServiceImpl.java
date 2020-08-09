package com.vvalitsky.course.service;

import com.vvalitsky.course.component.EmployeeConverter;
import com.vvalitsky.course.entities.db.Employee;
import com.vvalitsky.course.entities.dto.EmployeeDto;
import com.vvalitsky.course.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Vladislav Valitsky at 09.08.2020
 */

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeConverter employeeConverter;

    @Override
    public List<EmployeeDto> getAllEmployees() {
        return employeeRepository
            .findAll()
            .stream()
            .map(employeeConverter::convertToEmployeeDto)
            .collect(Collectors.toList());
    }

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = employeeConverter.convertToEmployee(employeeDto);
        return employeeConverter.convertToEmployeeDto(
            employeeRepository.save(employee)
        );
    }
}

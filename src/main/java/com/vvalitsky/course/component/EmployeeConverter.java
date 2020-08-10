package com.vvalitsky.course.component;

import com.vvalitsky.course.entities.db.Employee;
import com.vvalitsky.course.entities.dto.EmployeeDto;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Vladislav Valitsky at 09.08.2020
 */

@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class EmployeeConverter {

    private final ModelMapper objectMapper;

    public EmployeeDto convertToEmployeeDto(Employee employee) {
        EmployeeDto employeeDto = new EmployeeDto();
        objectMapper.map(employee, employeeDto);
        return employeeDto;
    }

    public Employee convertToEmployee(EmployeeDto employeeDto) {
        Employee employee = new Employee();
        objectMapper.map(employeeDto, employee);
        return employee;
    }
}

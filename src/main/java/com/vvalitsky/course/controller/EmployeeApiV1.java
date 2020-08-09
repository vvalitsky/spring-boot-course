package com.vvalitsky.course.controller;

import com.vvalitsky.course.entities.dto.EmployeeDto;
import com.vvalitsky.course.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Vladislav Valitsky at 09.08.2020
 */

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class EmployeeApiV1 implements EmployeeApi {

    private final EmployeeService employeeService;

    @GetMapping("/get-all-employees")
    public ResponseEntity<List<EmployeeDto>> getAllEmployees() {
        return ResponseEntity.ok(
            employeeService.getAllEmployees()
        );
    }

    @PostMapping("/create-employee")
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto) {
        return ResponseEntity.ok(
            employeeService.createEmployee(employeeDto)
        );
    }

}

package com.vvalitsky.course.controller;

import com.vvalitsky.course.entities.dto.EmployeeDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * Created by Vladislav Valitsky at 09.08.2020
 */

@Api(value = "EmployeeApi")
public interface EmployeeApi {

    @ApiOperation(
        httpMethod = "GET",
        value = "getAllEmployees",
        notes = "This method will return all employees"
    )
    ResponseEntity<List<EmployeeDto>> getAllEmployees();

    @ApiOperation(
        httpMethod = "POST",
        value = "createEmployee",
        notes = "This method will create employee"
    )
    ResponseEntity<EmployeeDto> createEmployee(
        @ApiParam(required = true)
        @RequestBody EmployeeDto employeeDto
    );
}

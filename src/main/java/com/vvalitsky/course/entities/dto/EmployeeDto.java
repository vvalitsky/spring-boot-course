package com.vvalitsky.course.entities.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Vladislav Valitsky at 09.08.2020
 */

@Data
@Builder
@ApiModel(
    value = "EmployeeDto",
    description = "An object that stores employee data"
)
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {

    @ApiModelProperty(value = "Employee id")
    private Long id;

    @ApiModelProperty(value = "Employee first name", required = true)
    private String firstName;

    @ApiModelProperty(value = "Employee last name", required = true)
    private String lastName;

    @ApiModelProperty(value = "Employee middle name", required = true)
    private String middleName;

    @ApiModelProperty(value = "Employee work number")
    private String workNumber;
}

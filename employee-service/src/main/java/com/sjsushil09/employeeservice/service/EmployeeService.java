package com.sjsushil09.employeeservice.service;

import com.sjsushil09.employeeservice.dto.APIResponseDto;
import com.sjsushil09.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    APIResponseDto getEmployeeById (Long employeeId);
}

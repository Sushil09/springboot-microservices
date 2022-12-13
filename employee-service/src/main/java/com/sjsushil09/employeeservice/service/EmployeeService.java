package com.sjsushil09.employeeservice.service;

import com.sjsushil09.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById (Long employeeId);
}

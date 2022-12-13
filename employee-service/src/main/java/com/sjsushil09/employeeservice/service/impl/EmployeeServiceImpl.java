package com.sjsushil09.employeeservice.service.impl;

import com.sjsushil09.employeeservice.dto.EmployeeDto;
import com.sjsushil09.employeeservice.entity.Employee;
import com.sjsushil09.employeeservice.repository.EmployeeRepository;
import com.sjsushil09.employeeservice.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto saveEmployee(EmployeeDto employeeDto) {
        Employee employee = new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );

        Employee persitEmployee = employeeRepository.save(employee);

        EmployeeDto savedEmployee = new EmployeeDto(
                persitEmployee.getId(),
                persitEmployee.getFirstName(),
                persitEmployee.getLastName(),
                persitEmployee.getEmail()
        );

        return savedEmployee;

    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
      Employee employee = employeeRepository.findById(employeeId).get();
      EmployeeDto employeeDto = new EmployeeDto(
              employee.getId(),
              employee.getFirstName(),
              employee.getLastName(),
              employee.getEmail()
      );
      return employeeDto;
    }
}

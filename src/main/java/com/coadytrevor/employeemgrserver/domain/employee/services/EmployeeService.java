package com.coadytrevor.employeemgrserver.domain.employee.services;

import com.coadytrevor.employeemgrserver.domain.core.exceptions.ResourceCreationException;
import com.coadytrevor.employeemgrserver.domain.core.exceptions.ResourceNotFoundException;
import com.coadytrevor.employeemgrserver.domain.employee.models.Employee;

import java.util.List;

public interface EmployeeService {
    Employee create(Employee employee) throws ResourceCreationException;
    Employee getById(Long id) throws ResourceNotFoundException;
    Employee getByEmail(String email) throws ResourceNotFoundException;
    List<Employee> getAll();
    Employee update(Long id, Employee employeeDetail) throws ResourceNotFoundException;
    void delete(Long id);
}

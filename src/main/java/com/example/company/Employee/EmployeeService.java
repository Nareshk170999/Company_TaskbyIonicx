package com.example.company.Employee;

import com.example.company.Department.DepartmentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public String newEmployee(EmployeeEntity employeeEntity) {
        employeeRepository.save(employeeEntity);
        return "New Employee is added";
    }

    public List<EmployeeEntity> getAll() {
      return employeeRepository.findAll();
    }

    public EmployeeEntity update(EmployeeEntity employeeEntity) {
        return employeeRepository.save(employeeEntity);
    }

    public String deleteId(int id) {
        employeeRepository.deleteById(id);
        return "Employee Id = "+id+"is Deleted";
    }
}

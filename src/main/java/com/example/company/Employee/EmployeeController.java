package com.example.company.Employee;

import com.example.company.Department.DepartmentEntity;
import com.example.company.Department.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/create")
    public String newEmployee(@RequestBody EmployeeEntity employeeEntity){
        return employeeService.newEmployee(employeeEntity);
    }
    @GetMapping("/getAll")
    public List<EmployeeEntity> getAll(){
        return employeeService.getAll();
    }
    @PutMapping("/update")
    public EmployeeEntity update(@RequestBody EmployeeEntity employeeEntity){
        return employeeService.update(employeeEntity);
    }
    @DeleteMapping("/deleteId/{id}")
    public String deleteId(@PathVariable int id){
        return employeeService.deleteId(id);
    }
}

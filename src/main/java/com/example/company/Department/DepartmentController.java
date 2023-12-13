package com.example.company.Department;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("department")
public class DepartmentController
{
    @Autowired
    DepartmentService departmentService;

    @PostMapping("/create")
    public String newDepartment(@RequestBody DepartmentEntity departmentEntity){
        return departmentService.newDepartment(departmentEntity);
    }
    @GetMapping("/getAll")
    public List<DepartmentEntity> getAll(){
        return departmentService.getAll();
    }
    @PutMapping("/update")
    public DepartmentEntity update(@RequestBody DepartmentEntity departmentEntity){
        return departmentService.update(departmentEntity);
    }
    @DeleteMapping("/deleteId/{id}")
    public String deleteId(@PathVariable int id){
        return departmentService.deleteId(id);
    }
}

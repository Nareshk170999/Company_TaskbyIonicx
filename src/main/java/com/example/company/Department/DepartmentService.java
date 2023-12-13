package com.example.company.Department;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;

    public String newDepartment(DepartmentEntity departmentEntity) {
        departmentRepository.save(departmentEntity);
        return "New Details Created";
    }

    public List<DepartmentEntity> getAll() {
        return departmentRepository.findAll();
    }

    public DepartmentEntity update(DepartmentEntity departmentEntity) {
        return departmentRepository.save(departmentEntity);
    }

    public String deleteId(int id) {
        departmentRepository.deleteById(id);
        return "This id = "+id+" is Deleted";
    }
}

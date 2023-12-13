package com.example.company.Employee;

import com.example.company.Department.DepartmentEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Employee")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String designation;


    @ManyToOne
    private DepartmentEntity departmentEntity;
}

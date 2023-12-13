package com.example.company.Department;

import com.example.company.Employee.EmployeeEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "Department")
public class DepartmentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(name = "department_id"), name = "department_id",referencedColumnName = "id")
    private List<EmployeeEntity> emp;
}

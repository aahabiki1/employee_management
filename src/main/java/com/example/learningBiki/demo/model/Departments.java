package com.example.learningBiki.demo.model;

import lombok.*;
import org.springframework.data.relational.core.mapping.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name ="departments", schema = "sys")
public class Departments {
    @Id
    @Column("department_id")
    private int departmentId;
    @Column("department_name")
    private String departmentName;
    @Column("location_id")
    private  int locationId;
}

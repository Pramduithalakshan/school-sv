package edu.icet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "teachers")
public class Teacher {
    @Id
    private Integer id;
    private String name;
    private String gender;
    private String contact;
    private String email;
    private String qualification;
    private Date hireDate;
    private Boolean isActive;
    private Integer mediumId;
    private Integer typeId;
    private Integer subjectId;
    private Integer employeeId;
    private Integer schoolId;
}

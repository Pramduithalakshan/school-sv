package edu.icet.entity;

import jakarta.persistence.*;
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
@Table(name = "students")
public class Student {
    @Id
    private Integer id;
    private Integer classId;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String gender;
    private String address;
    private String contact;
    private String email;
    private Date enrollmentDate;
    private Integer schoolId;
    private Integer hostelId;
    private Integer clubId;
    private Integer socityId;
}

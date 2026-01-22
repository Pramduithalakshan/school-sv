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
@Table(name = "staffs")
public class Staff {
    @Id
    private Integer id;
    private String firstName;
    private String lastName;
    private String gender;
    private Date dateOfBirth;
    private String address;
    private String contact;
    private String email;
    private Integer employeeId;
}

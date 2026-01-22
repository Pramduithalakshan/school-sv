package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StaffDto {
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

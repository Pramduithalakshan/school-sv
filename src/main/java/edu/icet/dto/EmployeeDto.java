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
public class EmployeeDto {
    private Integer id;
    private String role;
    private Date joinedDate;
    private Double basicSalary;
    private Double allowances;
    private Integer backAccount;
}

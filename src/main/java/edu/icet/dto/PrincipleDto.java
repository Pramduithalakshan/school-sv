package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PrincipleDto {
    private Integer id;
    private String contact;
    private String address;
    private Integer schoolId;
    private Integer employeeId;
}

package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CanteenDto {
    private Integer id;
    private String startTime;
    private String closeTime;
    private Integer schoolId;
}

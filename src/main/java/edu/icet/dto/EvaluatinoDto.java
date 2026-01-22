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
public class EvaluatinoDto {
    private Integer id;
    private Integer teacherId;
    private String evaluatedBy;
    private Integer score;
    private String feedback;
    private Date date;
}

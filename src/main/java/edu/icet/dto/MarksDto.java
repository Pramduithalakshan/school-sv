package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MarksDto {
    private Integer id;
    private Integer studentId;
    private Integer examId;
    private Integer marks;
    private String grade;
}

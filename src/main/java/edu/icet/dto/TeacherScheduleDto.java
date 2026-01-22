package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class TeacherScheduleDto {private Integer id;
    private Integer teacherId;
    private Integer classId;
    private Integer subjectId;
    private String  startTime;
    private String endTime;
}

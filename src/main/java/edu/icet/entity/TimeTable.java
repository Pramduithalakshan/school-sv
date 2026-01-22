package edu.icet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "time_tables")
public class TimeTable {
    @Id
    private Integer id;
    private Integer classId;
    private Integer subjectId;
    private Integer teacherId;
    private String dayOfWeek;
    private Integer periods;
    private String startTime;
    private String endTime;
    private Integer academicYearId;
    private Boolean isActive;
}

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
@Entity
@ToString
@Table(name = "teacher_trainings")
public class TeacherTrainnig {
    @Id
    private Integer id;
    private Integer teacherId;
    private String programName;
    private String provider;
    private Date startDate;
    private Date endDate;
    private String certification;
    private Integer schoolId;
}

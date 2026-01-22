package edu.icet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "teacher_attendance")
public class TeacherAttendance {
    @Id
    private Integer id;
    private Integer teacherId;
    private Date date;
    private String checkInTime;
    private String checkOutTime;
    private Integer schoolId;
}

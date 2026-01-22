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
@ToString
@Entity
@Table(name = "academic_years")
public class AcademicYear {
    @Id
    private Integer id;
    private Integer yearLabel;
    private Date startDate;
    private Date endDate;
    private Boolean isActive;
}

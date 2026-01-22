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
@Table(name = "evaluations")
public class Evaluation {
    @Id
    private Integer id;
    private Integer teacherId;
    private String evaluatedBy;
    private Integer score;
    private String feedback;
    private Date date;
}

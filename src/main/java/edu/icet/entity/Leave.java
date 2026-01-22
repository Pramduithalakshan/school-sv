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
@Table(name = "leaves")
public class Leave {
    @Id
    private Integer id;
    private Integer teacherId;
    private String type;
    private Date startDate;
    private String reason;
    private Boolean isApproved;
}

package edu.icet.entity;

import jakarta.persistence.*;
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
@Table(name = "schools")
public class School {
    @Id
    private Integer id;
    private String name;
    private Date establishmentDate;
    private String classification;
    private String email;
    private String webSiteUrl;
    private String contact;
    private Integer principleId;
    private Integer mediumId;
    private String vision;
    private String mission;
    private String flag;
    private Integer studentCapacity;
    private Integer teacherCapacity;
    private String type;
    private String motto;
    private String canteen;
    private Integer hostelId;
    private Integer clubId;
    private Integer societyId;
    private Integer eventId;
    private Integer sickRoomId;
}

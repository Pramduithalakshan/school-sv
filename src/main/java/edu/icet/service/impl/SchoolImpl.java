package edu.icet.service.impl;

import edu.icet.dto.SchoolDto;
import edu.icet.service.SchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class SchoolImpl implements SchoolService {
    private final JdbcTemplate jdbcTemplate;
    @Override
    public void addSchool(SchoolDto dto) {
        String sql = "INSERT INTO schools (id,school_name,established_date,classification,email,website_url" +
                ",contact_number,principalId,vision,mission,student_capacity,teacher_capacity,type,motto) VALUES" +
                "(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql,
                dto.getId(),
                dto.getName(),
                dto.getEstablishmentDate(),
                dto.getClassification(),
                dto.getEmail(),
                dto.getWebSiteUrl(),
                dto.getContact(),
                dto.getPrincipleId(),
                dto.getVision(),
                dto.getMission(),
                dto.getStudentCapacity(),
                dto.getTeacherCapacity(),
                dto.getType(),
                dto.getMotto()
                );
    }

    @Override
    public List<SchoolDto> getSchool() {
        String sql = "SELECT * FROM schools";
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(SchoolDto.class));
    }

    @Override
    public void deleteSchool(Integer id) {
        String sql = "DELETE FROM schools WHERE id=?";
        int rowAffected = jdbcTemplate.update(sql,id);
        if(rowAffected==0){
            throw  new IllegalArgumentException("School not found with id"+ id);
        }
    }

    @Override
    public SchoolDto searchSchool(Integer id) {
        String sql = "SELECT * FROM schools WHERE id=?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(SchoolDto.class),id);
    }
}

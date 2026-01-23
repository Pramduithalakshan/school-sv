package edu.icet.service.impl;

import edu.icet.dto.GradeDto;
import edu.icet.service.GradeService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
@RequiredArgsConstructor
@Service
public class GradeImpl implements GradeService {
    private final JdbcTemplate jdbcTemplate;
    @Override
    public void addGrade(@NonNull GradeDto dto) {
        String sql = "INSERT INTO grades (id," +
                ",name,isActive) VALUES" +
                "(?,?,?)";
        jdbcTemplate.update(sql,
                dto.getId(),
                dto.getName(),
                dto.getIsActive()
        );
    }

    @Override
    public List<GradeDto> getGrades() {
        String sql = "SELECT * FROM grades";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(GradeDto.class));
    }

    @Override
    public GradeDto searchGrade(Integer id) {
        String sql = "SELECT * FROM grades WHERE id=?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(GradeDto.class),id);
    }

    @Override
    public void deleteGrade(Integer id) {
        String sql = "DELETE FROM grades WHERE id=?";
        jdbcTemplate.update(sql,id);
    }
}

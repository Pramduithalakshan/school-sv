package edu.icet.service.impl;

import edu.icet.dto.ClassesDto;
import edu.icet.service.ClassesService;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ClassesImpl implements ClassesService {
    private final JdbcTemplate jdbcTemplate;
    @Override
    public void addClass(ClassesDto dto) {
        String sql = "INSERT INTO grades (id," +
                ",grade_id,class_name,isActive) VALUES" +
                "(?,?,?,?)";
        jdbcTemplate.update(sql,
                dto.getId(),
                dto.getGradeId(),
                dto.getName(),
                dto.getIsActive()
        );
    }

    @Override
    public List<ClassesDto> getClasses() {
        String sql = "SELECT * FROM classes";
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>());
    }

    @Override
    public ClassesDto searchClass(Integer id) {
        String sql = "SELECT * FROM classes WHERE id=?";
        return jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(ClassesDto.class),id);
    }

    @Override
    public void deleteClass(Integer id) {
        String sql = "DELETE FROM classes WHERE id=?";
        int rowAffected = jdbcTemplate.update(sql,id);
        if (rowAffected==0){
            throw new IllegalArgumentException("Class not found with id"+ id);
        }
    }
}

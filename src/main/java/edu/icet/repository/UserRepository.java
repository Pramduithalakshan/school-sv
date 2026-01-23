package edu.icet.repository;

import edu.icet.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class UserRepository {
    private final JdbcTemplate jdbcTemplate;
    public User findByUsername(String username){
        String sql = "SELECT * FROM users WHERE username=?";
        return jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(User.class),username);
    }
}

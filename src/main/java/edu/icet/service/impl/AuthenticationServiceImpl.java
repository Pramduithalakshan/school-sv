package edu.icet.service.impl;

import edu.icet.dto.AuthenticationResponse;
import edu.icet.dto.UserDto;
import edu.icet.entity.User;
import edu.icet.repository.UserRepository;
import edu.icet.security.ApplicationConfig;
import edu.icet.service.AuthenticationService;
import edu.icet.util.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private final UserRepository repository;
    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService;
    private final ApplicationConfig applicationConfig;
    private final JdbcTemplate jdbcTemplate;
    @Override
    public AuthenticationResponse register(UserDto userDto) {
        User user =  User.builder()
                .id(userDto.getId())
                .username(userDto.getUsername())
                .password(applicationConfig.passwordEncoder().encode(userDto.getPassword()))
                .role(userDto.getRole())
                .build();
        String sql = "INSERT INTO users(id,username,password,role) VALUES(?,?,?,?)";
        jdbcTemplate.update(sql,
                user.getId(),
                user.getUsername(),
                user.getPassword(),
                user.getRole()
                );

        String jwtToken = jwtService.generateToken(user.getUsername());
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }

    @Override
    public AuthenticationResponse authenticate(UserDto userDto) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(userDto.getUsername(),userDto.getPassword()
                )
        );
        String sql = "SELECT * FROM users WHERE username=?";
        User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), userDto.getUsername());

        assert user != null;
        String jwtToken = jwtService.generateToken(user.getUsername());
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }
}

package edu.icet.service;

import edu.icet.dto.SchoolDto;

import java.util.List;

public interface SchoolService {
    void addSchool(SchoolDto dto);
    List<SchoolDto> getSchool();
    void deleteSchool(Integer id);
    SchoolDto searchSchool(Integer id);
}

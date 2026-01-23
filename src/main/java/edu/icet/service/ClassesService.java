package edu.icet.service;

import edu.icet.dto.ClassesDto;

import java.util.List;

public interface ClassesService {
    void addClass(ClassesDto dto);
    List<ClassesDto> getClasses();
    ClassesDto searchClass(Integer id);
    void deleteClass(Integer id);
}

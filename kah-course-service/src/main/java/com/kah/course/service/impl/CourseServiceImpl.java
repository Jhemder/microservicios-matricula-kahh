package com.kah.course.service.impl;

import com.kah.course.dto.CourseDto;
import com.kah.course.entity.Course;
import com.kah.course.repository.CourseRepository;
import com.kah.course.service.ICourseService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements ICourseService {

    private final CourseRepository repository;

    public CourseServiceImpl(CourseRepository repository) {
        this.repository = repository;
    }

    private CourseDto toDto(Course c) {
        CourseDto dto = new CourseDto();
        dto.setId(c.getId());
        dto.setCodigo(c.getCodigo());
        dto.setNombre(c.getNombre());
        dto.setCiclo(c.getCiclo());
        dto.setHorario(c.getHorario());
        dto.setCapacidad(c.getCapacidad());
        return dto;
    }

    private Course toEntity(CourseDto dto) {
        Course c = new Course();
        c.setId(dto.getId());
        c.setCodigo(dto.getCodigo());
        c.setNombre(dto.getNombre());
        c.setCiclo(dto.getCiclo());
        c.setHorario(dto.getHorario());
        c.setCapacidad(dto.getCapacidad());
        return c;
    }

    @Override
    public List<CourseDto> listar() {
        return repository.findAll().stream().map(this::toDto).collect(Collectors.toList());
    }

    @Override
    public CourseDto guardar(CourseDto dto) {
        return toDto(repository.save(toEntity(dto)));
    }

    @Override
    public CourseDto buscarPorId(Long id) {
        return repository.findById(id).map(this::toDto).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}

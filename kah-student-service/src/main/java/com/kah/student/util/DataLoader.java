package com.kah.student.util;

import com.kah.student.entity.Student;
import com.kah.student.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final StudentRepository repository;

    public DataLoader(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (repository.count() == 0) {
            repository.save(new Student("Kevin", "Abarca", "12345678", "kevin@mail.com", "Sistemas", "ACTIVO", "VII"));
            repository.save(new Student("Luis", "Zambrano", "87654321", "luis@mail.com", "Industrial", "ACTIVO", "V"));
        }
    }
}

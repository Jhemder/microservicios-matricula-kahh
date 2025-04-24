package com.kah.course.util;

import com.kah.course.entity.Course;
import com.kah.course.repository.CourseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final CourseRepository repository;

    public DataLoader(CourseRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (repository.count() == 0) {
            repository.save(new Course(null, "INF101", "Algoritmos", "III", "8:00 - 10:00", 30));
            repository.save(new Course(null, "ADM202", "Marketing", "IV", "10:00 - 12:00", 25));
        }
    }
}

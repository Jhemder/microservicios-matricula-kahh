package com.kah.student.repository;

import com.kah.student.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    boolean existsByDocumento(String documento);
}

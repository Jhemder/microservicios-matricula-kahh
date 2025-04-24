package com.kah.enrollment;

import com.kah.enrollment.client.StudentClient;
import com.kah.enrollment.client.CourseClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackageClasses = { StudentClient.class, CourseClient.class })
public class KahEnrollmentServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(KahEnrollmentServiceApplication.class, args);
	}
}

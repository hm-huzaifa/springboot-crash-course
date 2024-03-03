package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student huz = new Student(
                    "Huz",
                    "huz@gmail.com",
                    LocalDate.of(2001, Month.OCTOBER, 5)
            );
            Student hsn = new Student(
                    "Hsn",
                    "hsn@gmail.com",
                    LocalDate.of(2004, Month.NOVEMBER, 24)
            );
            repository.saveAll(
                    List.of(huz, hsn)
            );
        };
    }
}

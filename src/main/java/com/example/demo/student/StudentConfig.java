package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student Mario = new Student(
                                "Mario",
                                "Mario@email.com",
                                LocalDate.of(1999, Month.AUGUST, 1)
            );

            Student Luigi =  new Student(
                                "Luigi",
                                "Luigi@email.com",
                                LocalDate.of(1997, Month.JANUARY, 27)
            );

            studentRepository.saveAll(
                    List.of(Mario, Luigi)
            );
        };
    }
}

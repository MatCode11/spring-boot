package com.example.demo.student;

import java.time.LocalDate;
import static java.time.Month.MARCH;
import static java.time.Month.OCTOBER;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mathew = new Student(
                    "Mathew",
                    "Mathew@gmail.com",
                    LocalDate.of(2007, OCTOBER, 02)
            );
            Student kenzou = new Student(
                    "Kenzou",
                    "Kenzou@gmail.com",
                    LocalDate.of(2019, MARCH, 1)
            );

            repository.saveAll(
                    List.of(mathew, kenzou)
            );
        };
    }

}

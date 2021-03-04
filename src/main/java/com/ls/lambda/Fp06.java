package com.ls.lambda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Fp06 {
    public static void main(String[] args) {
        SpringApplication.run(FP02Structured.class, args);

        List<String> courses = List.of("Spring", "Spring boot", "API", "Microservices", "AWS", "PCF","PCF", "AZURE", "DOCKER", "Kubernets");

//        courses.replaceAll(str -> str.toUpperCase()); exception beacuse is unmuttable

        List<String> modifyableCuorses = new ArrayList(courses);
        modifyableCuorses.replaceAll(s -> s.toUpperCase());
      modifyableCuorses.removeIf(s -> s.length() > 6);




    }
}

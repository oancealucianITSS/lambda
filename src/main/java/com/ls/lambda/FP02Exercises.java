package com.ls.lambda;

import org.springframework.boot.SpringApplication;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FP02Exercises {
    public static void main(String[] args) {
        SpringApplication.run(FP01Functional.class, args);
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);


        List<String> courses = List.of("Spring", "Spring boot", "API", "Microservices", "AWS", "PCF","PCF", "AZURE", "DOCKER", "Kubernets");

       List<Integer> listOfLenghts = listOfLenghts(courses);

        System.out.println(listOfLenghts);

    }

    private static List<Integer> listOfLenghts(List<String> courses) {

       return courses.stream()
                .map(String::length)
                .collect(Collectors.toList());
    }



}

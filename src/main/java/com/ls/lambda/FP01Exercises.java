package com.ls.lambda;

import org.springframework.boot.SpringApplication;

import java.util.Comparator;
import java.util.List;

public class FP01Exercises {
    public static void main(String[] args) {
        SpringApplication.run(FP01Functional.class, args);
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
//        printOddNumbers(numbers);


        List<String> courses = List.of("Spring", "Spring boot", "API", "Microservices", "AWS", "PCF","PCF", "AZURE", "DOCKER", "Kubernets");
//        printNoOfCharatersInListFunctional(courses);
     //   printcubesOfOddNumberInListFunctional(numbers);

        //ptint courses whic contains spring
//        courses.stream()
//                .filter(course -> course.contains("Spring"))
//                .forEach(System.out::println);

        //print courses whith at least 4 character
//        courses.stream()
//                .filter(course -> course.length() > 3)
//                .forEach(System.out::println);

        //Distinct and sorted
//        courses.stream()
//                .distinct()
//                .sorted()
//                .forEach(System.out::println);
    //comparator
//        courses.stream()
//                .sorted(Comparator.naturalOrder())
//                .forEach(System.out::println);
        //reversed order
//        courses.stream()
//                .sorted(Comparator.reverseOrder())
//                .forEach(System.out::println);
        //custom compare
        courses.stream()
                .sorted(Comparator.comparing(str -> str.length()))
                .forEach(System.out::println);
    }

    private static void printcubesOfOddNumberInListFunctional(List<Integer> numbers) {
        //How to loop the numbers?
        numbers.stream()
                .filter(number -> number % 2 != 0)
                .map(x -> x *x *x)
                .forEach(System.out::println);//Method reference
    }



    private static void printNoOfCharatersInListFunctional(List<String> courses) {
        courses.stream()
                .map(course -> course + " " + course.length())
                .forEach(System.out::println);//Method reference
    }


    private static void printOddNumbers(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 == 1)
                .forEach(System.out::println);
    }


}

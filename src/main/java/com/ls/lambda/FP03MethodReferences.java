package com.ls.lambda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.function.Supplier;

@SpringBootApplication
public class FP03MethodReferences {
    private static void print(String str){
        System.out.println(str);
    }


    public static void main(String[] args) {
        SpringApplication.run(FP02Structured.class, args);



        List<String> courses = List.of("Spring", "Spring boot", "API", "Microservices", "AWS", "PCF","PCF", "AZURE", "DOCKER", "Kubernets");

        courses.stream()
                .map(str -> str.toUpperCase())
//                .forEach( System.out::println);
                .forEach( FP03MethodReferences::print);

        courses.stream()
//                .map(str -> str.toUpperCase())
                .map(String::toUpperCase) //calling method on the object
//                .forEach( System.out::println);
                .forEach( FP03MethodReferences::print); //calling static method

        Supplier<String> supplier = () -> new String();
        Supplier<String> supplier2 = String::new;





    }
}

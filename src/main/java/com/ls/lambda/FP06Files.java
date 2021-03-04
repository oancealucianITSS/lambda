package com.ls.lambda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

@SpringBootApplication
public class FP06Files {
    public static void main(String[] args) throws IOException {
        SpringApplication.run(FP02Structured.class, args);

//        Files.lines(Paths.get("file.txt"))
//                .map(str -> str.split(" "))
//                .flatMap(Arrays::stream)
//                .distinct()
//                .sorted()
//                .forEach(System.out::println);

        Files.list(Paths.get("."))
                .filter(Files::isDirectory)
                .forEach(System.out::println);


    }
}

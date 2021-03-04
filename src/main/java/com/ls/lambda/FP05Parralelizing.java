package com.ls.lambda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.stream.LongStream;

@SpringBootApplication
public class FP05Parralelizing {
    public static void main(String[] args) {
        SpringApplication.run(FP02Structured.class, args);

        long time = System.currentTimeMillis();
        System.out.println(time);


    //    System.out.println( LongStream.range(0,100_000_000).sum());  //434 millisecodns
        System.out.println( LongStream.range(0,100_000_000).parallel().sum());  //64 milliseconds

        System.out.println(System.currentTimeMillis() -time);


    }
}

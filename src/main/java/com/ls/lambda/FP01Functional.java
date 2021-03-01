package com.ls.lambda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class FP01Functional {
    public static void main(String[] args) {
        SpringApplication.run(FP01Functional.class, args);
//        printAllNumberInListFunctional(List.of(12,9,13,4,6,2,4,12,15));
//        printEvenNumberInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
//        printSquaresOfEvenNumberInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
//        printcubesOfOddNumberInListFunctional(List.of(12, 9, 13, 4, 6, 2, 4, 12, 15));
    }

    private static void printAllNumberInListFunctional(List<Integer> numbers) {
        //How to loop the numbers?
        numbers.stream()
                .forEach(System.out::println);//Method reference
    }

    //even number with lambda
    private static void printEvenNumberInListFunctionalLambda(List<Integer> numbers) {
        //How to loop the numbers?
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);//Method reference
    }

    //even number classic
    private static void printEvenNumberInListFunctional(List<Integer> numbers) {
        //How to loop the numbers?
        numbers.stream()
                .filter(FP01Functional::printEvenNumberInListFunctional)
                .forEach(System.out::println);//Method reference
    }

    private static boolean printEvenNumberInListFunctional(Integer number) {
        //How to loop the numbers?
        return number % 2 == 0;
    }

    //we replaced it with wiht SYSTEM.out:println
//    private static void print(Integer number) {
//        System.out.println(number);
//    }

    private static void printSquaresOfEvenNumberInListFunctional(List<Integer> numbers) {
        //How to loop the numbers?
        numbers.stream()
                .filter(number -> number % 2 == 0)
                //mapping - x -> x*x
                .map(x -> x *x)
                .forEach(System.out::println);//Method reference
    }


}

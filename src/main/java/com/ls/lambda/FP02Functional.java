package com.ls.lambda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class FP02Functional {

    public static void main(String[] args) {
        SpringApplication.run(FP02Functional.class, args);

        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
//        int sum = sumOddWithReduce(numbers);

//        List<Integer> doubledNumbers = doubleList(numbers);
//        List<Integer> evenNumberList = evenNumberList(numbers);
        List<Integer> evenNumberList = evenNumberList(numbers);

        System.out.println(evenNumberList);
//
        //distinct and sorted
//        numbers.stream()
//                .distinct() //Stream<T> Intermediate operations
//                .sorted() //Stream<T>
//                .forEach(System.out::println); //void

    }

    private static List<Integer> doubleList(List<Integer> numbers) {

        return numbers.stream()
                .map(x -> x * x) //Stream<R>
                .collect(Collectors.toList()); //R   collection
    }

    private static List<Integer> evenNumberList(List<Integer> numbers) {

        return numbers.stream()
                .filter(number -> number % 2 == 0)//Stream<T>
                .collect(Collectors.toList());
    }


    private static int addListFunctional(List<Integer> numbers) {

        return numbers.stream()
                //Combine them into one result => one value
//				.reduce(0,FP02Functional::sum); // R
//				.reduce(0,(a, b) -> a+b);
//				.reduce(0,Integer::sum);
//                .reduce(0, (a, b) -> a > b ? a : b); //max for positive nuumbers
//                .reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b); //max (for any kind of number)
                .reduce(Integer.MAX_VALUE, (a, b) -> a > b ? b : a); //min (for any kind of number)

    }

    private static int sum(int a, int b) {
        return a + b;
    }

    //sqaures
    private static int sumOddWithReduce(List<Integer> numbers) {

        return numbers.stream()
                .filter(x -> x % 2 == 1)
                .reduce(0, Integer::sum); //min (for any kind of number)

    }


}

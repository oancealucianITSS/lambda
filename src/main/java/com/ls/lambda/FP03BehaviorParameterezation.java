package com.ls.lambda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@SpringBootApplication
public class FP03BehaviorParameterezation {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        SpringApplication.run(FP02Structured.class, args);

        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

//        filterAndPrint(numbers, x1 -> x1 % 2 == 0);
//
//        filterAndPrint(numbers, x -> x % 2 != 0);

//        filterAndPrint(numbers, x -> x % 3 == 0);


        List<Integer> squaredNumbers = mapAndCreateNewList(numbers, x -> x * x);
        List<Integer> cubesNumbers = mapAndCreateNewList(numbers, x -> x * x * x);
        List<Integer> doubledNumbers = mapAndCreateNewList(numbers, x -> x +x);
        System.out.println(doubledNumbers);

    }

    private static List<Integer> mapAndCreateNewList(List<Integer> numbers, Function<Integer, Integer> mappingFunction) {
        return numbers.stream()
                .map(mappingFunction)
                .collect(Collectors.toList());
    }

    private static void filterAndPrint(List<Integer> numbers, Predicate<Integer> oddPreicate) {
        numbers.stream()
                .filter(oddPreicate)
                .forEach(System.out::println);
    }
}

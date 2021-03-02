package com.ls.lambda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Random;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

@SpringBootApplication
public class FP03FunctionalInterfaces {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        SpringApplication.run(FP02Structured.class, args);

        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
//
//        Predicate<Integer> integerPredicate = x -> x % 2 == 0;
//
//        Function<Integer, Integer> integerFunction = x -> x * x;
//
//        Function<Integer, String> stringOutputFunction = x -> x * x + " ";
//
//        Consumer<Integer> sysoutConsumer = System.out::println;
//
//        BinaryOperator<Integer> sumBinaryOperator = (x, y) -> x + y;
//
        Supplier<Integer> randomIntegerSupplier = () -> {
            Random random = new Random();
            return random.nextInt(1000);

        };

        UnaryOperator<Integer> unaryOperator = (x) -> 3*x;

       // System.out.println(randomIntegerSupplier.get());
        System.out.println(unaryOperator.apply(10));

//        BiPredicate
//        BiFunction
//        BuConsumer

//        numbers.stream()
//                .filter(integerPredicate)
//                .map(integerFunction)
//                .forEach(sysoutConsumer);


//BinaryOperator
//        BinaryOperator<Integer> sumBinaryoperator =new BinaryOperator<Integer>(){
//
//            @Override
//            public Integer apply(Integer integer, Integer integer2) {
//                return integer + integer2;
//            }
//
//        };
//
//        numbers.stream()
//				.reduce(0, sumBinaryoperator);
////                .reduce(0,Integer::sum);
//
//
//
//    }
    }
}

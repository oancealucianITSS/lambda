package com.ls.lambda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Random;
import java.util.function.*;

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

        UnaryOperator<Integer> unaryOperator = (x) -> 3 * x;

        // System.out.println(randomIntegerSupplier.get());
        System.out.println(unaryOperator.apply(10));

        BiPredicate<Integer, String> biPredicate = (number, string) -> {
            return number < 10 && string.length() > 5;
        };

        System.out.println(biPredicate.test(15, "in28minutes"));


//        BiFunction
        BiFunction<Integer, String, String> biFunction = (number, string) -> {
            return number + string;
        };
        System.out.println(biFunction.apply(1, "lucian"));


//        BiConsumer
        BiConsumer<Integer, String> biConsumer = (i1, s2) -> {
            System.out.println(i1);
            System.out.println(s2);
        };
        biConsumer.accept(15, "adiretp");

        BinaryOperator<Integer> sumBinaryOp2 = (x, y) -> x + y;

        BinaryOperator<Integer> sumBinaryOp3 = ( x,  y) -> x + y;

        IntBinaryOperator intBinaryOperator = (x, y) -> x + y;//acum primeste int

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


        Consumer<String> consumer = (x) -> {
        };

        Consumer<String> consumer2 = (x) -> System.out.println(x);

        Consumer<String> consumer3 = (x) -> {
            System.out.println(x);
            System.out.println(x);
        };

        BiConsumer<String, String> biCons = (str1, str2) -> System.out.println(str1);

        Supplier<String> supplier = () -> {
            return "Ranga";
        };

        Predicate<Integer> predicate = (Integer x) -> x % 2 == 0;


    }
}

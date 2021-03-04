package com.ls.lambda;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

@NoArgsConstructor
@AllArgsConstructor
@Data
class Course {
    private String name;
    private String category;
    private int reviewScore;
    private int nofoStudents;

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", nofoStudents=" + nofoStudents +
                ", reviewScore=" + reviewScore +
                '}';
    }
}


@SpringBootApplication
public class FP04CustomClass {
    public static void main(String[] args) {
        SpringApplication.run(FP02Structured.class, args);
//
//
//        List<Course> courses = List.of(
//                new Course("Spring", "Framework", 98, 20000),
//                new Course("Spring Boot", "Framework", 95, 18000),
//                new Course("API", "Microservices", 97, 22000),
//                new Course("Microservices", "Microservices", 96, 25000),
//                new Course("Fullstack", "FullStack", 91, 14000),
//                new Course("AWS", "Cloud", 92, 21000),
//                new Course("AZURE", "Cloud", 99, 21000),
//                new Course("Docker", "Cloud", 92, 20000),
//                new Course("Kubernets", "Cloud", 91, 20000)
//        );
//
//        //allMacth, noneMatch, anyMatch
////        System.out.println(
////        courses.stream()
////                .allMatch(course -> course.getReviewScore() > 95));
//
//
//        Predicate<Course> reviewScoreGraterThen95Predicate = course -> course.getReviewScore() > 95;
//
//        Predicate<Course> reviewScoreGraterThen90Predicate = course -> course.getReviewScore() > 90;
//
//        Predicate<Course> reviewScoreLessThen90Predicate = course -> course.getReviewScore() < 90;
//
//        System.out.println(
//                courses.stream()
//                        .allMatch(reviewScoreGraterThen95Predicate));
//
//        System.out.println(
//                courses.stream()
//                        .noneMatch(reviewScoreLessThen90Predicate));
//
//        System.out.println(
//                courses.stream()
//                        .anyMatch(reviewScoreLessThen90Predicate));
//
//        System.out.println(
//                courses.stream()
//                        .anyMatch(reviewScoreGraterThen95Predicate));
//
//        Comparator<Course> comparingByNoOfStudentsIncreasing = Comparator.comparingInt(Course::getNofoStudents);
//        System.out.println(
//                courses.stream()
//                        .sorted(comparingByNoOfStudentsIncreasing).collect(Collectors.toList()));
//        //[Course{name='Fullstack', nofoStudents=14000, reviewScore=91}, Course{name='Spring Boot', nofoStudents=18000, reviewScore=95}, Course{name='Spring', nofoStudents=20000, reviewScore=98}, Course{name='Docker', nofoStudents=20000, reviewScore=92}, Course{name='Kubernets', nofoStudents=20000, reviewScore=91}, Course{name='AWS', nofoStudents=21000, reviewScore=92}, Course{name='AZURE', nofoStudents=21000, reviewScore=99}, Course{name='API', nofoStudents=22000, reviewScore=97}, Course{name='Microservices', nofoStudents=25000, reviewScore=96}]
//
//        Comparator<Course> comparingByNoOfStudentsDecreasing = Comparator.comparingInt(Course::getNofoStudents).reversed();
//        System.out.println(
//                courses.stream()
//                        .sorted(comparingByNoOfStudentsDecreasing).collect(Collectors.toList()));
//        //[Course{name='Microservices', nofoStudents=25000, reviewScore=96}, Course{name='API', nofoStudents=22000, reviewScore=97}, Course{name='AWS', nofoStudents=21000, reviewScore=92}, Course{name='AZURE', nofoStudents=21000, reviewScore=99}, Course{name='Spring', nofoStudents=20000, reviewScore=98}, Course{name='Docker', nofoStudents=20000, reviewScore=92}, Course{name='Kubernets', nofoStudents=20000, reviewScore=91}, Course{name='Spring Boot', nofoStudents=18000, reviewScore=95}, Course{name='Fullstack', nofoStudents=14000, reviewScore=91}]
//
//        Comparator<Course> comparingByNoOfStudentsAndNoOfRevies = Comparator.comparingInt(Course::getNofoStudents).thenComparing(Course::getReviewScore).reversed();
//        System.out.println(
//                courses.stream()
//                        .sorted(comparingByNoOfStudentsAndNoOfRevies).collect(Collectors.toList()));
////        [Course{name='Microservices', nofoStudents=25000, reviewScore=96}, Course{name='API', nofoStudents=22000, reviewScore=97}, Course{name='AZURE', nofoStudents=21000, reviewScore=99}, Course{name='AWS', nofoStudents=21000, reviewScore=92}, Course{name='Spring', nofoStudents=20000, reviewScore=98}, Course{name='Docker', nofoStudents=20000, reviewScore=92}, Course{name='Kubernets', nofoStudents=20000, reviewScore=91}, Course{name='Spring Boot', nofoStudents=18000, reviewScore=95}, Course{name='Fullstack', nofoStudents=14000, reviewScore=91}]
//
//        //limit, skip
//        System.out.println(
//                courses.stream()
//                        .sorted(comparingByNoOfStudentsAndNoOfRevies)
//                        .limit(5)
//                        .collect(Collectors.toList()));
////        [Course{name='Microservices', nofoStudents=25000, reviewScore=96}, Course{name='API', nofoStudents=22000, reviewScore=97}, Course{name='AZURE', nofoStudents=21000, reviewScore=99}, Course{name='AWS', nofoStudents=21000, reviewScore=92}, Course{name='Spring', nofoStudents=20000, reviewScore=98}]
//
//        System.out.println(
//                courses.stream()
//                        .sorted(comparingByNoOfStudentsAndNoOfRevies)
//                        .skip(3)
//                        .collect(Collectors.toList()));
////        [Course{name='AWS', nofoStudents=21000, reviewScore=92}, Course{name='Spring', nofoStudents=20000, reviewScore=98}, Course{name='Docker', nofoStudents=20000, reviewScore=92}, Course{name='Kubernets', nofoStudents=20000, reviewScore=91}, Course{name='Spring Boot', nofoStudents=18000, reviewScore=95}, Course{name='Fullstack', nofoStudents=14000, reviewScore=91}]
//
//        System.out.println(
//                courses.stream()
//                        .sorted(comparingByNoOfStudentsAndNoOfRevies)
//                        .skip(3)
//                        .limit(2)
//                        .collect(Collectors.toList()));
////        [Course{name='AWS', nofoStudents=21000, reviewScore=92}, Course{name='Spring', nofoStudents=20000, reviewScore=98}]
//
//        //takeWhile
//        System.out.println(courses);
//
//        System.out.println(
//                courses.stream()
//                        .takeWhile(course -> course.getReviewScore() >= 95)
//                        .collect(Collectors.toList()));
//
//        // dropWhile is oposite of takewhile
//        System.out.println(
//                courses.stream()
//                        .dropWhile(course -> course.getReviewScore() >= 95)
//                        .collect(Collectors.toList()));
//        //max -> return the last element using this criteria of operation
//        System.out.println(
//                courses.stream()
//                        .max(comparingByNoOfStudentsAndNoOfRevies));
//        //Optional[Course{name='Fullstack', nofoStudents=14000, reviewScore=91}]
//
//        //min -> return the first element using this criteria of operation
//        System.out.println(
//                courses.stream()
//                        .min(comparingByNoOfStudentsAndNoOfRevies));
////        Optional[Course{name='Microservices', nofoStudents=25000, reviewScore=96}]
//
//
//        ///OPtional
//        System.out.println(courses.stream()
//                .filter(reviewScoreLessThen90Predicate)
//                .min(comparingByNoOfStudentsAndNoOfRevies)
//                .orElse(new Course("Kubernets", "Cloud", 91, 20000)));
//
//
//        System.out.println(courses.stream()
//                .filter(reviewScoreLessThen90Predicate)
//                .findFirst());//Optional empty
//
//        System.out.println(courses.stream()
//                .filter(reviewScoreGraterThen95Predicate)
//                .findFirst());//Optional[Course{name='Spring', nofoStudents=20000, reviewScore=98}]
//
//        System.out.println(courses.stream()
//                .filter(reviewScoreGraterThen95Predicate)
//                .findAny());//Optional[Course{name='Spring', nofoStudents=20000, reviewScore=98}]
//
//
//        //sum, average
//        System.out.println(courses.stream()
//                .filter(reviewScoreGraterThen95Predicate)
//                .mapToInt(Course::getNofoStudents)
//                .sum());//8800
//
//        System.out.println(courses.stream()
//                .filter(reviewScoreGraterThen95Predicate)
//                .mapToInt(Course::getNofoStudents)
//                .average());//OptionalDouble[22000.0]
//
//
//        //count, max value, min value
//        System.out.println(courses.stream()
//                .filter(reviewScoreGraterThen95Predicate)
//                .mapToInt(Course::getNofoStudents)
//                .count());//4
//
//        System.out.println(courses.stream()
//                .filter(reviewScoreGraterThen95Predicate)
//                .mapToInt(Course::getNofoStudents)
//                .max());//OptionalInt[25000]
//
//        System.out.println(courses.stream()
//                .filter(reviewScoreGraterThen95Predicate)
//                .mapToInt(Course::getNofoStudents)
//                .min());//OptionalInt[20000]
//
//
//        //groupingBy , couting, max by reviewscor
//        System.out.println(
//                courses.stream()
//                        .collect(Collectors.groupingBy(Course::getCategory)));
////        {Cloud=[Course{name='AWS', nofoStudents=21000, reviewScore=92}, Course{name='AZURE', nofoStudents=21000, reviewScore=99}, Course{name='Docker', nofoStudents=20000, reviewScore=92}, Course{name='Kubernets', nofoStudents=20000, reviewScore=91}], FullStack=[Course{name='Fullstack', nofoStudents=14000, reviewScore=91}], Microservices=[Course{name='API', nofoStudents=22000, reviewScore=97}, Course{name='Microservices', nofoStudents=25000, reviewScore=96}], Framework=[Course{name='Spring', nofoStudents=20000, reviewScore=98}, Course{name='Spring Boot', nofoStudents=18000, reviewScore=95}]}
//
//        //how many  courses are by category?
//        System.out.println(
//                courses.stream()
//                        .collect(Collectors.groupingBy(Course::getCategory, Collectors.counting())));
////        {Cloud=4, FullStack=1, Microservices=2, Framework=2}
//
//        System.out.println(
//                courses.stream()
//                        .collect(Collectors.groupingBy(Course::getCategory,
//                                Collectors.maxBy(Comparator.comparing(Course::getReviewScore)))));
////        {Cloud=Optional[Course{name='AZURE', nofoStudents=21000, reviewScore=99}], FullStack=Optional[Course{name='Fullstack', nofoStudents=14000, reviewScore=91}], Microservices=Optional[Course{name='API', nofoStudents=22000, reviewScore=97}], Framework=Optional[Course{name='Spring', nofoStudents=20000, reviewScore=98}]}
//
//        System.out.println(
//                courses.stream()
//                        .collect(Collectors.groupingBy(Course::getCategory,
//                                Collectors.mapping(Course::getName, Collectors.toList()))));
////        {Cloud=[AWS, AZURE, Docker, Kubernets], FullStack=[Fullstack], Microservices=[API, Microservices], Framework=[Spring, Spring Boot]}
//
//
//        //Creating streams directly
//        //Diferenta este ca aici sunt Wrapper casses(Integer) fata de ex de pana acum cand transformam
//        //din list in stream care are date rimitive(int)
//        System.out.println(Stream.of(12, 9, 13, 4, 6, 2, 12, 15).count());
//
//        System.out.println(Stream.of(12, 9, 13, 4, 6, 2, 12, 15).reduce(Integer::sum));
//
//        //creating stream with primitive values
//        //pentru ca avem data primitve putem sa facem direct sum(),min(), etc
//        int[] numberArray = {12, 9, 13, 4, 6, 2, 12, 15};
//        Arrays.stream(numberArray).sum();
//        Arrays.stream(numberArray).average();
//        Arrays.stream(numberArray).min();
//        Arrays.stream(numberArray).max();
//
//
//        System.out.println(IntStream.range(1,10).sum());//the last number is not included
//        System.out.println(IntStream.rangeClosed(1,10).sum());//the last number is  included
//        IntStream.iterate(1,e -> e +2).limit(10).peek(System.out::println).sum();//peek ne permite sa ne uitam in stream(fiecrae element ) fara sa modifice ceva
//        IntStream.iterate(2,e -> e +2).limit(10).peek(System.out::println).sum();//even numbers
//        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        System.out.println(IntStream.iterate(2,e -> e *2).limit(10).peek(System.out::println).sum());
//
//        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        //conevrting primitive stream into a list(we cannot apply Collect for a primitive stream)
//        System.out.println(IntStream.iterate(2,e -> e *2).limit(10).boxed().collect(Collectors.toList()));
//
//
//        //BiInteger
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Long.MAX_VALUE);
//        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        System.out.println(LongStream.rangeClosed(1,50).reduce(1L,(x, y) -> x *y ));
//
//        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        System.out.println(LongStream.rangeClosed(1,50)
//                .mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE,BigInteger::multiply));
////        30414093201713378043612608166064768844377641568960512000000000000


       //flatMap
        List<String> courses = List.of("Spring", "Spring boot", "API", "Microservices", "AWS", "PCF","PCF", "AZURE", "DOCKER", "Kubernets");
        List<String> courses2 = List.of("Spring", "Spring boot", "API", "Microservices", "AWS", "PCF","PCF", "AZURE", "DOCKER", "Kubernets");
//        System.out.println(courses.stream()
//                .collect(Collectors.joining(", ")));
//
//        System.out.println(courses.stream()
//                .map(course -> course.split(""))
//                .flatMap(Arrays::stream)
//                .distinct()
//                .collect(Collectors.toList()));

//        System.out.println(courses.stream()
//                .flatMap(course -> courses2.stream().filter(course2 -> course2.length() == course.length()).map((course2 -> List.of(course,course2))))
//                .filter(list -> !list.get(0).equals(list.get(1)))
//                .collect(Collectors.toList()));
//


        //Higher order function is a function which returns a function

        Predicate<Course> reviewScoreGreaterThan95Predicate =
                createPredicateWithCutOffreviewSore(95);

        Predicate<Course> reviewScoreGreater90Predicate =
                createPredicateWithCutOffreviewSore(90);


        System.out.println( courses.stream()
                .peek(System.out::println)
                .filter(course -> course.length() >11)
                .map(String::toUpperCase)
                .peek(System.out::println)
                .findFirst());


    }
//this is call higher order function  ( we are returning a method from a method
    private static Predicate<Course> createPredicateWithCutOffreviewSore(int cutOffScore) {
        return course -> course.getReviewScore() > cutOffScore;
    }


}



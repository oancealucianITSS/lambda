package com.ls.lambda;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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


        List<Course> courses = List.of(
                new Course("Spring", "Framework", 98, 20000),
                new Course("Spring Boot", "Framework", 95, 18000),
                new Course("API", "Microservices", 97, 22000),
                new Course("Microservices", "Microservices", 96, 25000),
                new Course("Fullstack", "FullStack", 91, 14000),
                new Course("AWS", "Cloud", 92, 21000),
                new Course("AZURE", "Cloud", 99, 21000),
                new Course("Docker", "Cloud", 92, 20000),
                new Course("Kubernets", "Cloud", 91, 20000)
        );

        //allMacth, noneMatch, anyMatch
//        System.out.println(
//        courses.stream()
//                .allMatch(course -> course.getReviewScore() > 95));


        Predicate<Course> reviewScoreGraterThen95Predicate = course -> course.getReviewScore() > 95;

        Predicate<Course> reviewScoreGraterThen90Predicate = course -> course.getReviewScore() > 90;

        Predicate<Course> reviewScoreLessThen90Predicate = course -> course.getReviewScore() < 90;

        System.out.println(
                courses.stream()
                        .allMatch(reviewScoreGraterThen95Predicate));

        System.out.println(
                courses.stream()
                        .noneMatch(reviewScoreLessThen90Predicate));

        System.out.println(
                courses.stream()
                        .anyMatch(reviewScoreLessThen90Predicate));

        System.out.println(
                courses.stream()
                        .anyMatch(reviewScoreGraterThen95Predicate));

        Comparator<Course> comparingByNoOfStudentsIncreasing = Comparator.comparingInt(Course::getNofoStudents);
        System.out.println(
        courses.stream()
                .sorted(comparingByNoOfStudentsIncreasing).collect(Collectors.toList()));
        //[Course{name='Fullstack', nofoStudents=14000, reviewScore=91}, Course{name='Spring Boot', nofoStudents=18000, reviewScore=95}, Course{name='Spring', nofoStudents=20000, reviewScore=98}, Course{name='Docker', nofoStudents=20000, reviewScore=92}, Course{name='Kubernets', nofoStudents=20000, reviewScore=91}, Course{name='AWS', nofoStudents=21000, reviewScore=92}, Course{name='AZURE', nofoStudents=21000, reviewScore=99}, Course{name='API', nofoStudents=22000, reviewScore=97}, Course{name='Microservices', nofoStudents=25000, reviewScore=96}]

        Comparator<Course> comparingByNoOfStudentsDecreasing = Comparator.comparingInt(Course::getNofoStudents).reversed();
        System.out.println(
                courses.stream()
                        .sorted(comparingByNoOfStudentsDecreasing).collect(Collectors.toList()));
        //[Course{name='Microservices', nofoStudents=25000, reviewScore=96}, Course{name='API', nofoStudents=22000, reviewScore=97}, Course{name='AWS', nofoStudents=21000, reviewScore=92}, Course{name='AZURE', nofoStudents=21000, reviewScore=99}, Course{name='Spring', nofoStudents=20000, reviewScore=98}, Course{name='Docker', nofoStudents=20000, reviewScore=92}, Course{name='Kubernets', nofoStudents=20000, reviewScore=91}, Course{name='Spring Boot', nofoStudents=18000, reviewScore=95}, Course{name='Fullstack', nofoStudents=14000, reviewScore=91}]

        Comparator<Course> comparingByNoOfStudentsAndNoOfRevies = Comparator.comparingInt(Course::getNofoStudents).thenComparing(Course::getReviewScore).reversed();
        System.out.println(
                courses.stream()
                        .sorted(comparingByNoOfStudentsAndNoOfRevies).collect(Collectors.toList()));
//        [Course{name='Microservices', nofoStudents=25000, reviewScore=96}, Course{name='API', nofoStudents=22000, reviewScore=97}, Course{name='AZURE', nofoStudents=21000, reviewScore=99}, Course{name='AWS', nofoStudents=21000, reviewScore=92}, Course{name='Spring', nofoStudents=20000, reviewScore=98}, Course{name='Docker', nofoStudents=20000, reviewScore=92}, Course{name='Kubernets', nofoStudents=20000, reviewScore=91}, Course{name='Spring Boot', nofoStudents=18000, reviewScore=95}, Course{name='Fullstack', nofoStudents=14000, reviewScore=91}]

        //limit, skip
        System.out.println(
                courses.stream()
                        .sorted(comparingByNoOfStudentsAndNoOfRevies)
                        .limit(5)
                        .collect(Collectors.toList()));
//        [Course{name='Microservices', nofoStudents=25000, reviewScore=96}, Course{name='API', nofoStudents=22000, reviewScore=97}, Course{name='AZURE', nofoStudents=21000, reviewScore=99}, Course{name='AWS', nofoStudents=21000, reviewScore=92}, Course{name='Spring', nofoStudents=20000, reviewScore=98}]

        System.out.println(
                courses.stream()
                        .sorted(comparingByNoOfStudentsAndNoOfRevies)
                        .skip(3)
                        .collect(Collectors.toList()));
//        [Course{name='AWS', nofoStudents=21000, reviewScore=92}, Course{name='Spring', nofoStudents=20000, reviewScore=98}, Course{name='Docker', nofoStudents=20000, reviewScore=92}, Course{name='Kubernets', nofoStudents=20000, reviewScore=91}, Course{name='Spring Boot', nofoStudents=18000, reviewScore=95}, Course{name='Fullstack', nofoStudents=14000, reviewScore=91}]

        System.out.println(
                courses.stream()
                        .sorted(comparingByNoOfStudentsAndNoOfRevies)
                        .skip(3)
                        .limit(2)
                        .collect(Collectors.toList()));
//        [Course{name='AWS', nofoStudents=21000, reviewScore=92}, Course{name='Spring', nofoStudents=20000, reviewScore=98}]

        //takeWhile
        System.out.println(courses);

        System.out.println(
        courses.stream()
                .takeWhile(course -> course.getReviewScore() >=95)
                .collect(Collectors.toList()));

    // dropWhile is oposite of takewhile
        System.out.println(
                courses.stream()
                        .dropWhile(course -> course.getReviewScore() >=95)
                        .collect(Collectors.toList()));
    //max -> return the last element using this criteria of operation
        System.out.println(
        courses.stream()
                .max(comparingByNoOfStudentsAndNoOfRevies));
    //Optional[Course{name='Fullstack', nofoStudents=14000, reviewScore=91}]

        //min -> return the first element using this criteria of operation
        System.out.println(
                courses.stream()
                        .min(comparingByNoOfStudentsAndNoOfRevies));
//        Optional[Course{name='Microservices', nofoStudents=25000, reviewScore=96}]



        ///OPtional
        System.out.println(courses.stream()
                .filter(reviewScoreLessThen90Predicate)
                .min(comparingByNoOfStudentsAndNoOfRevies)
        .orElse( new Course("Kubernets", "Cloud", 91, 20000)));


        System.out.println(courses.stream()
                .filter(reviewScoreLessThen90Predicate)
                .findFirst());//Optional empty

        System.out.println(courses.stream()
                .filter(reviewScoreGraterThen95Predicate)
                .findFirst());//Optional[Course{name='Spring', nofoStudents=20000, reviewScore=98}]

        System.out.println(courses.stream()
                .filter(reviewScoreGraterThen95Predicate)
                .findAny());//Optional[Course{name='Spring', nofoStudents=20000, reviewScore=98}]

    }

}



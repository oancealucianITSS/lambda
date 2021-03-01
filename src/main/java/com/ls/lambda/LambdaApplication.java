package com.ls.lambda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class LambdaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LambdaApplication.class, args);
//		printAllNumberInListStructured(List.of(12,9,13,4,6,2,4,12,15));
		printEvenNumberInListStructured(List.of(12,9,13,4,6,2,4,12,15));
	}

//	private static void printAllNumberInListStructured(List<Integer> numbers) {
//		//How to loop the numbers?
//		for(int number: numbers){
//			System.out.println(number);
//		}
//	}

	private static void printEvenNumberInListStructured(List<Integer> numbers) {
		//How to loop the numbers?
		for(int number: numbers){
			if(number % 2 == 0) {
				System.out.println(number) ;
			}
		}
	}

}

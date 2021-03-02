package com.ls.lambda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class FP02Structured {

	public static void main(String[] args) {
		SpringApplication.run(FP02Structured.class, args);

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		int sum = addListStructured(numbers);

		System.out.println(sum);

	}

	private static int addListStructured(List<Integer> numbers) {

		//how to loop
		//how to store the sum

		int sum = 0;
		for(int number : numbers) {
			sum += number;
		}
		return  sum;
	}


}

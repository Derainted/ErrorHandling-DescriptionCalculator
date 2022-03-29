package com.example.demo;

public class CalcService {

	public String calculator(String n1, String n2, String op) {
		int result;

		int input1 = Integer.parseInt(n1);
		int input2 = Integer.parseInt(n2);

		switch (op) {
		case "add":
			result = input1 + input2;
			System.out.println(n1 + " + " + n2 + " = " + result);

			return Integer.toString(result);

		case "sub":
			result = input1 - input2;
			System.out.println(n1 + " - " + n2 + " = " + result);

			return Integer.toString(result);

		case "mul":
			result = input1 * input2;
			System.out.println(n1 + " * " + n2 + " = " + result);

			return Integer.toString(result);

		default:
			System.out.println("Invalid operator!");

			return "Invalid operator!";
		}
	}

}

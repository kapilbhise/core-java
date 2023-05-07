package com.programming.class1;

// selection statement switch case
public class SwitchCaseSelectionStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		grading('A');
		grading('B');
		grading('C');
		grading('D');
		grading('E');
		grading('F');
	}

	static void grading(char grade) {
		int success;
		switch (grade) {
		case 'A':
			System.out.println("Excellent grade");
			success = 1;
			break;
		case 'B':
		case 'C':
			System.out.println("Very good grade");
			success = 1;
			break;
		case 'D':
			System.out.println("Good grade");
			success = 1;
			break;
		case 'E':
			System.out.println("Poor grade");
			success = 0;
			break;
		default:
			System.out.println("Unknown result");
			success = -1;
		}
		result(success);
	}

	static void result(int g) {
		switch (g) {
		case 1:
			System.out.println("Passed");
			break;
		case 0:
			System.out.println("failed");
			break;

		case -1:
			System.out.println("Unknown result");
			break;
		}

	}

}

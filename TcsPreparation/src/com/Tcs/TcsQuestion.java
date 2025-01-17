package com.Tcs;

import java.util.Scanner;

public class TcsQuestion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Number of subjects
		final int NUM_SUBJECTS = 5;
		// Maximum marks per subject
		final int MAX_MARKS = 100;
		// Array to hold marks for each subjects
		int[] marks = new int[NUM_SUBJECTS];
		int totalMarks = 0;
		// Input marks for each subjects
		for (int i = 0; i < NUM_SUBJECTS; i++) {
			while (true) {
				System.out.println("Enter marks for subject" + (i + 1) + "(0 to " + MAX_MARKS + " ): ");
				marks[i] = sc.nextInt();
				if (marks[i] >= 0 && marks[i] <= MAX_MARKS) {
					totalMarks += marks[i];
					break;
				} else {
					System.out.println("Invaild input. Please enter marks between 0 and " + MAX_MARKS + " . ");
				}
			}

		}
		// Display the grades for each subject
		System.out.println("Subject Grades ");
		for (int i = 0; i < NUM_SUBJECTS; i++) {
			String grade = getGrade(marks[i]);
			System.out.println("Subject " + (i + 1) + ": " + grade);
		}
		// Display the total marks and final grade
		System.out.println("Total Marks: " + totalMarks + " / " + (NUM_SUBJECTS * MAX_MARKS));
		String finalGrade = getFinalGrade(totalMarks / NUM_SUBJECTS);
		System.out.println("Final Grade: " + finalGrade);
		sc.close();
	}

	// Method to determine the grade based on marks for each subject
	public static String getGrade(int marks) {
		if (marks > 90) {
			return "A+";
		} else if (marks > 80) {
			return "A";
		} else if (marks > 70) {
			return "B+";
		} else if (marks > 60) {
			return "B";
		} else if (marks < 40) {
			return "Failed";
		} else {
			return "C";
		}
	}

	// Method to determine the final grade based on average marks
	public static String getFinalGrade(int averageMarks) {
		if (averageMarks > 90) {
			return "A+";
		} else if (averageMarks > 80) {
			return "A";
		} else if (averageMarks > 70) {
			return "B+";
		} else if (averageMarks > 60) {
			return "B";
		} else if (averageMarks < 40) {
			return "Failed";
		} else {
			return "C";
		}
	}

}

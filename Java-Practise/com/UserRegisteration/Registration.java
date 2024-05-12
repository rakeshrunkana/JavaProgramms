package com.UserRegisteration;

import java.util.ArrayList;
import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {

		System.out.println("Welcome to ABC Travels && Logistcs ");
		System.out.println("Choose an action ");
		Scanner sc = new Scanner(System.in);
		System.out.println("1)-New User-Registeration");
		System.out.println("2)-Login!!");
		System.out.println("3)-Plan Journey");
		System.out.println("4)-Rescheduling Journey");
		System.out.println("5)-Exit From Application");
		int number = sc.nextInt();
		switch (number) {
		case 1:
			System.out.println("New User-Registration");
			uerAuthentication();
			break;
		case 2:
			System.out.println("Login!!");
			break;
		case 4:
			System.out.println("Plan Journey");
			break;
		case 5:
			System.out.println("Rescheduling Journey");
			break;
		case 6:
			System.out.println("Exit From Application");
			break;
		default:
			System.out.println("Invalid Choice ");
		}

	}

	public static void uerAuthentication() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your First Name: ");
		String firstName = scanner.nextLine();
		System.out.println("Enter Your Last Name: ");
		String lastName = scanner.nextLine();
		System.out.println("Enter Your Email Id: ");
		String email = scanner.nextLine();
		System.out.println("Enter Your PhoneNumber: ");
		String phoneNumber = scanner.nextLine();
		long otp=scanner.nextLong();
		System.out.println("Enter OTP: ");
		System.out.println("Registeration Sucessfull!!");
       
	}


	class UserEmail {

		private ArrayList<String> list;

		public UserEmail(ArrayList<String> list) {
			super();
			this.list = list;
			list.add("rakeshrunkana@gmail.com");
		}

	}

	@Override
	public String toString() {
		return "Registration []";
	}

}

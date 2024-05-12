package com.FinalKeyword;

class Bike {
	final void run() {
		System.out.println("running");
	}

	class Honda extends Bike {
		void run() { // Final Method cannot overriden
			System.out.println("running safely with 100kmph");
		}
	}
}

public class FinalMethod {

	public static void main(String[] args) {
		Honda honda = new Honda();
		honda.run();
	}

}
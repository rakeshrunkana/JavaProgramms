package com.SuperMethod;
class Animal1{
	Animal1(){
		System.out.println("animal is created ");
	}
}
class Dog1 extends Animal{
	Dog1(){
		super();
		System.out.println("dog is created");
	}
}
public class SuperConctructor {

	public static void main(String[] args) {
    Dog d = new Dog();
   
	}

}

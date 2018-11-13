package com.zsm.digitalGame;

public class DigitalGameDemo {

	public static void simpleOne() { //one
		String[] a = new String[100];
		for (int i = 1; i < 100; i++) {
			if(i % 3 == 0 && i % 5 == 0){
				a[i] = "FizzBuzz";
			}else if(i % 3 == 0){
				a[i] = "Fizz";
			}else if(i % 5 == 0){
				a[i] = "Buzz";
			}else{
				a[i] = String.valueOf(i);
			}
			System.out.println(a[i]);
		}
	}
	
	/*
	 * A number is FizzBuzz if it is divisible by 3 or 5 or if it has a 3 or 5 in it 
	 * should be change
	 * A number is FizzBuzz if it is divisible by 3 and 5 or (if it has a 3 and 5 in it)
	 */
	public static void simpleTwo() { //two
		String[] a = new String[100];
		for (int i = 1; i < 100; i++) {
			String temp = String.valueOf(i);
			if((i % 3 == 0 && i % 5 == 0) || (temp.contains("3") && temp.contains("5"))){
				a[i] = "FizzBuzz";
			}else if(i % 3 == 0 || temp.contains("3")){
				a[i] = "Fizz";
			}else if(i % 5 == 0 || temp.contains("5")){
				a[i] = "Buzz";
			}else{
				a[i] = String.valueOf(i);
			}
			System.out.println(a[i]);
		}
	}
}

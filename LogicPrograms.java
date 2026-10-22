package com.practice.methods;

public class LogicPrograms {

	public void fibonacciSeries() {
		
		int num1 = 0;
		int num2 = 1;
		
		System.out.println("Fibonacci Series : ");
		
		for(int i = 1; i<=10; i++) {
			
			int num3 = num1 + num2;
			
			System.out.print(num1 + " ");
			num1 = num2;
			num2 = num3;
			
		}
		
		System.out.println();
			
	}
	
	public void reverseNumber() {
		
		int num = 643;
		int temp = num;
		int rev = 0;
		
		while(num >= 1) {
			
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
			
		}
		
		System.out.println("Original Number = "+ temp);
		System.out.println("Reverse Number = "+rev);	
		
	}
	
	public void palindromNumber() {
		
		int num = 434;
		int temp = num;
		int rev = 0;
		
		while(num >= 1) {
			
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
			
		}
		
		if(rev == temp){
			
			System.out.println(temp+" is an Palindrom Number.");
			
		} else {
			
			System.out.println(temp+" is Not an Palindrom Number.");
			
		}
		
	}
	
	
	
	
}

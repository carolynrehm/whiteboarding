package com.revature;

public class FizzBuzz {
	
	/*
	 * Write a program that prints the numbers from 1 to 100. 
	 *  But for multiples of three print �Fizz� instead of the number 
	 *  and for the multiples of five print �Buzz�. For numbers 
	 *  which are multiples of both three and five print �FizzBuzz�.
	 *  
	 */
	
	public static void printFizzBuzz() {
		for(int i=1;i<101;i++) {
			if(i%3==0) {
				if(i%5==0) {
					System.out.println("FizzBuzz");
				}else {
					System.out.println("Fizz");					
				}
			}
			else if(i%5==0) {
				System.out.println("Buzz");
				
			}
			else {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		printFizzBuzz();
	}

}

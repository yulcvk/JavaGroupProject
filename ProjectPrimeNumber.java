package com.syntax.ProjectJava;

public class ProjectPrimeNumber {

	public static void main(String[] args) {
		
		int num=5;
		boolean number=false;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				number=true;
				break;
			}
			
		}
		if(!number)
			System.out.println(num+ " is a prime number");
		else
			System.out.println(num+" is not a prime number");

	}

}

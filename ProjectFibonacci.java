package com.syntax.ProjectJava;

public class ProjectFibonacci {

	public static void main(String[] args) {
		
		int first=0,second=1;
		
		for(int i=1;i<=10;i++) {
			System.out.print(first+ " ");
			
			int next=first+second;
			first=second;
			second=next;
		}

	}

}

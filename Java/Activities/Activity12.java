package com.ibm.Java_Maven;

interface Addable{
	
	public int add(int num1, int num2);
}

public class Activity12 {

	public static void main(String[] args) {
		
		
		Addable ad1 = (num1,num2) -> (num1+num2);
		System.out.println("Result of ad1: : "+ad1.add(12,30));
		
		Addable ad2 = (int num1, int num2) -> {
			return (num1+num2);
		};
		System.out.println("Result of ad2: "+ad2.add(10,20));

	}

}

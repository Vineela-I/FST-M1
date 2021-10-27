package com.ibm.Java_Maven;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		Random indexGen = new Random();
		System.out.println("Enter Integers into list: ");
		
		while(scan.hasNextInt()) {
        list.add(scan.nextInt());
		}
		
		Integer nums[] = list.toArray(new Integer[0]);
		int index = indexGen.nextInt(nums.length);
		System.out.println("Index is: "+index+" Value in Array: "+nums[index]);
		scan.close();
	}

}

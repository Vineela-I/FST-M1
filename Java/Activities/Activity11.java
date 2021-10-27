package activities;

import java.util.HashMap;

public class Activity11 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> colors = new HashMap<Integer, String>();
		colors.put(1, "Red");
		colors.put(2, "Blue");
		colors.put(3, "Green");
		colors.put(4, "Purple");
		colors.put(5, "Orange");
		System.out.println("Colors in Map: "+colors);
		System.out.println("Removed color: "+colors.remove(5));
		System.out.println("Is Green color present: "+colors.containsValue("Green"));
        System.out.println("Size of Map: "+colors.size());
	}

}

package activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {

	public static void main(String[] args) {
		List<String> myList = new ArrayList<>();
		myList.add("Rama");
		myList.add("Sita");
		myList.add("Hari");
		myList.add("Geetha");
		myList.add("Chitti");
		for(String list: myList) {
			System.out.println("List of Names: "+list);
		}
		System.out.println("3rd Name in List is: "+myList.get(2));
		if(myList.contains("Geetha")) {
			System.out.println("Name is Present");
		}else {
			System.out.println("Name is not Present");
		}
		System.out.println("No.of Name in the list: "+myList.size());
		myList.remove(4);
		System.out.println("No.of Name in the list after removing: "+myList.size());
	}

}

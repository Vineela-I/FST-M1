package activities;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<>();
		hs.add("car");
		hs.add("bike");
        hs.add("jeep");
        hs.add("Truck");
        hs.add("Cycle");
        hs.add("Jcb");
        
        System.out.println("Size of the hashset: "+hs.size());
        System.out.println("Remove Jcb from Set: "+hs.remove("Jcb"));
        if(hs.remove("bus"))
        	System.out.println("Bus is removed");
        else
        	System.out.println("Bus is not present");
        System.out.println("Is Jeep present in the Set: "+hs.contains("jeep"));
        	System.out.println("Updated set: "+hs);
        
	}

}

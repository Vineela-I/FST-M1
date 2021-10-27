package activities;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int array[] = {10,77,10,54,-11,10};
      int count = 0;
      for(int i = 0; i<array.length; i++) {
    	  if(array[i]==10) {
    		  count += 10;
    	  }
      }
    	  if(count == 30) {
    		  System.out.println(true);
    	  }else {
    		  System.out.println(false);
    	  }
      
	
	}

}

package activities;

import java.util.Arrays;

public class Activity4 {

	public static void main(String[] args) {
		
      int[] arr = {23,45,43,54,23,19};
      int i,j,k;
      System.out.println("Array before sorting: "+Arrays.toString(arr));
      for(i=0; i<arr.length; i++) {
    	  for(j = i+1; j<arr.length; j++) {
    		  if(arr[i]>arr[j]) {
        		  k= arr[i];
        		  arr[i]=arr[j];
        		  arr[j]=k;
        	  }  
    	  }
    	 
      }
      System.out.println("Array after soring: "+Arrays.toString(arr));
	}

}

package com.revature.sort;

public class BubbleSort {
	
	public static void sort(int[] arr) {
		
		int n = arr.length; 
        for (int i = 0; i < n-1; i++) {
        	int flag = 0;
            for (int j = 0; j < n-1-i; j++) {
                if (arr[j] > arr[j+1]) 
                { 
                    
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                    flag = 1;
	            }
	         }
            if(flag == 0) {
            	break;
            }
         }
      
	}
}


package com.myTask.sortingTask;

public class BubbleSort {
	
	 public void bubbleSort(int[] array) {
		 int temp, length = array.length;
		
		 //true until a pass contains no swap
		 while(true) {
			 boolean nothingToSort = true;
			 
			 //to perform single pass
			 
			 for(int i=1;i<length;i++) {
				 
				 //swap the values 
				 if(array[i]<array[i-1]) {
					 temp = array[i];
					 array[i]=array[i-1];
					 array[i-1] = temp;
					 nothingToSort=false;
				 }
			 }
			 if(nothingToSort==true) {
				 break;
			 }
		 }
		 
		 System.out.println("The Bubble sort is");
		 for(int i=0;i<length;i++) {
				System.out.print(array[i]+ "  ");
			}
	 }
   
}

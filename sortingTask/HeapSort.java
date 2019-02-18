package com.myTask.sortingTask;

public class HeapSort {
	
	 public void heapSort(int[] array1) {
		 
		 int temp, length = array1.length;
		 int[] array = new int[length+1];
		 array[0]=0;
		 
		 System.arraycopy(array1,0,array,1, length);
		 int size=length+1;
		 length +=1;
		 
		// loop to set the heap
		 
		 for(int i=2;i<length;i++) {
			
			 int parentIndex = i/2;
			 int childIndex = i;
			
			 while(array[childIndex]>array[parentIndex]) {
				 
				 temp = array[childIndex];
				 array[childIndex]= array[parentIndex];
				 array[parentIndex]=temp;
				 
				if(childIndex/2==1) {
					break;
				} else {
					childIndex/=2;
					parentIndex/=2;
				}
			 }
		 }
		 
	     // loop to perform heap sort
		 
		 for(int i=1;i<size-1;i++) {
			 
			 int parentIndex = 1;
			 int childIndex = 2, cIndex;
			 
			 //swap the 1st node and last node of each loop
			 temp = array[1];
			 array[1]= array[length-1];
			 array[length-1]=temp; 
			 
			 //to isolate the last sorted node
			 length = length-1;  
			 
			 // method to perform final loop to swap the last two sorted digits		 
			 if(i==(size-2)) {
				 break;
			 }
			 
			 
			 while(true) {
				 
				 //to check whether final right node exist
				 if((childIndex+1)==length) {
					 cIndex=childIndex;
				 } else {
					 cIndex=childIndex+1;
				 }
				 
				 //perform swap to bring down the smaller value from top of the heap 
				 if((array[parentIndex]<array[childIndex]) || (array[parentIndex]<array[cIndex])){
					 // for right node swap, if left node is greater
					 if((array[cIndex]<array[childIndex])) {
					 temp = array[childIndex];
					 array[childIndex]= array[parentIndex];
					 array[parentIndex]=temp;
					 parentIndex = childIndex;
					 childIndex = childIndex*2;
					 
					 if(childIndex>=(length-1)) {
						 break;
					 } 
					  // for left node swap, if right node is greater
					 }else {
						 temp = array[cIndex];
						 array[cIndex]= array[parentIndex];
						 array[parentIndex]=temp;
						 parentIndex = childIndex+1;
						 childIndex = (childIndex+1)*2;
						 if(childIndex>=(length-1)) {
							 break;
						 } 
					 }
					 
					 
				 } else {
					 break;
				 }
				 
			 }

		 }
		 
		 System.out.println("The Heap sort is");
		 for(int i=1;i<array.length;i++) {
				System.out.print(array[i]+ "  ");
				
			} 
	 }
     

}

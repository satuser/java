package com.myTask.sortingTask;

public class QuickSort {
	
	public int[] quickSort(int[] array, int leftIndex, int rightIndex) {

		int pivotValue = array[leftIndex],pivotIndex = leftIndex, temp, leftIndexCopy = leftIndex, rightIndexCopy=rightIndex;
		
		// to check if the array contains more than one number
		if(leftIndex!=rightIndex) {
	
		// to order the array as per the pivot value and perform divide and conquer
		while(true) {
			
		// to check if the sorting is done and pivot is in place 
		if((rightIndex==leftIndex)&&(rightIndex==pivotIndex)){
			
			//to call quick sort to perform left part of pivot value
			if(leftIndex!=leftIndexCopy) {
				if((pivotIndex-1)>=0) {
			quickSort(array, leftIndexCopy, pivotIndex-1);	
	     	}}
			
			//to call quick sort to perform right part of pivot value
			if(rightIndex!=rightIndexCopy) {
			quickSort(array, pivotIndex+1,rightIndexCopy);
			}
			break;}
		
		//this part will execute until pivot will move to the exact required posiont
		else
		if(pivotIndex==leftIndex) {
		
		//this will compare right Index to pivot
		if(pivotValue<array[rightIndex]) {
			temp = array[pivotIndex];
			array[pivotIndex] = array[rightIndex];
			array[rightIndex] = temp;
			pivotIndex = rightIndex;		
		}
		else{
		//if the values don't swap, this makes the right index to one position back
			rightIndex--;
		}
		}
		else
		
		//this will compare left index tp pivot
		if(pivotIndex==rightIndex) {
		if(pivotValue>array[leftIndex]) {
			temp = array[pivotIndex];
			array[pivotIndex] = array[leftIndex];
			array[leftIndex] = temp;
			pivotIndex = leftIndex;
		}
		else {
	    //if the values don't swap, this makes the left index to one position forward
		   leftIndex++;
		}
		}
		}
		}
			
      return array;}}
	
	
		 


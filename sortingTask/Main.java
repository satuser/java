package com.myTask.sortingTask;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BubbleSort bubbleSort = new BubbleSort();
		HeapSort heapSort = new HeapSort();
		QuickSort quickSort = new QuickSort();
	
		System.out.print("Enter the size of the array:");
		int length=scanner.nextInt();
		int[] array = new int[length];
		System.out.print("Enter the values of the array:");
		for(int i=0;i<length;i++) {
			array[i]=scanner.nextInt();
		}
		
		
		System.out.println("1. Bubble Sort\n"+
		                   "2. Heap Sort\n"+
				           "3. Quick Sort\n"+
		                   "Choose one option to perform:");
		int value = scanner.nextInt();
		
		if(value<1||value>3)
		{
			System.out.println("Enter a valid option!");
		} else {
			
			if(value==1) {
			bubbleSort.bubbleSort(array);
			} 
			
			else if(value==2) {
			heapSort.heapSort(array);
			} 
			
			else if(value==3) {
				int array1[] = new int[length];
				array1=quickSort.quickSort(array, 0, length-1);
				System.out.println("The Quick sort is:");
				for(int i= length-1;i>=0;i--) {
					System.out.print(array1[i] + "  ");
				}
			}				
		}
		
		
     scanner.close();
	}

}

package com.btc;
import java.util.Arrays;

public class BubbleSort {
public static void sort(int []arr) {
	int size = arr.length;
	for(int i =0;i < size-1; i++) {
		for(int j =0;j<size-i-1;j++) 
			if(arr[j]> arr[j+1]) {
				int temp = arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}		
	}
}
	
public static void main(String[] args) {
	int []arr = {10,15,20,5,25};
	BubbleSort.sort(arr);
	System.out.println("Sorted elements in Ascending order");
	System.out.println(Arrays.toString(arr));
	
}
}	


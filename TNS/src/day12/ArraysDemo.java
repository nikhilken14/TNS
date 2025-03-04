package day12;

import java.util.Arrays;

public class ArraysDemo {
	public static void main(String[] args) {
		int [] arr= {12,34,6,8,20};
		
		System.out.println(Arrays.toString(arr));
		
		for(int num:arr) {
			System.out.print(num+" ");
		}
		System.out.println();
		
		Arrays.sort(arr);
		System.out.print(Arrays.toString(arr));
		System.out.println();
		
		System.out.println(Arrays.binarySearch(arr, 12));
		
		int []arr2=new int[4];
		Arrays.fill(arr2, 12);
		System.out.println(Arrays.toString(arr2));
	}
}

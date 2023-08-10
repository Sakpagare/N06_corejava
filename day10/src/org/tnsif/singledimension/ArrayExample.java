package org.tnsif.singledimension;
// program to demonstrate on 1D array using compile-time input
public class ArrayExample {

	public static void main(String[] args) {
		//array initialization at the compile-time
		// TODO Auto-generated method stub
		int arr[] = {66,33,21,6,1};
		System.out.println(arr[1]);
		System.out.println("Array elements are: ");
		for(int i:arr)
		{
			System.out.println(i+" ");
		}
	}

}

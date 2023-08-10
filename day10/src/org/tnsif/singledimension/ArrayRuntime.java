package org.tnsif.singledimension;
import java.util.Arrays;
import java.util.Scanner;
//program to demonstrate on 1D array using run-time input
public class ArrayRuntime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n=new Scanner(System.in);
		System.out.println("enter the total no. of elements using the array: ");
		int num = n.nextInt();
		int arr[]=new int[num];
		for(int i=0;i<num;i++) {
			arr[i]=n.nextInt();
			}
		{
			System.out.println(arr[num]+" ");
		}
		int max=arr[0];
		for(int i=0;i<num;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Largest element in array: "+max);
		Arrays.sort(arr);
		System.out.println("sorted elements are: ");
		for(int i:arr)
		{
			System.out.println(i+" ");
		}
		

	}

}

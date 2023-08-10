package org.tnsif.singledimension;

public class ArrayofObjectsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee arr[]=new Employee[3];
		arr[0]=new Employee(101,"sakshi",67000.45);
		arr[1]=new Employee(102,"smita",67000.45);
		arr[2]=new Employee(103,"sneha",67000.45);
		for(int i=0;i<3;i++)
		{
			System.out.println(arr[i].getID()+" "+arr[i].getName()+" "+arr[i].getSalary());
		}


	}

}

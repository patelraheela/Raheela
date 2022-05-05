import java.util.*;
//import java.util.Scanner;
public class Array {
	public static void main(String args[])
	{
		int a[]=new int[5];
	System.out.println("Enter array elements: ");
	Scanner s= new Scanner(System.in);
	for(int i=0;i<5;i++)
	{
	
	a[i]=s.nextInt();
	
	}
	System.out.println("Array elements before sort:");
	for(int b:a)
	{
		
		System.out.println(b);
	}
	System.out.println("Array elements After sort:");
	Arrays.sort(a);
	for(int b:a)
	{
		System.out.println(b);
	}
	}
}
                                      
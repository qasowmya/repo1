package practise.pgms;

import java.util.Scanner;

public class OneDimensionalArray {

	/*public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int asize=sc.nextInt();
		int[] a=new int[asize];
		int sum=0;
		System.out.println("enter the elements in the array");
		for(int i=0;i<a.length;i++)
		{
		a[i]=sc.nextInt();
		System.out.println("a["+i+"]="+a[i]);
		sum=sum+a[i];
	}
		System.out.println("sum of elemnts in the array is  "+sum);
sc.close();
}*/
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] a=new int[4];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		
		char[] a1= {'a','e','i','o','u'};
		//String[] a2;
		//a2=new String[]{"hi","hello","bye"};
		String[] a2=new String[3];
		System.out.println("Elements in the Intetger Array are");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("Elemnets in the Character Array are");
		for(int i=0;i<a1.length;i++)
		{
			System.out.println(a1[i]);
		}
		//System.out.println("Elements in the String Array are");
		System.out.println("enter the elements in the array ");
		for(int i=0;i<a2.length;i++)
		{
			a2[i]=sc.nextLine();
			System.out.println(a2[i]);
		}
		
		sc.close();
	}
}	

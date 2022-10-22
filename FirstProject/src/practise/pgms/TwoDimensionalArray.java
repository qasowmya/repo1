package practise.pgms;

import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int rowsize,columnsize;
		System.out.println("enter the array row size");
		rowsize=sc.nextInt();
		System.out.println("enter the array column size");
		columnsize=sc.nextInt();
		int[][] a=new int[rowsize][columnsize];
		System.out.println("enter the elements in the array");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
				System.out.println("a["+rowsize+"]["+columnsize+"]="+a[rowsize][columnsize]);
			}
		}
		sc.close();
	}

}

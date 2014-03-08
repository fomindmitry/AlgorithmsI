package org.coursera.algorithms1.lib;

import java.util.Arrays;

public class Selection extends BasicSort
{
	public static void sort(Comparable[] a)
	{
		int N = a.length;
		for (int i = 0; i < N; i++)
		{
			int min = i;
			for (int j = i+1; j < N; j++)
				if (less(a[j], a[min]))
					min = j;
			exch(a, i, min);
		}
	}
	protected static void exch(Comparable[] a, int i, int j)
	{ 
		Comparable swap = a[i];
		a[i] = a[j];
		a[j] = swap;
//		System.out.println("exchange "+(++exchcnt));
		
//		for (Comparable comp : a) {
//			
//			System.out.print(comp);
//			System.out.print(' ');			
//		}
//		System.out.println(' ');

		for( int k=0; k<comparearray.length;k++ ) {
			if(Arrays.equals(a,comparearray[k])) {
				System.out.println("Selection for k="+k);
			}
			
		}
	}
}

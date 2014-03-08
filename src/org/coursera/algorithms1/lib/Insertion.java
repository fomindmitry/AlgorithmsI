package org.coursera.algorithms1.lib;

import java.util.Arrays;

public class Insertion extends BasicSort {

	public static void sort(Comparable[] a)
	{
		int N = a.length;
		for (int i = 0; i < N; i++)
			for (int j = i; j > 0; j--)
				if (less(a[j], a[j-1]))
					exch(a, j, j-1);
				else break;
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
	}
		
}


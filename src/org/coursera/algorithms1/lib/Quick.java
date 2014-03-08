package org.coursera.algorithms1.lib;

import org.coursera.algorithms1.stdlib.StdRandom;

public class Quick extends BasicSort
{
	public static int partition(Comparable[] a, int lo, int hi)
	{
		int i = lo, j = hi+1;
		while (true)
		{
			while (less(a[++i], a[lo]))
				if (i == hi) break;
			while (less(a[lo], a[--j]))
				if (j == lo) break;

			if (i >= j) break;
			exch(a, i, j);
		}
		exch(a, lo, j);
		return j;
	} 

	public static void sort(Comparable[] a)
	{
		StdRandom.shuffle(a);
		sort(a, 0, a.length - 1);
	}

	private static void sort(Comparable[] a, int lo, int hi)
	{
		if (hi <= lo) return;
		int j = partition(a, lo, hi);
		sort(a, lo, j-1);
		sort(a, j+1, hi);
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

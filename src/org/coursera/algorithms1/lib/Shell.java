package org.coursera.algorithms1.lib;

import java.util.Arrays;

public class Shell extends BasicSort
{
	public static void sort(Comparable[] a)
	{
		int N = a.length;
		int h = 1;
		while (h < N/3) h = 3*h + 1; // 1, 4, 13, 40, 121, 364, ...
		while (h >= 1)
		{ // h-sort the array.
			//System.out.println("Sorting array with h="+h);
			for (int i = h; i < N; i++)
			{
				for (int j = i; j >= h && less(a[j], a[j-h]); j -= h)
					exch(a, j, j-h);
			}
			/*for (Comparable i : a) {
				System.out.print(i);
				System.out.print(' ');
			}*/
			//System.out.println("Sorting array with h="+h+" finishied");

			h = h/3;
		}
	}
	protected static void exch(Comparable[] a, int i, int j)
	{ 
		Comparable swap = a[i];
		a[i] = a[j];
		a[j] = swap;
		//System.out.println("exchange "+(++exchcnt));
		
//		for (Comparable comp : a) {
//			
//			System.out.print(comp);
//			System.out.print(' ');			
//		}
//		System.out.println(' ');

		for( int k=0; k<comparearray.length;k++ ) {
			if(Arrays.equals(a,comparearray[k])) {
				System.out.println("Shell for k="+k);
			}
			
		}
	}
}
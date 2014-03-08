package org.coursera.algorithms1.lib;

public abstract class BasicSort {

	public static String[][] comparearray = null;

	protected static int exchcnt=0;

	protected static boolean less(Comparable v, Comparable w)
	{ 
		return v.compareTo(w)<0;
	}
	
	protected static boolean isSorted(Comparable[] a)
	{
		return isSorted(a,0,a.length-1);
	}

	protected static boolean isSorted(Comparable[] a, int lo, int hi)
	{	
		for (int i = lo; i < hi; i++) 
			if (!less(a[i], a[i+1])) {
				System.out.println("a["+i+"]="+a[i]+"<a["+(i+1)+"]="+a[i+1]);
				return false;
			}
		return true;
	}
}

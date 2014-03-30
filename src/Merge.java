

import java.util.Arrays;

public class Merge extends BasicSort
{
	protected static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi)
	{
		//System.out.println("Merge called("+lo+","+mid+","+hi+")");
		assert isSorted(a, lo, mid); // precondition: a[lo..mid] sorted
		assert isSorted(a, mid+1, hi); // precondition: a[mid+1..hi] sorted
		for (int k = lo; k <= hi; k++)
			aux[k] = a[k];
		int i = lo, j = mid+1;
		for (int k = lo; k <= hi; k++) 
		{
			if (i > mid) a[k] = aux[j++];
			else if (j > hi) a[k] = aux[i++];
			else if (less(aux[j], aux[i])) a[k] = aux[j++];
			else a[k] = aux[i++];
		}
		for( int k=0; k<comparearray.length;k++ ) {
			if(Arrays.equals(a,comparearray[k])) {
				System.out.println("Merge for k="+k);
			}
			
		}
		System.out.println("");
		assert isSorted(a, lo, hi); // postcondition: a[lo..hi] sorted
	} 

	private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi)
	{
		if (hi <= lo) return;
		int mid = lo + (hi - lo) / 2;
		sort(a, aux, lo, mid);
		sort(a, aux, mid+1, hi);
		merge(a, aux, lo, mid, hi);	
		
	}
	public static void sort(Comparable[] a)
	{
		Comparable[] aux = new Comparable[a.length];
		sort(a, aux, 0, a.length - 1);
	}
	
	protected static boolean isSorted(Comparable[] a, int lo, int hi)
	{
		if (comparearray != null){
			for( int k=0; k<comparearray.length;k++ ) {
				if(Arrays.equals(a,comparearray[k])) {
					System.out.println("Merge for k="+k);
				}

			}
		}
		for (int i = lo; i < hi; i++) 
			if (!less(a[i], a[i+1])) {
				System.out.println("a["+i+"]="+a[i]+"<a["+(i+1)+"]="+a[i+1]);
				return false;
			}
		return true;
	}

}
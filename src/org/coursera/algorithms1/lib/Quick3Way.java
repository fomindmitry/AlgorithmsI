package org.coursera.algorithms1.lib;

import org.coursera.algorithms1.stdlib.StdRandom;

public class Quick3Way extends BasicSort
{
	public static void sort(Comparable[] a)
	{
		StdRandom.shuffle(a);
		sort(a, 0, a.length - 1);
	}
	
	
	public static void partition(Comparable[] a, PartitionRange p ) 
	{
		int lt = p.getLo(), gt = p.getHi();
		Comparable v = a[p.getLo()]; 
		int i = p.getLo(); 
		while (i <= gt) 
		{ 
			int cmp = a[i].compareTo(v); 
			if (cmp < 0) exch(a, lt++, i++); 
			else if (cmp > 0) exch(a, i, gt--); 
			else i++; 
		}
		p.setLo(lt);
		p.setHi(gt);
	}
	
	private static void sort(Comparable[] a, int lo, int hi) 
	{ 
		if (hi <= lo) return;
		PartitionRange p = new PartitionRange(hi,lo);
		
		partition(a,p);
	
		sort(a, lo, p.getLo() - 1); 
		sort(a, p.getHi() + 1, hi); 
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

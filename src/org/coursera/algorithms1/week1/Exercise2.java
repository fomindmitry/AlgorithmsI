package org.coursera.algorithms1.week1;

import org.coursera.algorithms1.lib.QuickFindUF;
import org.coursera.algorithms1.lib.WeightedQuickUnionUF;

public class Exercise2 {
	//3-5 5-7 7-8 7-9 9-0 7-2
	public static void main(String[] args) {
		
/*
 *   
      0 1 2 3 4 5 6 7 8 9 
      0 1 2 3 4 5 6 7 8 9 

6-5:  0 1 2 3 4 6 6 7 8 9 
	  0 1 2 3 4 6 6 7 8 9 

4-7:  0 1 2 3 4 6 6 4 8 9 
	  0 1 2 3 4 6 6 4 8 9 

0-2:  0 1 0 3 4 6 6 4 8 9 
	  0 1 0 3 4 6 6 4 8 9 

1-8:  0 1 0 3 4 6 6 4 1 9 
	  0 1 0 3 4 6 6 4 1 9 


1-3:  0 1 0 1 4 6 6 4 1 9
	  0 1 0 1 4 6 6 4 1 9

6-4:  0 1 0 1 6 6 6 4 1 9
	  0 1 0 1 6 6 6 6 1 9 
  

1-2:  1 1 0 1 6 6 6 4 1 9 
7-0:  1 1 0 1 6 6 1 4 1 9 
0-9:  1 1 0 1 6 6 1 4 1 1 
 * 
 * 		
 */
		WeightedQuickUnionUF qf = new WeightedQuickUnionUF(10);
		qf.union(2, 4);
		qf.union(3, 7);
		qf.union(7, 2);
		qf.union(0, 6);
		qf.union(6, 8);
		qf.union(8, 9);
		qf.union(5, 8);
		qf.union(4, 8);
		qf.union(0, 1);
		System.out.println(qf.toString());		
	}
}

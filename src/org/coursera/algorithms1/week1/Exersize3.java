package org.coursera.algorithms1.week1;

import org.coursera.algorithms1.lib.QuickFindUF;
import org.coursera.algorithms1.lib.QuickUnionUF;
import org.coursera.algorithms1.lib.WeightedQuickUnionUF;

public class Exersize3 {
	//3-5 5-7 7-8 7-9 9-0 7-2
	public static void main(String[] args) {
		
		
		
		
		int[] id1={4,9,0,4,8,0,7,4,8,4};
		
		int[] id2={0,2,2,6,2,5,6,7,8,9};
		
		int[] id3={3,3,3,9,3,7,7,3,7,8};
		
		int[] id4={8,1,3,1,8,8,7,0,1,9};
		
		int[] id5={4,4,7,7,7,1,7,7,7,4};

		

 

		System.out.println(new QuickUnionUF(id1).toString());
		System.out.println("1!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println(new QuickUnionUF(id2).toString());
		System.out.println("2!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		//System.out.println(new QuickUnionUF(id3).toString());
		System.out.println("3!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println(new QuickUnionUF(id4).toString());
		System.out.println("4!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println(new QuickUnionUF(id5).toString());
		System.out.println("5!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
 
// 
//		int[] id6={7,1,3,0,0,5,5,5,0,3};
//		
//		int[] id7={4,5,1,4,4,4,5,3,1,6};
//		
//		
//		System.out.println("6!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//		System.out.println(new QuickUnionUF(id6).toString());
//		System.out.println("7!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//		System.out.println(new QuickUnionUF(id7).toString());
//
// 
		
		

		
		
/*		
		WeightedQuickUnionUF wqf=new WeightedQuickUnionUF(10);
		//5-6 8-2 2-4 7-2 1-9 1-6 3-1 0-8 7-3
		wqf.union(5, 6);
		wqf.union(8, 2);
		wqf.union(2, 4);
		wqf.union(7, 2);
		wqf.union(1, 9);
		wqf.union(1, 6);
		wqf.union(3, 1);
		wqf.union(0, 8);
		wqf.union(7, 3);
		System.out.println(wqf.toString());
		
	*/	
		
		
		
	}
}

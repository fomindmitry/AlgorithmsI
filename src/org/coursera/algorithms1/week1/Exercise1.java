package org.coursera.algorithms1.week1;

import org.coursera.algorithms1.lib.QuickFindUF;
import org.coursera.algorithms1.lib.WeightedQuickUnionUF;

public class Exercise1 {
	//6-5 4-7 0-2 1-8 1-3 6-4 1-2 7-0 0-9
	public static void main(String[] args) {
		QuickFindUF qf = new QuickFindUF(10);
		qf.union(0, 9);
		qf.union(3, 4);
		qf.union(2, 9);
		qf.union(1, 6);
		qf.union(0, 6);
		qf.union(6, 5);
		System.out.println(qf.toString());
	}
}

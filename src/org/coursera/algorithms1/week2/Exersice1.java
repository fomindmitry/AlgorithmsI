package org.coursera.algorithms1.week2;

import org.coursera.algorithms1.lib.*;

public class Exersice1 {
	public static void main(String[] args) { 
		{
			Integer[] array = {28,29,34,79,96,39,46,11,68,91};
			
			
			Insertion.sort(array);
			
			for (Integer i : array) {
				System.out.print(i);
				System.out.print(' ');
			}
		}
//		{
//			Integer[] array = {66,97,96,86,17,27,28,71,65,61};
//			
//			
//			Shell.sort(array);
//			
//			for (Integer i : array) {
//				System.out.print(i);
//				System.out.print(' ');
//			}
//		}
		
		
	}

}

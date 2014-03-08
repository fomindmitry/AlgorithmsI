package org.coursera.algorithms1.week3;

import org.coursera.algorithms1.lib.*;

public class Exersice1 {
	/**
	 * @param args
	 */
	
	static final String[] array1={"pear","ceil","gold","aqua","silk","bone","mist","plum","bole","buff","bark","palm"};
	static final String[] array2={"aqua","ceil","gold","pear","bone","silk","mist","plum","bole","buff","bark","palm"};
	static final String[] array3={"aqua","ceil","gold","pear","bone","mist","plum","silk","bark","bole","buff","palm"};
	static final String[] array4={"aqua","bone","ceil","gold","pear","silk","bole","mist","plum","bark","buff","palm"};
	static final String[] array5={"aqua","bone","ceil","gold","pear","silk","bole","mist","plum","buff","bark","palm"};
	static final String[] array6={"aqua","bark","bole","bone","buff","ceil","gold","mist","palm","pear","plum","silk"};

	
	static final String[][] array={{},array2,array3,array4,array5,array6,{}};
	
	/**
	 * @param args
	 */
	public static void main(String[] args) { 
		{
			
			Integer[] array = {52,37,65,44,78,52,83,99,52,52};
			
			Quick3Way.partition(array, new PartitionRange(array.length-1, 0));
			
			for (Integer i : array) {
				System.out.print(i);
				System.out.print(' ');
			}
			System.out.println("");
			
			
//			Quick3Way.sort(array);
			
//			for (Integer i : array) {
//				System.out.print(i);
//				System.out.print(' ');
//			}
//			System.out.println("");
		}
		
		
	}

}

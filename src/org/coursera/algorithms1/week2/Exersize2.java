package org.coursera.algorithms1.week2;


import org.coursera.algorithms1.lib.*;



public class Exersize2 {
	
	static final String[] array1={"kiwi","dove","oryx","lion","toad","sole","goat","mule","mole","hoki","lamb","bear","seal","wolf","slug","bass"};
	static final String[] array2={"bass","bear","dove","goat","hoki","kiwi","lamb","lion","mole","mule","oryx","toad","seal","wolf","slug","sole"};
	static final String[] array3={"dove","goat","kiwi","lion","mule","oryx","sole","toad","mole","hoki","lamb","bear","seal","wolf","slug","bass"};
	static final String[] array4={"kiwi","dove","bass","bear","mole","hoki","goat","lion","seal","sole","lamb","mule","toad","wolf","slug","oryx"};
	static final String[] array5={"dove","kiwi","lion","oryx","sole","toad","goat","mule","mole","hoki","lamb","bear","seal","wolf","slug","bass"};
	static final String[] array6={"bass","bear","dove","goat","hoki","kiwi","lamb","lion","mole","toad","mule","oryx","seal","wolf","slug","sole"};
	static final String[] array7={"kiwi","dove","bass","lion","toad","sole","goat","mule","mole","hoki","lamb","bear","seal","wolf","slug","oryx"};
	static final String[] array8={"bass","bear","dove","goat","hoki","kiwi","lamb","lion","mole","mule","oryx","seal","slug","sole","toad","wolf"};

	static final String[][] array={{},array2,array3,array4,array5,array6,array7,{}};
	
	public static void main(String[] args) {
		BasicSort.comparearray=array;
		Shell.sort(array1.clone());
		Insertion.sort(array1.clone());
		Selection.sort(array1.clone());
	}
	
}

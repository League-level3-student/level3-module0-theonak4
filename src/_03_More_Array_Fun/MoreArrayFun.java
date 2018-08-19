package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] array = new String[11];
		array[0] = "first";
		array[1] = "second";
		array[2] = "third";
		array[3] = "fourth";
		array[4] = "fifth";
		array[5] = "sixth";
		array[6] = "seventh";
		array[7] = "eigth";
		array[8] = "ninth";
		array[9] = "tenth";
		array[10] = "eleventh";
		
		printRandom(array);
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	public static void printStrings(String[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	public static void printStringsReverse(String[] array) {
		for(int i=array.length-1; i>-1; i--) {
			System.out.println(array[i]);
		}
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	public static void printEveryOther(String[] array) {
		for(int i=0; i<array.length; i++) {
			if(i%2==0) {
				System.out.println(array[i]);
			} 
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	public static void printRandom(String[] array) {
		for(int i=0; i<array.length; i++) {
			Random rand = new Random();
			System.out.println(array[rand.nextInt(array.length)]);
		}
	}
	
}

package _00_IntroToArrays;

import java.util.Arrays;
import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] list = new String[5];
		list[0] = "item1";
		list[1] = "item2";
		list[2] = "item3";
		list[3] = "item4";
		list[4] = "item5";
		//2. print the third element in the array
		System.out.println(list[2]);
		//3. set the third element to a different value
		list[2] = "differentValue3";
		//4. print the third element again
		System.out.println(list[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for(int i = 0; i < list.length; i++) {
			list[i] = "theo";
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
		//7. make an array of 50 integers
		int[] integers = new int[50];
		//8. use a for loop to make every value of the integer array a random number
		for(int i = 0; i < integers.length; i++) {
			Random random = new Random();
			integers[i] = random.nextInt(51);
		}
		//9. without printing the entire array, print only the smallest number on the array
		int minValue = Integer.MAX_VALUE;
		int maxValue = Integer.MIN_VALUE;
		
		for(int i=0; i<integers.length; i++) {
			if(integers[i] < minValue) {
				minValue = integers[i];
			}
		}
		
		for(int i=0; i<integers.length; i++) {
			if(integers[i] > maxValue) {
				maxValue = integers[i];
			}
		}
		
		System.out.println(minValue);
		//10 print the entire array to see if step 8 was correct
		System.out.println(Arrays.toString(integers));
		//11. print the largest number in the array.
		
		System.out.println(maxValue);
		//12. print the last value in the array
		System.out.println(integers[integers.length-1]);
	}
}

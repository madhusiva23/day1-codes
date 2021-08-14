package week1.day2;

import java.util.Arrays;
import java.util.Iterator;

//arrays:to store multiple values in a single variable
public class LearnArrays {
	String s1 = "Hi";
	String s2 = "Hello";
	String s3 = "Hola";
	String s4 = "Ciao";

	public static void main(String[] args) {

//String array
		String[] strarr = { "hi", "hello", "hola", "ciao" };

//integer array
		int[] num = { 1, 2, 3, 4, 5, 6 };

//char array
		char[] ch = { 'A', 'H', 'E', 'A', 'O', 'Z', 'Y' };

//to get the length of the array
		int lengtharr = num.length;
		System.out.println("the length of the array is " + lengtharr);

//to retrieve all the values from an array
		for (int i = 0; i < ch.length; i++) {
			System.out.println("value of char at " + i + " position is " + ch[i]);
		}
			// sort the array
			Arrays.sort(ch);

			// to retrieve all the values from an array AFTER sorting
			for (int j = 0; j < ch.length; j++) {
				System.out.println("value of char at " + j + " position is " + ch[j]);

			}

		}
	}


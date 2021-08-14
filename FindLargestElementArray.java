package week1.day2;

import java.util.Arrays;
import java.util.Collections;

public class FindLargestElementArray {
	public static void main(String[] args) {
		
		//1.Initialize the array
		//2.Sort the array
		//3.Print the last element of the array since the sorting arranges the elements in ascending order
		
int[] arrnum= {780,974,82,5,273,1,84};

Arrays.sort(arrnum);

System.out.println("largest: "+arrnum[arrnum.length-1]); //largest number in the array

System.out.println("largest: "+arrnum[arrnum.length-2]); //second largest element

System.out.println("largest: "+arrnum[1]); //second smallest element 

//System.out.println("largest: "+arrnum[Collections.reverseOrder()]); 

//Collections.reverse(arrnum);
}
}

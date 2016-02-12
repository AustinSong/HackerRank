package arraysds;

import java.util.Scanner;

/**
 * Solution for arrays-ds on hackerrank
 * 
 * @author Austin Song
 *
 */
public class Solution {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		// Get size of array
		int numElements = in.nextInt();
		
		// Array to hold inputs
		int arr[] = new int[numElements];
		
		// Retrieve inputs.  Store them from end of array to beginning
		for(int i = numElements - 1; i >= 0; i--){
			arr[i] = in.nextInt();
		}		
		
		// Print reverse ordered array
		for(int i = 0; i < numElements; i++)
			System.out.print(arr[i] + " ");
	}
}

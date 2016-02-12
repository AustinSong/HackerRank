package twoDarrayDS;

import java.util.Scanner;

/**
 * Solution to 2D Arrays - DS on hackerranks.com
 * 
 * @author Austin Song
 */
public class Solution {
	private static final int SIZE = 6;
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		// Get matrix from user
		int[][] matrix = new int[SIZE][SIZE];
		for(int i = 0; i < SIZE; i++){
			for(int j = 0; j < SIZE; j++){
				matrix[i][j] = in.nextInt();
			}
		}	
		
		// Retrieve the max sum and print it
		System.out.print(sum(matrix));
	}
	
	/**
	 * Compare sums of all hourglass shapes
	 * 
	 * @param matrix user matrix
	 * @return the highest sum hourglass
	 */
	public static int sum(int[][] matrix){
		int maxSum = 0, tempSum;
		
		int[] arr = new int[7];
		for(int i = 0; i <= SIZE / 2; i++){
			for(int j = 0; j <= SIZE / 2; j++){
				tempSum = 0;
				tempSum += matrix[i][j];
				tempSum += matrix[i][j+1];
				tempSum += matrix[i][j+2];
				tempSum += matrix[i+1][j+1];
				tempSum += matrix[i+2][j];
				tempSum += matrix[i+2][j+1];
				tempSum += matrix[i+2][j+2];
				
				if(i ==0 && j == 0) // Set initial max
					maxSum = tempSum;
				
				if(maxSum < tempSum)
					maxSum = tempSum;
			}
		}
		
		return maxSum;
	}
	
}

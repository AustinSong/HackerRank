package diagonaldifference;

import java.util.Scanner;

/**
 * Solution for Diagonal Difference on hackerrank.com
 * 
 * @author Bleurgh
 *
 */
public class Solution {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		// Get number of rows
		int numRows = in.nextInt();
		
		//Fill matrix
		int matrix[][] = new int[numRows][numRows];
		for(int i = 0; i < numRows; i++){
			for(int j = 0; j < numRows; j++){
				matrix[i][j] = in.nextInt();
			}
		}
		
		//Retrieve top left to bottom right sum
		int sum1 = 0;
		for(int i = 0; i < numRows; i++){
			sum1 += matrix[i][i];
		}
		
		//Retrieve top right to bottom left sum
		int sum2 = 0;
		for(int i = 0; i < numRows; i++){
			sum2 += matrix[i][(numRows - 1) - i];
		}
		
		//Total sum
		int totalSum = Math.abs(sum1 - sum2);
		
		System.out.println(totalSum);
	}
}

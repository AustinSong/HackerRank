package plusminus;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Solution for Plus Minus on hackerrank.com
 * 
 * @author Austin Song
 *
 */
public class Solution {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		//Get size of array
		int numElements = in.nextInt();
		
		//Retrieve inputs
		int inputs[] = new int[numElements];
		for(int i = 0; i < numElements; i++){
			inputs[i] = in.nextInt();
		}
		
		//Count number 0's, negatives, positives
		int counts[] = new int[3];
		for(int i = 0; i < numElements; i++){
			if(inputs[i] == 0)
				counts[0]++;
			else if(inputs[i] < 0)
				counts[1]++;
			else
				counts[2]++;
			
		}
		
		//Calculate percentages
		System.out.println((float)counts[2] / numElements);
		System.out.println((float)counts[1] / numElements);
		System.out.println((float)counts[0] / numElements);
	}
}

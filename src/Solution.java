import java.util.Scanner;

/**
 * Solution for Service Lane on hackerrank.com
 * 
 * @author Austin Song
 */
public class Solution {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		// Read Freeway length and Number of test cases inputs
		int lengthFwy = in.nextInt();
		int numTests = in.nextInt();
		
		// Retrieve widths of segments
		int widths[] = new int[lengthFwy];
		for(int i = 0; i < lengthFwy; i++){
			widths[i] = in.nextInt();
		}
		
		// Logic.  Printout which vehicle can fit.  1 - motorcycle : 2 - car : 3 - truck
		for(int i = 0; i < numTests; i++){
			int entry = in.nextInt();
			int exit = in.nextInt();
			
			// Prepare to find smallest width segment ( to know largest vehicle that can fit )
			int lowestWidth = widths[entry];
			for(int j = entry; j <= exit; j++){
				if(lowestWidth > widths[j])
					lowestWidth = widths[j];
			}
			// Print out which vehicle is able to fit through all lanes
			System.out.println(lowestWidth);
		}
	}
}

package staircase;

import java.util.Scanner;

/**
 * Solution for Staircase on hackerrank.com
 * 
 * @author Austin Song
 */
public class Solution {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		//Get height
		int height = in.nextInt();
		
		for(int i = 1; i <= height; i++){
			printSpaces(height - i);
			printPounds(i);
			System.out.print("\n");
		}
		
		
	}
	
	public static void printSpaces(int count){
		for(int i = 0; i < count; i++)
			System.out.print(" ");
	}
	
	public static void printPounds(int count){
		for(int i = 0; i < count; i++)
			System.out.print("#");
	}
}

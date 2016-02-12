package timeconversion;

import java.util.Scanner;

/**
 * Solution for Time Conversion on hackerrrank.com
 * 
 * @author Austin Song
 *
 */
public class Solution {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		//Retrieve input and split into hours/minutes/secondAM/PM
		String time = in.next();
		String separated[] = time.split(":");
		
		//If it's PM, add 12 to the hour
		if(separated[2].contains("PM")){
			//Don't change if it's noon
			if(!(separated[0].equals("12"))){
				int hour = Integer.parseInt(separated[0]);
				hour += 12;
				separated[0] = String.valueOf(hour);
			}
		}
		else{ // time is AM
			if(separated[0].equals("12"))
				separated[0] = "00";
		}
		
		//Only include first 2 parts of the seconds since 24 hour clock does not have AM/PM
		System.out.println(separated[0] + ":" + separated[1] + ":" + separated[2].substring(0, 2));
	}
}

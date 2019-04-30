package plFinalProjectHoyt;

import java.util.Scanner;

public class FinalProject {

public static void main(String[] args){
	Scanner in = new Scanner(System.in);
		int inputYear;
		final int MAX = 9999;
		final int MIN = 0;
	inputYear = in.nextInt();
	while(MIN < inputYear){
		while(MAX > inputYear){
			if(inputYear %4 != 0){
				System.out.println(inputYear + " is not a leap year.");
				inputYear = in.nextInt();
			}
			else{
				System.out.println(inputYear + " is a leap year.");
			}
		}
	}
}
	
}

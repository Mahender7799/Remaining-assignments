package com.lms.assignmentTwo;

import java.util.Scanner;

public class TestScoreAnalyzer {

	public static void main(String[] args) {
		ScoreAnalyzer sa=new ScoreAnalyzer();
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter The Runs  ");
		for(int i=0;i<5;i++) {
			sa.addRunsToList(sc.nextInt());
		}
		sa.displayRuns();
		System.out.println("Runrate : "+sa.calcRunRate());
		 System.out.println("Lowest Run : "+sa.lowestRunsScored());
		

	}

}
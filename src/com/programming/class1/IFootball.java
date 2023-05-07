package com.programming.class1;

//interface- blueprint of a class
public interface IFootball extends ISports {
	
	public void homeTeamPointsScored(int points);
	public void visitingTeamPointsScored(int points);
	public void endOfQuarter(int quarter);
}

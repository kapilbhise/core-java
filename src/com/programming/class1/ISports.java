package com.programming.class1;

//interface- blueprint of a class
public interface ISports {
	
	//declared
	//abstract -undefined
	public abstract void setHomeTeam(String name);
	public void setVisitingTeam(String name);
	
	// by default final
	final int defaultNoOfPlayers=15;
}

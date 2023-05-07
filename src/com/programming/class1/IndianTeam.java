package com.programming.class1;

public class IndianTeam implements IFootball, IHockey{

	

	@Override
	public void setHomeTeam(String name) {
		// TODO Auto-generated method stub
		System.out.println("Home team name is "+ name);
	}

	@Override
	public void setVisitingTeam(String name) {
		// TODO Auto-generated method stub
		System.out.println("Visiting team name is "+ name);
	}

	@Override
	public void homeTeamGoalsScored(int goals) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void visitingTeamGoalsScored(int goals) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void overtimePeriod(int ot) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void homeTeamPointsScored(int points) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitingTeamPointsScored(int points) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void endOfQuarter(int quarter) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IndianTeam obj=new IndianTeam();
		obj.setHomeTeam("India");
		obj.setVisitingTeam("England");
		System.out.println("No of default playes is (called using obj) "+obj.defaultNoOfPlayers);
		System.out.println("No of default playes is (called using class) "+IndianTeam.defaultNoOfPlayers);
		
	}

}

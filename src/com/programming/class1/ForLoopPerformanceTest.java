package com.programming.class1;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

// performance measure of for loop
public class ForLoopPerformanceTest {
	
	static long startTime, endTime;
	static List<Integer> listInt=new ArrayList<>();
	
	static {
		for(int i=0;i<100_000_00;i++) {
			listInt.add(i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		startTime=Calendar.getInstance().getTimeInMillis();
		// enhance for loop
		for(Integer i:listInt) {}		
		endTime=Calendar.getInstance().getTimeInMillis();
		System.out.println("Time for enhanced for loop is "+(endTime-startTime)+" ms");
		
		
		// standard for loop
		startTime=Calendar.getInstance().getTimeInMillis();
		for(int i=0; i<listInt.size(); i++){}		
		endTime=Calendar.getInstance().getTimeInMillis();
		System.out.println("Time for standard for loop(with size method) is "+(endTime-startTime)+" ms");
		
		
		startTime=Calendar.getInstance().getTimeInMillis();
		int size=listInt.size();
		for(int i=0;i<size;i++){}		
		endTime=Calendar.getInstance().getTimeInMillis();
		System.out.println("Time for standadard for loop (with size variable) is "+(endTime-startTime)+" ms");
		
		startTime=Calendar.getInstance().getTimeInMillis();
		
		for(int i=size;i>0;i--){}		
		endTime=Calendar.getInstance().getTimeInMillis();
		System.out.println("Time for backword for loop (with size variable) is "+(endTime-startTime)+" ms");
		
		
	}

}

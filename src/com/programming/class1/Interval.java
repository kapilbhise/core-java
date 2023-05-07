package com.programming.class1;

// exception handling
public class Interval {
	
	
	
	long start, end;
	
	Interval(long start,long end){
		if(start>end) {
			throw new IllegalArgumentException("Start can not be greater than end");
			
		}
		this.start=start;
		this.end=end;
	}
	
	long duration() {
		return end-start;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interval obj1=new Interval(55,145);
		System.out.println("duration is "+ obj1.duration());
	}

}

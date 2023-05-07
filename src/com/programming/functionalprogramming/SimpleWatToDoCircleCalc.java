package com.programming.functionalprogramming;


interface Circle2{
	double area(double r);
	double circumference(double r);
}


public class SimpleWatToDoCircleCalc implements Circle2{

	@Override
	public double area(double r) {
		// TODO Auto-generated method stub
		double area=Math.PI*r*r;
		return area;
	}

	@Override
	public double circumference(double r) {
		// TODO Auto-generated method stub
		double circum=2*Math.PI*r;
		return circum;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleWatToDoCircleCalc obj= new SimpleWatToDoCircleCalc();
		//non static function
		double area=obj.area(10);
		double circumference= obj.circumference(10);
		
		System.out.println("Area is: "+area+" and circumeference is: "+circumference);
		
	}

	

}

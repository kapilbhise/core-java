package com.programming.functionalprogramming;

@FunctionalInterface
interface Circle{
	double  giveMeFormula(double radius);
}

public class LambdaExpressions2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle areaOfCicle= (r)-> Math.PI*r*r ;
		Circle circumferenceOfCircle=(r)-> 2*Math.PI*r ;
		
		LambdaExpressions2 obj= new LambdaExpressions2();
		//non static function
		double area=obj.performTheCalc(20, areaOfCicle);
		double circumference=obj.performTheCalc(20,circumferenceOfCircle);
		
		System.out.println("Area is: "+area+" and circumeference is: "+circumference);
		
		
		
	}
	
	// non static function
	///calculation will be done by this function
	public double performTheCalc(double r, Circle c) {
		return c.giveMeFormula(r);
	}

}

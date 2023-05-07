package com.programming.class1;

// inheritance using abstract class
abstract class Shape{
	// unique- defined by child classes
	abstract void draw();
	// in abstract class if we create a function using abstract keyword then 
	//we need to also define it in the child classes which extends the abstract class
	
	void purpose() {
		System.out.println("This is to find area of different shapes");
	}
	
	double area,r,l,b,h;
}

class Triangle extends Shape{
	
	
	@Override
	void draw() {
		// TODO Auto-generated method stub
		h=20;
		b=10;
		System.out.println("Area of Triangle is "+ (b*h)/2);
	}
	
}

class Circle extends Shape{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		r=5;
		System.out.println("Area of Circle is "+ Math.PI*r*r);
	}
	
}

class Rectangle extends Shape{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		l=20;
		b=10;
		System.out.println("Area of Rectangle is "+ l*b);
	}
	
}



public class LetsSeeTheOutput {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t= new Triangle();
		t.draw();
		t.purpose();
		
		Circle c=new Circle();
		c.draw();
		
		Rectangle r=new Rectangle();
		r.draw();
		
		
	}

}

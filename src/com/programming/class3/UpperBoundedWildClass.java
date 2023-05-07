package com.programming.class3;

import java.util.ArrayList;
import java.util.List;

abstract class Shape{
	abstract void  draw();
}

class Rectangle extends Shape{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drwaing Rectangle");
	}
	
}

class Circle extends Shape{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drwaing Circle");
		
	}
	
}



public class UpperBoundedWildClass {
	
	//upper bounded wild card -upper limit
	static void drawShape(List<? extends Shape> objs) {
		for (Shape obj : objs) {
			obj.draw();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Shape> listSh= new ArrayList<>();
		listSh.add(new Rectangle());
		listSh.add(new Rectangle());
		drawShape(listSh);
		
		List<Shape> listCir= new ArrayList<>();
		listCir.add(new Circle());
		listCir.add(new Circle());
		drawShape(listCir);
		
		
	}

}

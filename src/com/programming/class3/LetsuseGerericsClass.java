package com.programming.class3;

public class LetsuseGerericsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassContainingAllObjects<Integer> obj1= new ClassContainingAllObjects();
		obj1.add(12);
		System.out.println(obj1.get());
		obj1.add(45);
		System.out.println(obj1.get());
		
		ClassContainingAllObjects<String> obj2= new ClassContainingAllObjects();
		obj2.add("AB");
		System.out.println(obj2.get());
		obj2.add("XYZ");
		System.out.println(obj2.get());
		
		ClassContainingAllObjects<Boolean> obj3= new ClassContainingAllObjects();
		obj3.add(true);
		System.out.println(obj3.get());
		obj3.add(false);
		System.out.println(obj3.get());
	}

}

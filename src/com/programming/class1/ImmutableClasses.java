package com.programming.class1;

public final class ImmutableClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Hey There");
		
		System.out.println("Before uppercase "+ s1);
		s1.toUpperCase();
		System.out.println("After Uppercase "+s1);
		
		String s2 = s1.toUpperCase();
		System.out.println("String s2 "+s2);
		s1 = s2;                       
		
		System.out.println("String s1 "+s1);
		
		
		String name1="Kapil";
		String name2="Kapil";
		String name3=new String("Kapil");
		System.out.println();
		
		System.out.println(name1==name2);
		System.out.println(name1.equals(name2));
		System.out.println(name1==name3);
		System.out.println(name1.equals(name3));
		
		
		
	}
}

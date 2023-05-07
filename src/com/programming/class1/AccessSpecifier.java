package com.programming.class1;


class Access{
	public int x;
	private int y;
	void call(int a, int b) {
		x=a+1;
		y=b+1;
	}
	void displayY() {
		System.out.println(y);
	}
}
public class AccessSpecifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Access obj= new Access();
		obj.call(10, 12);
//		System.out.println(obj.x+" "+obj.y); // will give error as obj.y is not accesibe
		
		System.out.println(obj.x);
		obj.displayY();
		
	}

}

package com.programming.class1;

// labelled break and labelled continue
public class LabelledBreakAndContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// labelled break
		XYZ : for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				if(i==2 && j==2) {
					break XYZ;
				}
				System.out.println(i+"  "+j); //2 2 and 2 3 will not be printed and break both loops
			}
		}
		
		//break
		System.out.println();
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				if(i==2 && j==2) {
					break ;
				}
				System.out.println(i+"  "+j); //2 2 and 2 3 will not be printed but 3 1, 3 2, 3 4 will be printed
			}
		}
		
		//labelled continue
		System.out.println();
		ABC : for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				if(i==2 && j==2) {
					continue ABC;
				}
				System.out.println(i+"  "+j); //2 2 and 2 3 will not be printed
			}
		}
		
		System.out.println();
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				if(i==2 && j==2) {
					continue ;
				}
				System.out.println(i+"  "+j); //2 2 will not be printed
			}
		}
	}

}

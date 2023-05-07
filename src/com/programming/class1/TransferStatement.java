package com.programming.class1;

//  transfer statement -for loop
public class TransferStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// break
		for(int i=0;i<10;i++) {
			if(i==5) {
				break;
			}
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		// continue
		for(int i=0;i<10;i++) {
			if(i==5) {
				continue;
			}
			System.out.print(i+" ");
		}
		
		// labelled break and labelled continue
		
		
	}

}

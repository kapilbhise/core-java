package com.programming.class1;

// fibonacci series
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0,j=1; i<50;i=i+j,j=i-j) {
			System.out.print(i+" ");
		}
		
		
		int n1=0,n2=1,n3,i,count=10; 
		System.out.println(); 
		System.out.print(n1+" "+n2);//printing 0 and 1    
		  
		 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
			  n3=n1+n2;    
			  System.out.print(" "+n3);    
			  n1=n2;    
			  n2=n3;    
		 }    
	}

}

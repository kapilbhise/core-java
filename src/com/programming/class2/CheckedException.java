package com.programming.class2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class CheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//character data
		BufferedReader br=null;
		Reader r=new InputStreamReader(System.in); //console-connection
		br= new BufferedReader(r);
		String str;
		try {
			do {
				System.out.println("please enter the str and we will read it from you");
				str=br.readLine(); // handle it -connection
				System.out.println(str);
				
			}while(!str.equalsIgnoreCase("exit"));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally { //clean up activity
			if(br!=null) {
				try {
					br.close(); // compilation error -commit in repository- build will fail if not handled with exception
					// close the response leakage
				}
				catch(IOException e) {
					e.printStackTrace();
				} //close all streaming objects
			}
		}
		
	}

}

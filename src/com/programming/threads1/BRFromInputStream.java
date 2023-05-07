package com.programming.threads1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class BRFromInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Reader r= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(r);
		String str;
		
		try {
			do {
				System.out.println("Please enter str , I will read for you!");
				str=br.readLine();
				System.out.println(str);
			}while(!str.equalsIgnoreCase("exit"));
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			if(br!=null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}

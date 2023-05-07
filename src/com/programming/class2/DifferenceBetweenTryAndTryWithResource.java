package com.programming.class2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DifferenceBetweenTryAndTryWithResource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//simple try
		try {
			BufferedReader br= null;
			FileReader fr= new FileReader(new File("C:/Users/Kapil/Desktop/abc.txt"));
			br= new BufferedReader(fr);
			String str;
			while((str= br.readLine())!=null) {
				System.out.println(str);
			}
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		
		//try with resource -mentioned the resource
		try(BufferedReader br=new BufferedReader(new FileReader((new File("C:/Users/Kapil/Desktop/abc.txt"))) )) {
	
			String str;
			while((str= br.readLine())!= null) {
				System.out.println(str);
			}
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}

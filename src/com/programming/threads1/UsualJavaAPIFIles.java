package com.programming.threads1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UsualJavaAPIFIles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			File f = new File("C:/Users/Kapil/Desktop/abc.txt");
			System.out.println(f.exists());
			FileWriter fw= new FileWriter(f);
			BufferedWriter bw= new BufferedWriter(fw);
			
			char[] ch1= {'a','b','c','g','y'};
			bw.write(ch1);
			bw.newLine();
			bw.write("Kapil Bhise");
			bw.newLine();
			bw.write(97); // ascii value 97->a , will write a in file
			bw.newLine();
			bw.write("Using files write on server");
			bw.flush();
			bw.close();
		
		}
		catch(IOException e) {
			e.printStackTrace();
		}

		
		try {
			File f= new File("C:/Users/Kapil/Desktop/abc.txt");
			FileReader fr= new FileReader(f);
			BufferedReader br= new BufferedReader(fr);
			String str;
			while((str=br.readLine())!=null) {
				System.out.println(str);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}

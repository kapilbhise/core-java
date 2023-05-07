package com.programming.threads1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DealWithObjectsInFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= new String("Object String");
		
		Integer a=8979889;
		try
		{
			FileOutputStream fos= new FileOutputStream("C:/Users/Kapil/Desktop/abc.txt");
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			oos.writeObject(str);
			oos.writeObject(a);
		
			ObjectInputStream ois= new ObjectInputStream(new FileInputStream("C:/Users/Kapil/Desktop/abc.txt"));
			System.out.println(ois.readObject());
			System.out.println(ois.readObject());
			
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}

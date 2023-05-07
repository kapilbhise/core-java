package com.programming.threads1;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NioConcepts {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// new interface and new class - new way of object creation
		Path p= Paths.get("C:/Users/Kapil/Desktop/abc.txt");
		System.out.println(p.getFileName());
		System.out.println(p.getFileSystem());
		System.out.println(p.getParent());
		
		//support for old ways
		File f= p.toFile();
		System.out.println(f.getAbsolutePath());
		
		//new way of creating a buffered reader object
		BufferedReader br= Files.newBufferedReader(p);
		String str;
		while((str=br.readLine())!=null) {
			System.out.println(str);
		}
		
		
		Path p2= Paths.get("C:/Users/Kapil/Desktop/a2.txt");
		Files.createFile(p2);
		System.out.println("File created : "+p2.getFileName());
		
		
		
		
		
		
		
	}

}

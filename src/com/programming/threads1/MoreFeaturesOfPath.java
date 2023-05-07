package com.programming.threads1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class MoreFeaturesOfPath {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//		Files.createDirectory(Paths.get("C:/Users/Kapil/Desktop/abc"));
//		System.out.println("Directory created");
//		
//		Files.createDirectories(Paths.get("C:/Users/Kapil/Desktop/abc/a1/a2/a3"));
//		System.out.println("Directories created");
//
//		Path p=Paths.get("C:/Users/Kapil/Desktop/abc/a1/a2/a3");
//		Files.delete(p);
//		System.out.println("Directory a3 deleted");
//		
//		
		
		// last accesses time and last modified or created
		Path p2= Paths.get("C:/Users/Kapil/Desktop/abc.txt");
		BasicFileAttributeView bv=Files.getFileAttributeView(p2, BasicFileAttributeView.class);
		BasicFileAttributes attr= bv.readAttributes();
		
		FileTime creationTime= attr.creationTime();
		FileTime lastAccessedTime =attr.lastAccessTime();
		FileTime lastModifiedTime=attr.lastModifiedTime();
		
		System.out.println("Creation time: "+creationTime+"\nlast Accessed time :"+lastAccessedTime+"\nLast Modified time:"+lastModifiedTime);
		
		
		
	}

}

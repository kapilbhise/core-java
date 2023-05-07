package com.programming.threads1;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class TraverseFileSystem extends SimpleFileVisitor<Path>{

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		Files.delete(file);
		System.out.println(file.getFileName());
		return FileVisitResult.CONTINUE;
	}
	
	public FileVisitResult postVisitDirectory(Path dir, IOException e) throws IOException {
		Files.delete(dir);
		System.out.println(dir.getFileName()+" directory deleted");
		return  FileVisitResult.CONTINUE;
	}
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		TraverseFileSystem obj = new TraverseFileSystem();
		Path p= Paths.get("C:/Users/Kapil/Desktop/","abc");
		Files.walkFileTree(p, obj);
		
	}

}

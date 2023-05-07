package com.programming.threads1;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class SearchWhileTraversing  extends SimpleFileVisitor<Path>{

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path="C:\\Users\\Kapil\\eclipse-workspace";
		String glob="glob:**.java";
		match(glob, path);
	}
	
	static void match(String typeOfData, String location) throws IOException{
		PathMatcher pM=FileSystems.getDefault().getPathMatcher(typeOfData);
		
		Files.walkFileTree(Paths.get(location), new SimpleFileVisitor<>(){
			@Override
			public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException{
				if(pM.matches(file)) {
					System.out.println(file);
				}
				return FileVisitResult.CONTINUE;
			}
			
//			@Override
//			public FileVisitResult visitFileFailed(T file, IOException e) {
//				return FileVisitResult.CONTINUE;
//			}
			
		});
		
		
	}

}

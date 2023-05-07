package com.programming.threads1;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class StreamADirectory {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DirectoryStream<Path> stream=null;
		Path dir= Paths.get("C:/Users/Kapil/Downloads/");
		try {
			stream=Files.newDirectoryStream(dir,"*.{txt, java, c++, py,exe, log,dmg,pdf}");
			for(Path p:stream) {
				System.out.println(p.getFileName());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			stream.close();
		}	
		
		
		
	}

}

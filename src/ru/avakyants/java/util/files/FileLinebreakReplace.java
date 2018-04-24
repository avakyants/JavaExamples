package ru.avakyants.java.util.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileLinebreakReplace {
	
	/// /Users/tema14/Developer/java/JavaExamples/test.txt

	public static void main(String[] args) throws IOException {
		fileReplace(args[0],args[1]);
	}
	
	public static void fileReplace(String inFile, String outFile) throws IOException {
		System.setProperty("line.separator", "\n");
		Files.write(Paths.get(outFile), Files.readAllLines(Paths.get(inFile)));
		//Files.write(Paths.get(outFile), String.join("\\n",Files.readAllLines(Paths.get(inFile))).getBytes());
	}

}

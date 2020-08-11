package JavaStreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadingNotepad {

	public static void main(String[] args) throws IOException {
		
		//File create
		//File file = new File("E:\\Study\\Selenium Material\\MyWorkspace\\mytext.txt");
		//file.createNewFile();
		
		//Write inside file
		/*FileWriter fw = new FileWriter(file);
		BufferedWriter writer = new BufferedWriter(fw);
		
		writer.write("Please write inside this file..!!!");
		writer.newLine();
		writer.write("Second line..!!");
		writer.newLine();
		writer.write("Third line!! ");
		*/
		// Read file
		
		FileReader fr = new FileReader("E:\\Study\\Selenium Material\\MyWorkspace\\mytext.txt");
		BufferedReader reader = new BufferedReader(fr);
		
		String i = "";
		while((i = reader.readLine())!=null)
		{System.out.println(""+i);}
		
		
		
		//writer.flush();
	}

}

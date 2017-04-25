package io_stream_file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LineCounter {
	public static void main(String[] args){
		File f = new File("myFile.txt");
		int lineCounter = 0;
		try {
			FileReader fr = new FileReader(f);
			BufferedReader bf = new BufferedReader(fr);
			while((bf.readLine())!=null){
				lineCounter++;
			}
			fr.close();
			bf.close();
			System.out.println("The number of Lines in the file is equal to " + lineCounter);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

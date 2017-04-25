package io_stream_file;

/* Count and Print the lines of a text file that contains a given word (taken from standard input) */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TextFile {
	public static void main(String[] args){
		// An InputStreamReader is a bridge from byte streams to character streams: It reads bytes and decodes them
		// into characters. In fact, System.in only allows to read a sequence of bytes, one by one. Hence, in order to
		// read from the keyboard a different kind of data we need to use the InputStreamReader, that converts bytes to
		// characters.
		InputStreamReader reader = new InputStreamReader(System.in);
		// BufferedReader objects read text from a character-input stream, buffering characters so as to provide for the 
		// efficient reading of characters, arrays, and lines.
		BufferedReader br1 = new BufferedReader(reader);
		String targetWord = new String();
		try {
			targetWord = br1.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("We are looking for this word: " + targetWord);
		
		File f = new File("myFile.txt");
		String line;
		int wordCounter = 0;
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br2 = new BufferedReader(fr);
			while((line = br2.readLine())!=null){
				String fileWords[] = line.split(" ");
				for(int i=0;i<fileWords.length;i++){
					if(fileWords[i].equals(targetWord)){
						wordCounter++; 
						System.out.println(line);
						break;
					}
				}
			}
			fr.close();
			br2.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("There are " + wordCounter + " lines containing the word " + targetWord);
	}
}

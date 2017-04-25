package io_stream_file;

/* Count and print the bytes of a data file that are higher of a threshold (taken from standard input).*/	

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ByteFile {
	public static void main(String[] args){
		
		// This is the procedure to write a binary file.
		String testString = "Telemaco era un grande";
		File f = new File("myFile.dat");
		byte[] data = testString.getBytes();
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(f);
			fos.write(data, 0, data.length);
			fos.flush();
			fos.close();
		} catch (FileNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int byteAboveThr = 0;
		int thr = 0;
		
		// An InputStreamReader is a bridge from byte streams to character streams: It reads bytes and decodes them
		// into characters. In fact, System.in only allows to read a sequence of bytes, one by one. Hence, in order to
		// read from the keyboard a different kind of data we need to use the InputStreamReader, that converts bytes to
		// characters.
		InputStreamReader reader = new InputStreamReader(System.in);
		
		// BufferedReader objects read text from a character-input stream, buffering characters so as to provide for the 
		// efficient reading of characters, arrays, and lines.
		BufferedReader myInput = new BufferedReader(reader);
		String thrStr = new String();
		try {
			thrStr = myInput.readLine();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		// Depending on the kind of data we need, we should then properly parse the variable.
		thr = Integer.parseInt(thrStr);
		
		try {
			FileInputStream fr = new FileInputStream(f);
			int b;
			while((b = fr.read())>=0){
				if(b>thr){
					byteAboveThr++;	
					System.out.println(b);
				}
			}
			fr.close();
			System.out.println("The number of Bytes above the Threshold in the file is equal to " + byteAboveThr);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

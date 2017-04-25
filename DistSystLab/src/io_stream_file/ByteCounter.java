package io_stream_file;
import java.io.*;
public class ByteCounter {
	public static void main(String[] args){
		File f = new File("myFile.dat");
		int byteCounter = 0;
		try {
			FileInputStream fr = new FileInputStream(f);
			while((fr.read())>=0){
				byteCounter++;
			}
			fr.close();
			System.out.println("The number of Bytes in the file is equal to " + byteCounter);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

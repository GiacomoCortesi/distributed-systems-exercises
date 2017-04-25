package io_stream_file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFile {
	public static void main(String[] args){
		File f = new File("myFile.txt");
		try {
			FileReader fr = new FileReader(f);
			BufferedReader bf = new BufferedReader(fr);
			String line;
			while((line = bf.readLine())!=null){
				System.out.println(line);
			}fr.close();
			bf.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File fNew = new File("myNewFile.txt");
		FileWriter fw;
		try {
			fw = new FileWriter(fNew);
			BufferedWriter bw = new BufferedWriter(fw);
			String line = "sciao belo \n";
			bw.write(line);
			String anotherLine = "ciao ciao";
			bw.write(anotherLine);
			// bw.flush();
			bw.close();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

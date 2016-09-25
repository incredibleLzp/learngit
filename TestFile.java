package com.pollux;

import java.io.*;

//繁體字也能正常顯示，猴賽雷
public class TestFile {
	
	public static void main(String []args){
		FileReader in = null;
		FileWriter out = null;
		try{
			in = new FileReader("E:\\Git\\file.txt");
			out = new FileWriter("E:\\Git\\outputFile.txt");
			int b = 0;
			int num = 0;
			while((b=in.read())!=-1){
				out.write(b);
				num++;
			}
			System.out.println("");
			System.out.println(num);
			in.close();
			out.close();
		}catch(FileNotFoundException e){
			System.out.println("FileNotFoundException");
			System.exit(-1);
		}catch(IOException e){
			System.out.println("IOException");
			System.exit(-1);
		}
	}
}

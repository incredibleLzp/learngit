package com.pollux;

import java.io.*;

public class TestBuffer {
	public static void main(String[] args){
		
		String[] s = new String[]{"语出《孟子·尽心上·忘势》：","“穷则独善其身．达则兼济天下”。","后人习惯先“达”而后“穷”并改“兼善”为“兼济”，尚不失孟子原义。","但编者认为：一个人如果真心想要“善其身”与“济天下”，","那还是改成《孟子》原来说的是穷则独善其身，达则兼善天下的好"};
		String c=null;
		try{
			
			BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\git\\file.txt",true));
			for(int i=0;i<s.length;i++){
				bw.write(s[i]);
				bw.newLine();
			}
			bw.flush();
			
			BufferedReader br = new BufferedReader(new FileReader("E:\\git\\file.txt"));
			while((c = br.readLine()) != null){
				System.out.println(c);
			}
			bw.close();
			br.close();
		}catch(FileNotFoundException e){
			System.out.println("FileNotFoundException");
			System.exit(-1);
		}catch(IOException e){
			System.out.println("IOException");
			System.exit(-1);
		}
	}
}

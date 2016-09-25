package com.pollux;

import java.io.*;

public class TestTransform {

	public static void main(String[] args){
		try{
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			String s=null;
			while((s=br.readLine()) != null){
				if(s.equalsIgnoreCase("exit")){
					break;
				}
				System.out.println(s);
			}
			isr.close();
			br.close();
		}catch(IOException e){
			System.out.println("IOException");
			e.printStackTrace();
			System.exit(-1);
		}
	}
}

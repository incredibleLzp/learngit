package com.pollux;

import java.io.*;

public class TestData {
	public static void main(String[] args){
		
		try{
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			DataOutputStream dos = new DataOutputStream(baos);
			dos.writeDouble(0.123);
			dos.writeChar('c');
			dos.writeBoolean(false);
			
			ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
			DataInputStream dis = new DataInputStream(bais);
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readBoolean());
			
			dos.close();dis.close();
		}catch(IOException e){
			e.printStackTrace();
			System.exit(-1);
		}
	}
}

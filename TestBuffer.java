package com.pollux;

import java.io.*;

public class TestBuffer {
	public static void main(String[] args){
		
		String[] s = new String[]{"��������ӡ������ϡ����ơ���","����������������������¡���","����ϰ���ȡ����������ġ����ơ�Ϊ����á����в�ʧ����ԭ�塣","��������Ϊ��һ�������������Ҫ���������롰�����¡���","�ǻ��Ǹĳɡ����ӡ�ԭ��˵�������������������������µĺ�"};
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

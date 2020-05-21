 import java.io.*;
 class FileInputExample{
	public static void main(String args[]) throws IOException, FileNotFoundException{
		FileReader fr = new FileReader("example.txt");
		int x = fr.read();
		while(x!=-1){
		System.out.print((char)x);
		x=fr.read();
		
		}
		fr.close();
	}
 }
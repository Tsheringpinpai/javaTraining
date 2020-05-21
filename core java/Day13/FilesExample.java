 import java.io.*;
 class FilesExample{
	public static void main(String args[]) throws IOException, FileNotFoundException{
		FileWriter fw = new FileWriter("example2.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		String s = "welcome to java world";
		bw.write(s);
		bw.close();
	}
 }
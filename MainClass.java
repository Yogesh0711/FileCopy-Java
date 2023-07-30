package FolderExample;

import java.io.*;

// to count file and write file name into another file
public class MainClass {
	public static void main (String[] args) throws IOException {
		MainClass.samplePro();
	}
	static void samplePro() throws IOException {
		FileWriter fileWrite=new FileWriter("filename.txt");
		BufferedWriter writer=new BufferedWriter(fileWrite);
		File file=new File("C:\\Users\\yoges\\eclipse-workspace\\SampleFolder");
		File[] list=file.listFiles();
		for(File temp:list) {
			if(temp.isFile()) {
				writer.write(temp.getName());
				writer.newLine();
			}
			
		}
		writer.close();
	}
}

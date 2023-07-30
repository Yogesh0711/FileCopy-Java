package FolderExample;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

// main file to copy file using multi threading
public class MainFileCopy{
	public static void main(String[] args) {
		
		File srcFile=new File("C:\\Users\\yoges\\eclipse-workspace\\SampleFolder");
		File destFile=new File("C:\\Users\\yoges\\eclipse-workspace\\SampleThree\\foldercopyfiles");
		MainFileCopy.fileCopyMethod(srcFile,destFile);
	}
	public static void fileCopyMethod(File srcFile,File destFile) {
		File[] list=srcFile.listFiles();
		for(File temp:list) {
			if(temp.isFile()) {
				new FileCopy(temp,destFile).run();
			}
		}
	}
}


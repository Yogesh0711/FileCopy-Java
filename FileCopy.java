package FolderExample;

import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
//using multi threading for copy file into another folder
class FileCopy implements Runnable{
	String srcFile;
	String filename;
	String destFolder;
	
	public FileCopy(File srcFile, File destFolder) {
		this.srcFile = srcFile.toString();
		filename =srcFile.getName();
		this.destFolder = destFolder.toString();
		destFolder.mkdirs();
	}

	@Override
	public void run() {
			
		
			try {
				Path srcPath=Paths.get(srcFile);
				Path destPath=Paths.get(destFolder).resolve(filename);
				Files.copy(srcPath, destPath, StandardCopyOption.REPLACE_EXISTING);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}

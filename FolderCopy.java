package FolderExample;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


// file copy from folder to another folder 

public class FolderCopy {
	public static void main(String[] args) throws IOException {
		FolderCopy exam=new FolderCopy();
		exam.folderCopy();
	}
	
	void folderCopy() throws IOException {
		File srcFolder=new File("C:\\Users\\yoges\\eclipse-workspace\\SampleFolder");
		File destFolder=new File("C:\\Users\\yoges\\eclipse-workspace\\copiedFolder");
		
		if(!this.isFolderFound(destFolder)) {
			if(this.isFolderFound(srcFolder)) {
				destFolder.mkdirs();
				Path destPath=Paths.get(destFolder.toString());
				File[] list=srcFolder.listFiles();
				for(File temp:list) {
					Path srcPath=Paths.get(temp.toString());
					Path destFile=Paths.get(destPath.toString()+"\\"+temp.getName());
					//System.out.println(destFile);
					Files.copy(srcPath, destFile,StandardCopyOption.REPLACE_EXISTING);
					
				}
			}
			else {
				System.out.println("Source Folder Not Found");
			}
		}
		else {
			System.out.println("Target Folder alredy found");
		}
			
	}
	
	boolean isFolderFound(File file){
		return file.exists();
	}
}

package fileio;

import java.io.File;

public class CreateDirDemo {
	public static void main(String[] args) {
		File file = null;
		file = new File("c:\\");
		String[] directories;
		
		directories = file.list();
		
		for(String path: directories) {
			System.out.println(path);
		}
		//String dirPath = "c:\\pythonprojects\\dxc";
		//File d = new File(dirPath);
		//d.mkdir();
	}

}

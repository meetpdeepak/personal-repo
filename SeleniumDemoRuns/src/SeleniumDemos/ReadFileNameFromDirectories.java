package SeleniumDemos;

import java.io.File;

public class ReadFileNameFromDirectories {

	public static void main(String[] args) {
		File directoryPath = new File("C:\\Users\\O365GRS\\Desktop\\rfhutil\\ih03");
		String contents[] =directoryPath.list();
		System.out.println("List of files and directories: ");
		for (int i=0; i<contents.length;i++) {
			System.out.println(contents[i]);
		}

	}

}

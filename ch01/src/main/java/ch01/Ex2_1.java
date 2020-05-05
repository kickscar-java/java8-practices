package ch01;

import java.io.File;
import java.io.FileFilter;

public class Ex2_1 {

	public static void main(String[] args) {

//		File[] hiddenFiles = new File(".").listFiles(new FileFilter() {
//			@Override
//			public boolean accept(File pathname) {
//				return pathname.isHidden();
//			}
//		});

		// Method Reference
		File[] hiddenFiles = new File(".").listFiles(File::isHidden);
		
		System.out.println(hiddenFiles.length);
		
	}
}

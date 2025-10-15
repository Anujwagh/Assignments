package filehandling.com.demo.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis=new FileInputStream("file.txt");
			FileOutputStream fos=new FileOutputStream("filecopy.txt");
			int i=fis.read();
			while(i!=-1) {
				fos.write(i);
				i=fis.read();
			}
			fis.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}

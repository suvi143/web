package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Surenthar {
	public static void main(String[] args) throws IOException, FileNotFoundException {
		try {
			File f = new File("C:\\surendhar\\drivers\\text.txt");
			FileReader fr = new FileReader(f);
			int temp = 0;
//			while ((temp = fr.read()) != -1) {
//				System.out.print((char) temp);
//			}
			for(int i =0 ; (i=fr.read()) != -1;i++){
				System.out.print((char) i);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}

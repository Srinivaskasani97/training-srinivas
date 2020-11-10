import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputEx {
		public static void main(String args[]) throws IOException {
			FileInputStream fis=new FileInputStream("E:\\Motivity.txt");
			BufferedInputStream bis=new BufferedInputStream(fis);
			
			int i=bis.read();
			while(i!=-1) {
			System.out.print((char)i);
			i=bis.read();
		}
	}
}
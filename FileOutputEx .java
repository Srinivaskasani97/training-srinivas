import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputEx {
		public static void main(String args[]) {
			try {
				FileOutputStream fos=new FileOutputStream("E:\\Motivity.txt");
				BufferedOutputStream bos=new BufferedOutputStream(fos);
				String name="Todays concept is files";
				bos.write(name.getBytes());
				bos.close();
			} 
			catch(IOException e) {
				e.printStackTrace();
			}
		}

}

import java.io.File;  
import java.io.PrintWriter;  
public class PrintWriterEx {  
    public static void main(String[] args) throws Exception {  
             //Data to write on Console using PrintWriter  
      PrintWriter pw = new PrintWriter(System.out);    
      pw.write("Java language provides all technology.");        
      pw.flush();  
      pw.close();  
      		//Data to write in File using PrintWriter       
      PrintWriter pw1 =null;      
         pw1 = new PrintWriter(new File("E:\\Motivity.txt"));  
         pw1.write("Like Java, Manual testing, Automation testing, Android, etc.");                                                   
         pw1.flush();  
         pw1.close();  
    }  
}  

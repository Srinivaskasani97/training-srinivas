import java.io.CharArrayReader;  
public class CharArrayReaderEx{  
  public static void main(String[] ag) throws Exception {  
    char[] ary = { 's', 'r', 'i', 'n', 'i', 'v', 'a', 's', 'k', 'a','s','a','n','i' };  
    CharArrayReader car = new CharArrayReader(ary);  
    int i = 0;   
    while ((i = car.read()) != -1) {  
      char ch = (char) i;  
      System.out.print(ch + " : ");  
      System.out.println(i);  
    }  
  }  
}  
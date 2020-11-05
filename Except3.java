public class Except3 {
	  public static void main (String args[])
	  {  
		  int a[]=new int[5];  
	   try{   
		
		   a[5]=20;
	   }
	   catch(ArrayIndexOutOfBoundsException      e)
	   {
		  e.printStackTrace();
		   }  
	  
	  }  
	} 

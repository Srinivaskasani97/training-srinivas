public class Exception{ 
		  public static void main(String args[])
		  {  
		   try{   
		      int x=20/0;  
		   }
		   catch(ArithmeticException e)
		   {
			  e.printStackTrace();
			   }  
		  }  
} 

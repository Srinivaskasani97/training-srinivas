public class FinallyBlock {
		  public static void main(String args[]){  
		  try{  
		   int data=100/25;  
		  
		  }  
		  catch(ArithmeticException e)
		  {
			 e.printStackTrace();
			  }  
		  finally{
			  
			  	System.out.println("finally block is always executed");
			  
		  }  
	}
}  
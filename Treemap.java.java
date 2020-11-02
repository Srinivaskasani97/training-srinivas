import java.util.Treemap;
public class Treemap
{
	public static void main(String args[]) 
	{
		Treemap<Integer,String> tm=new Treemap<Integer,String>();
		{
			tm.put(1234,"vasu");
			tm.put(1235,"lasya");
			tm.put(1236,"mahesh");
			tm.put(1238,"nikhil");
			tm.put(1239,"sai");
			tm.put(1234,"vasu");
			System.out.println(tm);
		}
	}
}
	

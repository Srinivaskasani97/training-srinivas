public class StringOutOfBoundException {
		public static void main(String[] args) {
			String s="srinivas kasani";
			try
			{
				char ch=s.charAt(20);
				System.out.println(ch);
			}
			catch(StringIndexOutOfBoundsException se)
			{
				System.out.println("enter vallid index number");
			}
		}
}
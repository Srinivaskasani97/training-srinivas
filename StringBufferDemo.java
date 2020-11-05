public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Srinu");
		StringBuffer s=new StringBuffer("Srinu");
		System.out.println(sb);
		System.out.println(sb.charAt(1));
		System.out.println(sb.append(" Kasani"));
		System.out.println(sb.equals(s));
		System.out.println(sb.indexOf("y"));
		System.out.println(sb.substring(2));
		System.out.println(sb.substring(1, 4));
		System.out.println(sb.reverse());
		System.out.println(sb.deleteCharAt(5));
		sb.setCharAt(5, ' ');
		System.out.println(sb);
		System.out.println(sb.replace(5, 10,"rinsu"));
	}

}
public class StringDemo {
	public static void main(String[] args) {
		String name="Vasu";
		System.out.println(name.charAt(1));
		System.out.println(name.concat("Kasani"));
		System.out.println(name.equalsIgnoreCase("vasu"));
		System.out.println(name.indexOf('k'));
		name=name.concat("kasani");
		System.out.println(name.substring(2));
		String[] s1=name.split(" ");
		System.out.println(s1[0]);
		char[] s=name.toCharArray();
		System.out.println(s[0]+" "+s[10]);
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.endsWith("di"));
		System.out.println(name.isEmpty());
		System.out.println(name.isBlank());
		System.out.println(name.lastIndexOf('i'));
		name="Vasu Kasani";
		System.out.println(name.trim());
	}

}
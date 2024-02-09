package learning;

public class Strngs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Anusha";
		String a = "Learning java";
		String s1 = "hello  welcome "; 
		
		System.out.println(s.length());
		System.out.println(s.concat(a));
		System.out.println(s.contains(s1));
		System.out.println(s1.trim());
		System.out.println(s.charAt(4));
		System.out.println(s.equals("anusha"));
		System.out.println(s.equalsIgnoreCase("anusha"));
		System.out.println(s.replace('A','K'));
		System.out.println(s.replace("Anusha","Keerthi"));
		System.out.println(s.substring(2));
		System.out.println(s.substring(0, 3));
		System.out.println(s.toLowerCase());
		System.out.println(a.toUpperCase());
		
		
	}

}

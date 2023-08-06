package builtin;

public class s {
	public static void main(String[] args) {
		
		String n="Priya";
		//String=> class and datatype
		// n=> variable and object
		
		//  index   0   1  2    3   4   
		//          P   r  i    y   a
		System.out.println(n.length());
		System.out.println(n.indexOf('a'));
		System.out.println(n.charAt(1));
		
		System.out.println(n.toLowerCase());
		System.out.println(n.toUpperCase());
		
		System.out.println(n+"hi");
		System.out.println(n.concat("hi"));
		
		System.out.println(n.replace('P', 'K'));
		System.out.println(n.replace("ri", "re"));
		
		System.out.println(n.substring(2, 5));
		
		System.out.println(n.contains("ya"));
	}

}

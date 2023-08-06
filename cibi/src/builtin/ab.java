package builtin;

public class ab {

	public static void main(String[] args) {
		
		StringBuffer n= new StringBuffer("Priya");

		//  index   0   1  2    3   4   
		//          P   p  r  i    y   a
		System.out.println(n.length());
		System.out.println(n.indexOf("a"));
		System.out.println(n.charAt(1));
		
		//inserting, appending'
		System.out.println(n.append("hi"));
		System.out.println(n.insert(1, 'p'));
		
		System.out.println(n.deleteCharAt(1));
		System.out.println(n.delete(5, 7));//5,6
		
		System.out.println(n.replace(1, 3, "RE"));
		
		System.out.println(n.reverse());
		System.out.println(n.reverse());
		
		System.out.println(n.substring(0, 2));
	}
}

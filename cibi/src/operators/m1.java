package operators;

public class m1 {
	public static void main(String[] args) {
		//arithmetic operators: +,-,*,/
		// comparision operatprs: <,>,<=,>=,==
		// conditional operator/ternary operator:  condition? true:false
		//assignment operators: +=,-=,*=,/=
		//logical operators: and, or, not
		int age=8;
		System.out.println(age>18 ? "Major": "Minor");
		//add 10 to age
		//age+=10;
		
		// sub 2 from age
		//age-=2;
		
		//multiply age by 3
		//age*=3;
		
		// divide age by 2
		//age/=2;
		//System.out.println(age);
		/*
		 * and  : &&
		 * 
		 * condi1   cond2    output
		 * True      true    true
		 * true      false   false
		 * false     true    false
		 * false     false   false
		 * 
		 * 
		 *  or  : ||
		 * 
		 * condi1   cond2    output
		 * True      true    true
		 * true      false   true
		 * false     true    true
		 * false     false   false
		 * 
		 * not:   !
		 * 
		 * true=> false
		 * false=> true
		 * 
		 * 
		 * */
		int a=40;
		int b=30;
		System.out.println("ANd operator");
		System.out.println(a<50 && b==30);
		System.out.println(a<50 && b!=30);
		System.out.println(a==50 && b==30);
		System.out.println(a==50 && b==3);
		System.out.println("or operator");
		System.out.println(a<50 || b==30);
		System.out.println(a<50 || b!=30);
		System.out.println(a==50 || b==30);
		System.out.println(a==50 || b==3);
		System.out.println(a==40);
		System.out.println(a!=40);
	}

}

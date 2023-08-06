package inhr;

public class parent {
/*inheritance: process in which one class acquires properties of other class
 * parent/base/super: class whose properties are inherited
 * child/derived/sub:  class whihc uses properties of parent class
 * 
 * to achieve:  child class defn=> extends parentclassname
 * 
 * after
 * child ob=.> parent methods
 * 
 * single:  parent<=> child
 * multiple: parent1, parent<=> child java doesnot support
 * hierrarchial: parent=> child1,child2
 * multilevel: parent<=> child <=> grandchild
* 
 * */
	public static void ps()
	{
		System.out.println("parent class static method");
	}
	
	public void pn()
	{
		System.out.println("parent class nonstatic method ");
	}
}

package Interr;

public interface Intro {

	/*
	 * interface 
	 * 
	 *    blue print of class
	 *    doesnot contain main mthd
	 *    doesnot contain static method
	 *    will have non static method with default
	 *    will have abstract method
	 *         doesnot contain abstract keywword
	 *         will be empty in interface 
	 *         wull be redefined in te class to whch interface connects to 
	 *         
	 *         class<[> class: extends
	 *         class<=> interface : implements
	 *          class=> implements interfacename 
	 * 
* 
	 * */
	//nonstatic method
	default public void area()
	{
		int side=4;
		System.out.println("area of square is "+ side*side);
	}
	
	//abstract method
	public void ab();
}

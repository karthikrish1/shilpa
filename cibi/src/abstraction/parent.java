package abstraction;

abstract public class parent {
	/*
	 * abstraction: hiding implementation details
	 *     follows inheritance
	 *     achieved through abstract class and abstract method
	 *     class=> abstract class=> add abstract keyword befre it
	 *     abstract class can have nrml method and abstract method
	 *     nrml method: we wont hide anything
	 *     abstract method
	 *        non static
	 *        abstract keyword 
	 *        will be empty in it own class
	 *        will be redefined in its derived class
	 *     cannot create an object for abstract class
	 *     //abstract method: calculates area of square  
	 *   * 
	 * */
	
	public void nm()
	{
		System.out.println("nrml method");
	}
	
	abstract public void ab();

}

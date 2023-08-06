package loops;

public class l1 {
	public static void main(String[] args) {
		/*
		 * for, while, do while 
		 * 
		 * initialisation         : where to start
		 * condition checking     : where to stop
		 *                         forward:   <=end value
		 *                         backward:  >=end value
		 * incrementation/dec    : diff between 2 consecutive numbers
		 * 
		 * syntax:
		 * 
		 * initialisation
		 * while(condition)
		 * {
		 * statement
		 * inc/dec 
		 * }
		 * 
		 *  odd numbers from 1 to 11    1,3,5,7,9,11
		 *  
		 *  eve numbers from 10 to20   10,12,14...20
		 * */
		int i=1;
		while(i<=11)
		{
			System.out.println(i);
			i=i+2;
		}
		
	}

}

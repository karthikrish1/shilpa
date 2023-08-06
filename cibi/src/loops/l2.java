package loops;

public class l2 {
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
		 * initialisation
		 * do
		 * {
		 * statment
		 * unc/dec
		 * }
		 * while(condition);
		 * 
		 * 30 ,29.....1
		 * 
		 * odd numbers from 5 to 55     5,7,9,11...55
		 * 
		 * */
		
		int i=30;
		do
		{
			System.out.println(i);
			i=i-1;
		}
		while(i>=1);
	}

}

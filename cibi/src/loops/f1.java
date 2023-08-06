package loops;

public class f1 {

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
		 * for(initi; cond; inc/dec)
		 * {
		 * stmt}
		 */
		for(int i=10;i>=1;i=i-1)
		{
			System.out.println(i);
		}
		
		for(int i=0;i<=40;i=i+4)
		{
			System.out.println(i);
		}
	}
}

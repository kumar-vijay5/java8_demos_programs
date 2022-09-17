package lambdaHomeTask;

public class PolindromeTaskWithLambda {
  /* given number is polindrom or not Using lambda */
	public static void main(String[] args) {
		MyIntef mi = (a) -> {
			int rev = 0; int r = 0; int n = a;
			  while (n != 0) {
					r = n % 10;
					rev = rev * 10 + r;
					n /= 10;				
				}
				 return (rev == a);
			};
			if(mi.chkpol(123454321))
			    System.out.println("This is polindrom");
			else
				System.out.println("This is not polindrom");
			
	}

	
}

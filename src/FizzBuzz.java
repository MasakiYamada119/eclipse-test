
public class FizzBuzz {
	public static void main(String[] args) {
	   int b=3;
	   int c=5;
	   int d=15;
	   for (int a=1; a<=100; a++) {
		   if (a%b==0) {
			   System.out.println("Fizz");
		   }else if (a%c==0) {
			   System.out.println("Buzz");
		   }else if (a%d==0) {
			   System.out.println("FizzBuzz");
		   }else {
			   System.out.println(a);
		   }
	   }
	}
}

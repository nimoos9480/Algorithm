import java.util.*;

public class Main {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int A = sc.nextInt();
	int B = sc.nextInt();
	
	int sum = A+B;
	int minus = A-B;
	int multiply = A * B;
	int quotient = A / B;
	int remainder = A % B;
	
	if (1 <= A && A <= 10000 && 1 <= B && B <= 10000) {
	System.out.println(sum);
	System.out.println(minus);
	System.out.println(multiply);
	System.out.println(quotient);
	System.out.println(remainder);
	
	}
	
	}
}
import java.util.*;

public class Main { 
    public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    
    int A = sc.nextInt();
    int B = sc.nextInt();
     double C = (double) A / B;

        if(0 < A && B < 10) {
             System.out.println(C);
        }
   
    }
}
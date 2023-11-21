import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String userId = sc.nextLine();
        
        if (userId.length() <= 50) {
            System.out.println(userId + "??!");
        }
    }
}
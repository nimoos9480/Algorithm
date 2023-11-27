import java.util.*;

public class Main { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); int A = sc.nextInt();

    // 윤년 조건 확인
    if ((A % 4 == 0 && A % 100 != 0) || (A % 400 == 0)) {
        System.out.println(1); // 윤년이면 1 출력
    } else {
        System.out.println(0); // 윤년이 아니면 0 출력
    }
}
}
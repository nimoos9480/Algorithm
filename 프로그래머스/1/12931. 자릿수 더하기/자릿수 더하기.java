import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String str = Integer.toString(n);

        // 아스키 코드에서 숫자 '0'의 코드 값은 48이고, 숫자 '9'의 코드 값은 57. 
        // 각 문자에서 '0'의 코드 값을 빼면 해당 숫자를 얻을 수 있음
        for(int i=0; i<str.length(); i++) {
            answer += str.charAt(i) - '0';
            
        }

        return answer;
    }
}

// 다른 풀이
import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        while (n != 0) {
            //num을 10으로 나눈 나머지를 sum에 더한다.
            answer += n % 10;
            //num을 10으로 나눈 값을 다시 num에 저장한다.
            n /= 10;
        }

        return answer;
    }
}

import java.util.ArrayList;

class Solution {
    public int[] solution(long n) {
       // 자릿수를 저장할 리스트 생성
        ArrayList<Integer> digits = new ArrayList<>();

        // n을 뒤집어서 각 자릿수를 리스트에 추가
        while (n > 0) {
            digits.add((int) (n % 10));
            n /= 10;
        }

        // 리스트를 배열로 변환
        int[] answer = new int[digits.size()];
        for (int i = 0; i < digits.size(); i++) {
            answer[i] = digits.get(i);
        }

        return answer;
    }
}

// 다른 사람 풀이
class Solution {
  public int[] solution(long n) {
      String a = "" + n; // "" + n 할 경우 자바 내부적으로 StringBuffer가 생성된다 ==> new StringBuffer해서 append 한 것과 동
        int[] answer = new int[a.length()];
        int cnt=0;

        while(n>0) {
            answer[cnt]=(int)(n%10);
            n/=10;
            System.out.println(n);
            cnt++;
        }
      return answer;
  }
}

// 다른 사람 풀이 2
import java.util.stream.IntStream;

class Solution {
    public int[] solution(long n) {
        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
    }
}


import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        // 배열 내에서 가장 큰 수와 2번째 큰 수 곱하기
        Arrays.sort(numbers);
        
        answer = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        
        return answer;
    }
}
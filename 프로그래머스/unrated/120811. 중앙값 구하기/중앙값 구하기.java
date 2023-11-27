import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        
        if(array.length % 2 == 1) {
            answer = array[array.length/2];
        }

        return answer;
    }
}
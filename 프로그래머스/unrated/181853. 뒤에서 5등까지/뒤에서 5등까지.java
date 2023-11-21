import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        
        answer = Arrays.copyOf(num_list, num_list.length);
        Arrays.sort(answer);

        return Arrays.copyOf(answer, Math.min(5, answer.length));


    }
}
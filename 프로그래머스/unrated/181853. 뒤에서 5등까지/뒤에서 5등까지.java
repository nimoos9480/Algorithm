import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        
        answer = Arrays.copyOf(num_list, num_list.length);
        Arrays.sort(answer);

        return Arrays.copyOf(answer, Math.min(5, answer.length));


    }

    // 다른 풀이
    class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        return Arrays.copyOfRange(num_list, 0, 5);
    }
}

    // 다른 사람 풀이
    class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[5];
        Arrays.sort(num_list);

        for (int i = 0; i < answer.length; i++) {
            answer[i] = num_list[i];
        }
        
        return answer;
    }
}

}

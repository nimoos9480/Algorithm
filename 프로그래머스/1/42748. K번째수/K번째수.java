import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int k = 0; k < commands.length; k++) {
            int i = commands[k][0] - 1;
            int j = commands[k][1];
            int[] copyArr = Arrays.copyOfRange(array, i, j);
            Arrays.sort(copyArr);
            answer[k] = copyArr[commands[k][2] - 1];
        }

        return answer;
    }
}
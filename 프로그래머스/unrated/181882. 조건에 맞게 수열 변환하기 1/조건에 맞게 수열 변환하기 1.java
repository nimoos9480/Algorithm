class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                // 50 이상이면서 짝수인 경우
                answer[i] = arr[i] / 2;
            } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                // 50 미만이면서 홀수인 경우
                answer[i] = arr[i] * 2;
            } else {
                // 그 외의 경우
                answer[i] = arr[i];
            }
        }
        return answer;
    }
}
class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            // 홀수 길이의 배열이면서 짝수 인덱스일 때 또는
            // 짝수 길이의 배열이면서 홀수 인덱스일 때 값을 수정
            if ((arr.length % 2 == 1 && i % 2 == 0) || (arr.length % 2 == 0 && i % 2 == 1)) {
                answer[i] = arr[i] + n;
            } else {
                answer[i] = arr[i];
            }
        }

        return answer;
    }
}

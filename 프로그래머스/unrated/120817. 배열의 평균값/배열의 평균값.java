class Solution {
    public double solution(int[] numbers) {
       double answer = 0;
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        if (numbers.length >= 1 && numbers.length <= 100) {
            answer = (double) sum / numbers.length;
        }

        return answer;
    }
}
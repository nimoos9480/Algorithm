class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String ab = Integer.toString(a) + Integer.toString(b);
        int sum = Integer.parseInt(ab);
        
        if(sum == (2*a*b)) {
            answer = sum;
        } else {
            answer = Math.max(sum, 2 * a * b);
        }
        return answer;
    }
}
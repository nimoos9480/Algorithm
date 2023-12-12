class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        
        int sum = 0;
        for(int i=0; i<10; i++) {
            sum += i;
        }      
        
        // numbers 배열의 합
        int num = 0;
        for(int i=0; i<numbers.length; i++) {
            num += numbers[i];
        }
        
        answer = sum - num; 
        return answer;
    }
}
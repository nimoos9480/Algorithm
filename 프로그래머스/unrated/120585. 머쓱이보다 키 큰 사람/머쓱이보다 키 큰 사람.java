class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        
        // 키큰 사람의 수 count
        for(int i=0; i<array.length; i++) {
            if(array[i] > height) {
                answer++;
            } 
        }
        return answer;
    }
}
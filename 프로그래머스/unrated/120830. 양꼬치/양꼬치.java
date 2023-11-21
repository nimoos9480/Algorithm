class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        if(n>0 && n<1000 && k>=n/10 && k<1000) {
            answer = (n * 12000) + ((2000*k) - ((n / 10) * 2000));
            
        }
    
        return answer;
    }
}

// 더 간결하게
class Solution {
    public int solution(int n, int k) {
        int answer = 12000 * n + (k - n/10) * 2000;
        return answer;
    }
}

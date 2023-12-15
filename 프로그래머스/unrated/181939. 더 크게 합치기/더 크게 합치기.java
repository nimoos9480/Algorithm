class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String aa = a + "";
        String bb = b + "";
        
        int ab = Integer.valueOf(aa + bb);
        int ba = Integer.valueOf(bb + aa);
        
        answer  = (ab > ba) ? ab : ba ;
        return answer;
    }
}
class Solution {
    public boolean solution(int x) {
        boolean answer = true;

        int sum = 0;
        // x를 문자열로 전환
        String str = Integer.toString(x);
        for(int i=0; i<str.length(); i++) {
            int num = str.charAt(i) - '0';
            sum += num;
        }     

        
        if(num % sum == 0) {
            return answer;
        }
        return false;
    }
}

// 다른 풀이
class Solution2 {
    public boolean solution(int x) {
        boolean answer = true;

        int sum = 0;   
        int num = x;
         while(x>0) {
            sum += x % 10;
            x /= 10;
        }
        
        if(num % sum == 0) {
            return true;
        }
        return false;
    }
}

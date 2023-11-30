class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toUpperCase();
        
        int p = 0;
        int y = 0;
        
        for (char ch : s.toCharArray()) {
            if (ch == 'P') {
                p++;
            } else if (ch == 'Y') {
                y++;
            }
        }

        if (p != y) { 
            answer = false;
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
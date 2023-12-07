class Solution {
    public String solution(String s) {
        String answer = "";
        // 단어의 길이가 홀수 
        int middle = s.length() / 2;

        if(s.length() % 2 == 1) {
            return s.substring(middle, middle + 1);
        }  else 
            return s.substring(middle - 1, middle + 1);
    }
}
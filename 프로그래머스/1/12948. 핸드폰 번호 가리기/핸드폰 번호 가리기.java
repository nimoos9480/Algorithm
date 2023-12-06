class Solution {
    public String solution(String phone_number) {
        String answer = "";
       // 문자열 한자씩 배열로 만들기
        char[] str = phone_number.toCharArray();
        
        for(int i=0; i<str.length; i++) {
            if(i < str.length - 4) {
                answer += "*";
            } else 
                answer += str[i];        
        }
            
        return answer;
    }
}
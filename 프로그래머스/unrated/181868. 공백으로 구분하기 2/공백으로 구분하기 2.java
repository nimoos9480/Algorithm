class Solution {
    public String[] solution(String my_string) {
        // ''\\s+'는 하나 이상의 공백
        String[] answer = my_string.trim().split("\\s+");
        
        return answer;
    }
}

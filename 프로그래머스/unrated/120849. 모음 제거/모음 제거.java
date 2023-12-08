class Solution {
    public String solution(String my_string) {
        String answer = my_string;
        String[] v = {"a", "e", "i", "o", "u"};
        for (String vowel : v) {
            answer = answer.replace(vowel, "");
        }
        
        return answer;
    }
}
class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String ms = myString.toUpperCase();
        String p = pat.toUpperCase();
        if(ms.contains(p)) {
            return 1;
        }
        return answer;
    }
}
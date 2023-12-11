class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
         char[] ch = myString.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'A') {
                ch[i] = 'B';
            } else if (ch[i] == 'B') {
                ch[i] = 'A';
            }
        }
        
        String str = new String(ch);
        if(str.contains(pat)) {
            answer = 1;
        }
        return answer;
    }
}
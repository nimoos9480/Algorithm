class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i=0; i<myString.length(); i++) {
            char ch = myString.charAt(i);
            // l보다 앞설때
            if(ch < 'l') {
                myString = myString.replace(ch, 'l');
            } 
        }
        return myString;
    }
}
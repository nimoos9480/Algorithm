class Solution {
    public String solution(String rsp) {
        String answer = "";
        String tmp = ""; 
        for(int i=0; i<rsp.length(); i++) {
            if(rsp.charAt(i) == '2') {
                tmp = "0";
            } else if(rsp.charAt(i) == '0') {
                tmp = "5";
            } else if(rsp.charAt(i) == '5') {
                tmp = "2";
            }
            answer += tmp;
        }
        return answer;
    }
}


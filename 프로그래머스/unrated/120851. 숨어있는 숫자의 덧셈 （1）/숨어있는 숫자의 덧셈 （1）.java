class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String str = my_string.replaceAll("[a-zA-Z]", "");
        String[] arr = str.split("");
        
        for(int i=0; i<arr.length; i++) {
            answer += Integer.valueOf(arr[i]);
        }
        return answer;
    }
}
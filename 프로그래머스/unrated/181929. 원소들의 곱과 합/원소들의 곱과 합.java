class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int multiple = 1;
        int add = 0;
        
        for(int i=0; i<num_list.length; i++) {
            multiple *= num_list[i];
            add += num_list[i];
            
            if(multiple < (add * add)) {
                answer = 1;
            } else 
                answer = 0;
        }
        return answer;
    }
}
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int multiple = 1;  // 곱이기 때문에 초기값 1로 설정!
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

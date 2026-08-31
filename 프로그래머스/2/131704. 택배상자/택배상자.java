import java.util.*;

class Solution {
    public int solution(int[] order) {
        Stack<Integer> stack = new Stack<>(); // 4, 3
        
        int answer = 0;
        int now = 1;
        
        for(int i=0; i<order.length; i++) {
            int target = order[i]; // 4
            
            if(!stack.isEmpty() && stack.peek() == target) {
                answer++;
                stack.pop();
                continue;
            }
            
            while(now <= order.length && now != target) {
                stack.push(now);
                now++;
            }
            
            if(now <= order.length && now == target) {
                answer++;
                now++;
            } else {
                break;
            }
        }
        
        return answer;
    }
}
import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
        answer = 1 + (sides[0] + sides[1] - max - 1) + (min - 1);
        
        return answer;
    }
}
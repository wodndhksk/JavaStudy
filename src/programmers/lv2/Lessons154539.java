package programmers.lv2;

import java.util.Arrays;
import java.util.Stack;

/**
 * 뒤에 있는 큰 수 찾기
 */
public class Lessons154539 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] input = {9, 1, 5, 3, 6, 2};
        System.out.println(Arrays.toString(sol.solution(input)));
    }
}

/**
 * 풀이 (풀이에 java.util.Stack 을 import 해서 채점)
 */
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for(int i=1; i<numbers.length; i++) {
            while(!stack.isEmpty() && numbers[stack.peek()] < numbers[i]){
                answer[stack.pop()] = numbers[i];
            }
            stack.push(i);
        }

        //남은 스택의 index 를 answer 배열의 index 로 사용하여 -1로 치환
        while(!stack.isEmpty()){
            answer[stack.pop()] = -1;
        }

        return answer;
    }
}
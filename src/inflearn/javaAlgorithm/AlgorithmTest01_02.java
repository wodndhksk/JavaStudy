package inflearn.javaAlgorithm;
/**
 * 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로
 * 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
 */

import java.util.Scanner;

public class AlgorithmTest01_02 {
    //풀이
    static String solution1(String inputString){
        char[] chars = inputString.toCharArray();

        for(int i =0; i< chars.length; i++){
            if(Character.isUpperCase(chars[i]))
                chars[i] = Character.toLowerCase(chars[i]);
            else if(Character.isLowerCase(chars[i]))
                chars[i] = Character.toUpperCase(chars[i]);
        }
        String str = new String(chars);

        return str;
    }
    //간단 풀이
    String solution2(String str){
        String answer = "";
        for(char c : str.toCharArray()){
            if(Character.isLowerCase(c))
                answer += Character.toUpperCase(c);
            else
                answer += Character.toLowerCase(c);
        }
        return answer;
    }

    // 아스키값으로 풀이
    String solution3(String str){
        String answer = "";
        for(char c : str.toCharArray()){
            if(c>=97 && c<= 122)
                answer += (char)(c-32);
            else
                answer += (char)(c+32);
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();

        System.out.println(solution1(inputString));
    }
}

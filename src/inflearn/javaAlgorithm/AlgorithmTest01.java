package inflearn.javaAlgorithm;
/**
 * 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.
 *
 * 대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
 */

import java.util.Scanner;

public class AlgorithmTest01 {

    static int solution(String s, String input){
        String replaceString = s.replaceAll(input.toLowerCase(), "");
        replaceString = replaceString.replaceAll(input.toUpperCase(), "");
        int count = s.length() - replaceString.length();
        return count;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String input = sc.next();

        int count = solution(str, input);
        System.out.println(count);
    }
}

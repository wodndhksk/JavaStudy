package inflearn.javaAlgorithm;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
 * 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
 */
public class AlgorithmTest01_06 {
    String solution1(String str){
        String result = "";
        for(int i = 0; i<str.length(); i++){
            if(str.indexOf(str.charAt(i)) == i)
                result += str.charAt(i);
        }
        return result;
    }


    public static void main(String[] args){
        AlgorithmTest01_06 al = new AlgorithmTest01_06();
        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();
        System.out.println(al.solution1(inputString));
    }
}

/**
 * ksekkset 를 indexOf 로 중복구분 할 시
 *
 *  i=0 일때
 *  inputString, i++ , indexOf 비교
 *  k 0 0
 *  s 1 1
 *  e 2 2
 *  k 3 0
 *  k 4 0
 *  s 5 1
 *  e 6 2
 *  t 7 7
 *
 */

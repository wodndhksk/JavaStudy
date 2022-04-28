package inflearn.javaAlgorithm;

import java.util.Scanner;

/**
 * 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
 * 문장속의 각 단어는 공백으로 구분됩니다.
 */
public class AlgorithmTest01_03 {
    //풀이
    static String solution1(String str){
        String[] array = str.split(" ");
        String prevStr = "";

        for(String a : array){
            if(prevStr.length() < a.length())
                prevStr = a;
        }
        return prevStr;
    }
    // 다른풀이
    String solution2(String str){
        String answer="";
        int m = Integer.MIN_VALUE, pos;
        while((pos=str.indexOf(' '))!= -1){
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if(len > m){
                m = len;
                answer = tmp;
            }
            str = str.substring(pos+1);
        }
        if(str.length()>m) answer=str;
        return answer;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(solution1(input));
    }

}

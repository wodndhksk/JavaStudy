package inflearn.javaAlgorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class AlgorithmTest01_04 {
    //풀이
    static String solution1(String str){
        char[] chars = str.toCharArray();
        for(int i=0; i<str.length()/2; i++){
            char left = chars[i];
            char right =chars[(str.length()-i)-1];
            chars[i] = right;
            chars[(str.length()-i)-1] = left;
        }
        String result = new String(chars);
        return result;
    }
    //다른 풀이
    ArrayList<String> solution2(String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str){
            char[] s = x.toCharArray();
            int lt=0, rt=x.length()-1;
            while(lt<rt){
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }
        return answer;
    }

    //StringBuilder의 reverse() 사용 예제
    ArrayList<String> solution3(String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str){
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }


    public static void main(String[] args){
        AlgorithmTest01_04 a = new AlgorithmTest01_04();
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        if(inputNum>=3 && inputNum<=20){
            String[] input = new String[inputNum];

            for(int i=0; i<inputNum; i++)
                input[i] = sc.next();

            //내풀이 결과
            for(String str : input)
                System.out.println(solution1(str));
            //다른 풀이 결과
            for(String x : a.solution2(input))
                System.out.println(x);
            //reverse() 사용 결과
            for(String x : a.solution3(input))
                System.out.println(x);
        }
    }
}

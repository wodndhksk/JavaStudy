package inflearn.javaAlgorithm;

import java.util.Scanner;

public class AlgorithmTest01_09 {
    // String 숫자 앞에 0은 Integer.parsInt를 사용시 제거된다.
    public int solution1(String str){
        String answer = "";
        int result = 0;
        answer = str.replaceAll("[^0-9]", "");
        result = Integer.parseInt(answer);
        return result;
    }

    public int solution2(String str){
        int answer=0;
        for(char x : str.toCharArray())
            if(x>=48 && x<=57) answer = answer * 10+(x-48);
        return answer;
    }

    public int solution3(String str){
        int answer=0;
        for(char x : str.toCharArray())
            if(Character.isDigit(x)) answer += x;
        return answer;
    }

    public static void main(String[] args) {
        AlgorithmTest01_09 al = new AlgorithmTest01_09();
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        System.out.println(al.solution1(inputString));
    }
}

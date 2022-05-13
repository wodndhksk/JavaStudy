package inflearn.javaAlgorithm;

import java.util.Scanner;

public class AlgorithmTest01_12 {
    public String solution1(int num, String str){
        String answer="";
        for(int i=0; i<str.length()/7; i++){
            String tmp = str.substring(i*7, (i*7)+7);
            tmp = tmp.replaceAll("\\#", "1");
            tmp = tmp.replaceAll("\\*", "0");
            char c = (char) Integer.parseInt(tmp, 2);
            answer += c;
        }
        return answer;
    }
    public String solution2(int num, String str){
        String answer="";
        for(int i=0; i<num; i++){
            String tmp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            int n = Integer.parseInt(tmp, 2);
            answer += (char)n;
            str= str.substring(7);
        }
        return answer;
    }

    public static void main(String[] args) {
        AlgorithmTest01_12 al = new AlgorithmTest01_12();
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        String input = sc.next();

        System.out.println(al.solution1(inputNum,input));
        System.out.println(al.solution2(inputNum,input));
    }
}

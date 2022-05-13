package inflearn.javaAlgorithm;

import java.util.Scanner;

public class AlgorithmTest01_11 {
    public String solution1(String str){
        String answer="";
        int count = 1;
        char tmp=' ';
        for(int i=0; i<str.length(); i++){
            if(tmp == str.charAt(i)) count++;
            else {
                if(count == 1) answer += Character.toString(tmp);
                else answer += Character.toString(tmp) + String.valueOf(count);
                count = 1;
            }
            tmp = str.charAt(i);
        }
        return answer;
    }
    public String solution2(String str){
        String answer="";
        str += " ";
        int cnt = 1;
        for(int i=0; i<str.length()-1; i++){
            if(str.charAt(i) == str.charAt(i+1)) cnt++;
            else{
                answer += str.charAt(i);
                if(cnt>1) answer+=String.valueOf(cnt);
                cnt=1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        AlgorithmTest01_11 al = new AlgorithmTest01_11();
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        System.out.println(al.solution1(input+" ").trim());

        System.out.println(al.solution2(input));
    }
}

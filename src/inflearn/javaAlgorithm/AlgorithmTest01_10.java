package inflearn.javaAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AlgorithmTest01_10 {

    public String solution1(String str, char c){
        String answer="";
        int[] x = new int[str.length()];

        int num = 101;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == c)
                num = 0;
            x[i] = num;
            num++;
        }
        num = 101;
        for(int i=str.length()-1; i >= 0; i--){
            if(str.charAt(i) == c)
                num = 0;
            if(x[i] > num)
                x[i] = num;
            num++;
        }
        for(int i =0; i<x.length; i++)
            answer += Integer.toString(x[i]) + " ";
        return answer;
    }
    // 내 풀이
    public String solution2(String str, char c){
        String answer="";
        char[] x = str.toCharArray();
        ArrayList<Integer> charPos = new ArrayList<>();

        for(int i=0; i<x.length; i++) {
            int posNum = 0;
            if (c == str.charAt(i)) charPos.add(i);
        }
        for(int i=0; i<x.length; i++){
            int arr[] = new int[charPos.size()];
            for(int j=0; j<charPos.size(); j++){
                arr[j] = Math.abs(i - charPos.get(j));
            }
            Arrays.sort(arr);
            answer += arr[0] + " ";
        }
        return answer;
    }

    public static void main(String[] args) {
        AlgorithmTest01_10 al = new AlgorithmTest01_10();
        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();
        char inputChar = sc.next().charAt(0);

        System.out.println(al.solution1(inputString, inputChar).trim());
    }
}

package inflearn.javaAlgorithm;

import java.util.Scanner;

public class AlgorithmTest01_02 {
    static String solution(String inputString){
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
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();

        System.out.println(solution(inputString));
    }
}

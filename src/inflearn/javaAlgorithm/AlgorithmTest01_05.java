package inflearn.javaAlgorithm;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
 * 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
 */
public class AlgorithmTest01_05 {
    String solution1(String str){
        char[] c = str.toCharArray();
        int ltPos=0, rtPos=(c.length)-1;
        while(ltPos < rtPos){
            if(!Character.isAlphabetic(c[ltPos]))
                ltPos++;
            else if(!Character.isAlphabetic(c[rtPos]))
                rtPos--;
            else{
                char temp;
                temp = c[rtPos];
                c[rtPos] = c[ltPos];
                c[ltPos] = temp;
                ltPos++;
                rtPos--;
            }
        }
        String result = new String(c);
        return result;
    }

    String solution2(String str){
        char[] c = str.toCharArray();
        int ltPos=0, rtPos=(c.length)-1;
        while(true){
            if(ltPos > rtPos){
                ltPos=0;
                rtPos=0;
                break;
            }
            if(getType(String.valueOf(c[ltPos])) && getType(String.valueOf(c[rtPos]))){
                char temp;
                temp = c[rtPos];
                c[rtPos] = c[ltPos];
                c[ltPos] = temp;
                ltPos++;
                rtPos--;
            }else if(getType(String.valueOf(c[ltPos]))) {
                rtPos--;
            }else if(getType(String.valueOf(c[rtPos]))) {
                ltPos++;
            }
        }
        String result = new String(c);
        return result;
    }

    public boolean getType(String str){
        return Pattern.matches("^[a-zA-Z]*$", str);
    }

    public static void main(String[] args){
        AlgorithmTest01_05 al = new AlgorithmTest01_05();
        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();

        System.out.println(al.solution1(inputString));
    }
}

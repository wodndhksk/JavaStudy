package inflearn.javaAlgorithm;

import java.util.Scanner;

public class AlgorithmTest01_07 {

    void solution2(String str){
        String lowerStr = str.toLowerCase();
        char[] chars = lowerStr.toCharArray();
        int count = 0;
        for(int i=0; i<chars.length/2; i++){
            if(!(chars[i] == chars[(chars.length-i)-1]))
                count++;
        }
        if(count ==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }

    void  solution1(String str){
        String answer = "NO";
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp)) answer="YES";
        System.out.println(answer);
    }

    public static void main(String[] args) {
        AlgorithmTest01_07 al = new AlgorithmTest01_07();
        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();

        al.solution1(inputString);
    }
}

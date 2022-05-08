package inflearn.javaAlgorithm;

import java.util.Scanner;

/**
 * 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
 *
 * 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
 *
 * 단 회문을 검사할 때 대소문자를 구분하지 않습니다.
 */
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

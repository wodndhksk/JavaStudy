package inflearn.javaAlgorithm;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AlgorithmTest01_08 {
    public String solution1(String str){
        String answer = "YES";
        ArrayList<String> arr = new ArrayList<>();
        String s = str.toLowerCase();
        Pattern p = Pattern.compile("[a-z]+");
        Matcher m = p.matcher(s);
        int num = 0;
        String tmpStr ="";
        while(m.find()){
            arr.add(m.group());
            tmpStr += arr.get(num++);
        }
        for(int i=0; i<tmpStr.length()/2; i++){
            if(tmpStr.charAt(i) != tmpStr.charAt((tmpStr.length()-i)-1))
                answer = "NO";
        }
        return answer;
    }

    // 간단한 방법 : 정규식 [a-z] 앞에 ^ 추가하면 a~z를 제외하고 replaceAll
    public String solution2(String str){
        String answer="NO";
        str = str.toLowerCase().replaceAll("[^a-z]", "");
        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)) answer = "YES";
        return answer;
    }

    public static void main(String[] args) {
        AlgorithmTest01_08 al = new AlgorithmTest01_08();
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();

        System.out.println(al.solution1(inputString));

    }
}

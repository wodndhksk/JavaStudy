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

    public static void main(String[] args) {
        AlgorithmTest01_08 al = new AlgorithmTest01_08();
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();

        System.out.println(al.solution1(inputString));

    }
}

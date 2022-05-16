package inflearn.javaAlgorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class AlgorithmTestArray02_04 {
    public ArrayList<Integer> solution(int n){
        ArrayList<Integer> arr = new ArrayList<>();
        int tmp = 1;
        int next = 1;
        arr.add(tmp);
        arr.add(next);
        for(int i=0; i<n-2; i++){
            int sum = tmp + arr.get(i);
            arr.add(sum);
            tmp = sum;
        }
        return arr;
    }
    public String arrToString(ArrayList<Integer> arr){
        String answer="";
        for(int x : arr){
            answer += Integer.toString(x) + " ";
        }
        return answer.trim();
    }

    // 배열 사용 안하고 풀이
    public void solution2(int n){
        int a=1, b=1, c;
        System.out.println(a+" "+b+" ");
        for(int i=2; i<n; i++){
            c = a+b;
            System.out.println(c+" ");
            a=b;
            b=c;
        }
    }
    public static void main(String[] args) {
        AlgorithmTestArray02_04 al = new AlgorithmTestArray02_04();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        //solution1 result
        System.out.println(al.arrToString(al.solution(input)));

        //solution2 result
        al.solution2(input);
    }
}

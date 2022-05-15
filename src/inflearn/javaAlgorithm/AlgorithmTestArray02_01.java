package inflearn.javaAlgorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class AlgorithmTestArray02_01 {
    public String solution1(ArrayList<Integer> arr){
        String answer = "";
        int tmp = 0;
        for(int a : arr){
            if(tmp < a)
                answer += a + " ";
            tmp = a;
        }
        return answer.trim();
    }

    public ArrayList<Integer> solution2(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for(int i =1; i<n; i++){
            if(arr[i] > arr[i-1]) answer.add(arr[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        AlgorithmTestArray02_01 al = new AlgorithmTestArray02_01();
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<inputNum; i++) {
            int input = sc.nextInt();
            arr.add(input);
        }
        System.out.println(al.solution1(arr));

        // solution2 print 결과
//        int[] arr1 = new int[inputNum];
//        for(int i=0; i<inputNum; i++){
//            arr1[i] = sc.nextInt();
//        }
//        for(int x : al.solution2(inputNum, arr1))
//            System.out.println(x+" ");
//
    }
}

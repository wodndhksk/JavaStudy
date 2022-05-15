package inflearn.javaAlgorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class AlgorithmTestArray02_02 {
    public int solution1(ArrayList<Integer> arr){
        int answer = 1;
        int tmp = 0;
        if(arr.size()>0)
            tmp = arr.get(0);
        for(int x : arr){
            if(tmp < x) {
                tmp = x;
                answer++;
            }
        }
        return answer;
    }

    public int solution2(int n, int[] arr){
        int answer = 1, max = arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                answer++;
                max = arr[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        AlgorithmTestArray02_02 al = new AlgorithmTestArray02_02();
        Scanner sc = new Scanner(System.in);
        int inputCount = sc.nextInt();

        // 정수 N(5<=N<=100,000)이 입력
        if(inputCount <= 100000 && inputCount >= 5) {
            ArrayList<Integer> arr = new ArrayList<>();
            for (int i = 0; i < inputCount; i++) {
                int input = sc.nextInt();
                arr.add(input);
            }
            System.out.println(al.solution1(arr));
        }
    }
}

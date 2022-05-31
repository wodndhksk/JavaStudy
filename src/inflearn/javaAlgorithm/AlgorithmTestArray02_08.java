package inflearn.javaAlgorithm;

import java.util.Scanner;

public class AlgorithmTestArray02_08 {
    public String solution1(int[] arr){
        String answer = "";
        for(int i=0; i<arr.length; i++){
            int count=1;
            for(int j=0; j<arr.length; j++){
                if(arr[i]<arr[j])
                    count++;
            }
            answer += count+" ";
        }
        return answer;
    }

    public static void main(String[] args) {
        AlgorithmTestArray02_08 al = new AlgorithmTestArray02_08();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] arr = new int[input];
        for(int i=0; i<input; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(al.solution1(arr));
    }
}

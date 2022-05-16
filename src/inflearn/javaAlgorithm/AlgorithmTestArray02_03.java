package inflearn.javaAlgorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class AlgorithmTestArray02_03 {
    public void solution1(int count, ArrayList<Integer> arrA, ArrayList<Integer> arrB){
        for(int i=0; i<count; i++){
            String winner = "";
            switch (arrA.get(i) - arrB.get(i)){
                case 0:
                    winner = "D";
                    System.out.println(winner);
                    break;
                case 1: case -2:
                    winner = "A";
                    System.out.println(winner);
                    break;
                case -1: case 2:
                    winner = "B";
                    System.out.println(winner);
                    break;
            }
        }
    }

    public String solution2(int n, int[] a, int[] b){
        String answer="";
        for(int i=0; i<n; i++){
            if(a[i] == b[i]) answer += "D";
            else if(a[i] == 1 && b[i] == 3) answer += "A";
            else if(a[i] == 2 && b[i] == 1) answer += "A";
            else if(a[i] == 3 && b[i] == 2) answer += "A";
            else answer += "B";
        }
        return answer;
    }

    public static void main(String[] args) {
        AlgorithmTestArray02_03 al = new AlgorithmTestArray02_03();
        Scanner sc = new Scanner(System.in);
        int inputCount = sc.nextInt();

        //solution main 1
        ArrayList<Integer> arrA = new ArrayList<>();
        ArrayList<Integer> arrB = new ArrayList<>();

        for(int i=0;i<inputCount;i++){
            int input = sc.nextInt();
            arrA.add(input);
        }
        for(int i=0;i<inputCount;i++){
            int input = sc.nextInt();
            arrB.add(input);
        }
        al.solution1(inputCount, arrA, arrB);

        //solution main2
        int[] a = new int[inputCount];
        int[] b = new int[inputCount];
        for(int i=0; i<inputCount; i++)
            a[i] = sc.nextInt();
        for(int i=0; i<inputCount; i++)
            b[i] = sc.nextInt();
        for(char x : al.solution2(inputCount, a, b).toCharArray())
            System.out.println(x);

    }

}

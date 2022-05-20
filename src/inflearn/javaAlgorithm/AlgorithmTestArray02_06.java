package inflearn.javaAlgorithm;

import java.util.Scanner;

public class AlgorithmTestArray02_06 {
    public String solution1(int[] arr){
        String answer="";
        for(int i=0; i<arr.length; i++){
            String s = Integer.toString(arr[i]);
            String tmp = "";
            char[] chars = s.toCharArray();

            for(int j=chars.length-1; j>=0; j--)
                tmp += chars[j];

            if(getPrimeNum(Integer.parseInt(tmp)))
                answer += Integer.parseInt(tmp) + " ";
        }
        return answer;
    }

    // 1과 자기자신값을 제외한 나머지 값으로 나누어 떨어진다 = 소수가 아니다 (약수로 나누어 소수 판별)
    public boolean getPrimeNum(int a){
        boolean answer = true;
        if(a < 2){
            answer = false;
        }else {
            for (int i = 2; i < a; i++)
                if (a % i == 0)
                    answer = false;
        }
        return answer;
    }

    public static void main(String[] args) {
        AlgorithmTestArray02_06 al = new AlgorithmTestArray02_06();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] arr = new int[input];

        for(int i=0; i<input; i++)
            arr[i] = sc.nextInt();

        System.out.println(al.solution1(arr));
    }
}

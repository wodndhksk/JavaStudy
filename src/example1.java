//코딩테스트 연습 (프로그래머스)
//2020 KAKAO BLIND RECRUITMENT
//문자열 압축

public class example1 {
// 인텔리제이 디버깅 F8(한줄씩 읽기)
    public static int solution(String s) {
        int answer = 0;
        String inputString = s; //입력받은 원래 문자열
        String firstGroup = "", nextGroup = "";
        for(int i = 1; i <s.length(); i++){
            int cnt = 1;
            for(int j = 0; j<s.length()/i; j++){
                int begin = i * j;
                int end = (i * j) + 1;

                if(j == 0) {
                    firstGroup = s.substring(begin, end);
                }else{
                    nextGroup = s.substring(begin, end);
                    if(firstGroup.equals(nextGroup)){
                        cnt +=1;
                        inputString = inputString.replaceFirst(firstGroup, Integer.toString(cnt));// 수정부분 2a2ba3c가 아닌 2a2ba23c로 출력됨

                        firstGroup = nextGroup;
                    }else{
                        cnt = 1;
                        firstGroup = nextGroup;
                    }

                    //
                }

            }
            //

        }
        return answer;
    }

    public static void main(String[] args) {

        String result1 = "aabbaccc";
        String result2 = "ababcdcdababcdcd";//012 , 345, 678
        String result3 = "abcabcdede";
        String result4 = "abcabcabcabcdededededede";

        String result[] = {result1, result2, result3, result4  };

        for(int i = 0; i< result.length; i++){
            int a = solution(result[i]);
            System.out.println("입출력 결과 : " + a);
        }

    }

}

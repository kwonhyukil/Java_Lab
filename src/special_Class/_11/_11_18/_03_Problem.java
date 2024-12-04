package special_Class._11._11_18;

public class _03_Problem {
    public static void main(String[] args) {

        int operatorNum = 7;

        char[] operator = {'+', '-', '*'};

        char[] randomOperatorList = new char[operatorNum];

        for (int i = 0; i < randomOperatorList.length; i++) {
            randomOperatorList[i] = operator[(int)(Math.random() * 3)];
        }
        System.out.println(randomOperatorList);
//        char[] randomOperatorList = {'-', '-', '-', '-', '+', '-', '-'};
        // 연산자 저장 char 변수 생성
        char saveOperator = '0';
        // 같은 연산자 카운트 int 변수 생성
        int saveCount = 0;
        // 반복 횟수 6번 진행
        for (int i = 0 ; i < randomOperatorList.length - 1; i++){
            // index[0]을 불러와 char 변수에 저장
            saveOperator = randomOperatorList[i];
            // 변수에 저장된 연산자와 다음 인덱스 번호 index[1] 과 비교 하여 같으면 카운트 int 변수 +1 추가
            // 단 같은 연산자가 계속 될 경우 1 추가
            if (saveOperator == randomOperatorList[i+1]) {
                saveCount++;
            }
        }
//        char[] randomOperatorList = {'-', '-', '-', '-', '+', '-', '-'};

        // 연산자 저장 char 변수에 index[0] 저장
        // char 변수와 index [1] 비교후 같으면 카운트 int 변수 += 1
        // saveCount = 1 - 2개 일치
        // saveCount = 2 - 3개 일치

    }
}


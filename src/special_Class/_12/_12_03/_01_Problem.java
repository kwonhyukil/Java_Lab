package special_Class._12._12_03;

public class _01_Problem {
    static int[] getSumAvg (int[] numList) {
        int sum = numList[0] + numList[1] + numList[2] + numList[3];
        System.out.println("Index 0번: " + numList[0] + " Index 1번: " + numList[1] + " Index 2번: " + numList[2] + " Index 3번: " + numList[3]);
        int avg = sum / 4;
        int[] result = new int[2];
        result[0] = sum;
        result[1] = avg;
        System.out.println("합계" + result[0] + " 평균: " + result[1]);
        // Return 값은 배열의 주소값 반환.
        return result;
    }

    public static void main(String[] args) {
        int[] num = {5, 7, 3, 2};
        // getSumAvg 의 함수를 호출, Argument 데이터 값을 매개변수(Parameter)에 전달
        int[] totalResult = getSumAvg(num);
        System.out.println("합계" + totalResult[0] + ", 평균: " + totalResult[1]);
    }
}
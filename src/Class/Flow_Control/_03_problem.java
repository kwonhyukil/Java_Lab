package Class.Flow_Control;

import javax.imageio.stream.ImageInputStream;
import java.util.Scanner;

public class _03_problem {
    static void gugudan() {
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " X " + j + " = " + i * j);
            }
            System.out.println(" ");
        }
    }
    static void aToZ() {
        for (char startWord = 'a'; startWord <= 'z'; startWord++) {
            System.out.println(startWord);
        }
        System.out.println();
    }
    static void matrix () {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 32; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

            // 사용자로부터 정수를 입력
            int inputvalue = 3;

            // 1 이면 구구단 출력
            if (inputvalue == 1) {
                _03_problem.gugudan();
            // 2 이면 a ~ z 출력
            } else if (inputvalue == 2) {
                _03_problem.aToZ();
            // 3 이면 8 X 32 "*" 출력
            } else if (inputvalue == 3) {
                _03_problem.matrix();
            }
            switch (inputvalue) {
                case 1:
                    _03_problem.gugudan();
                    break;
                case 2:
                    _03_problem.aToZ();
                    break;
                case 3:
                    _03_problem.matrix();
            }

        }
    }


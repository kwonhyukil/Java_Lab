package special_Class._11._11_23;

public class _01_Problem {
    public static void main(String[] args) {

            char[][] bar = new char[4][];

            bar[0] = new char[5];
            bar[1] = new char[3];
            bar[2] = new char[1];
            bar[3] = new char[4];

            bar[0][0] = 'h';
            bar[0][1] = 'e';
            bar[0][2] = 'l';
            bar[0][3] = 'l';
            bar[0][4] = 'o';
            bar[1][0] = 'H';
            bar[1][1] = 'O';
            bar[1][2] = 'W';
            bar[2][0] = 'a';
            bar[3][0] = 't';
            bar[3][1] = 'o';
            bar[3][2] = 'p';
            bar[3][3] = 's';

            for (int i = 0; i < bar.length; i++) {
                for (int j = 0; j < bar[i].length; j++) {
                    System.out.print(bar[i][j]);
                }

            }
            // char 배열안에 문자를 출력합니다.
            for(char[] value : bar){
                //  각 iteration 마다 배열 내 원소 값을 저장할 변수 선언
                System.out.println(value);
            }
//      foo ---- foo[0] ---- h e l l o
//               foo[1] ---- h o w
//               foo[2] ---- a
//               foo[3] ---- t o p s
//           Data type
//       참조 변수 -> 1차원 배열
//

            }
        }


package special_Class._12._12_09;

public class _00_Practice1 {
    public static void main(String[] args) {

        final int MAX_ROW = 2;
        final int MAX_COL = 3;
        final int NUM_OF_ELEMENT = MAX_ROW * MAX_COL;

        int[][] bar = new int[MAX_ROW][MAX_COL];


//		for(int i = 0 ; i < NUM_OF_ELEMENT ; i++) {
//			System.out.print((int)(i / bar[0].length) + "\t");
//			System.out.print("-------\t");
//			System.out.print(i % bar[0].length + "\t");
//			System.out.print("-------\t");
//			System.out.print(i  + "\t");
//			System.out.println();
//		}

        for (int i = 0; i < NUM_OF_ELEMENT; i++) {

            int temp = (int) (Math.random() * 6) + 1;
            // 중복 값을 찾았나?
            boolean isFound = false;

            for (int j = 0; j < i; j++) {
                // 행의 위치계산            열위치 계산
                if (bar[(int) j / MAX_COL][j % MAX_COL] == temp) {
                    // MAX_COL = 원소의 갯수.
                    i--;
                    // 중복 값을 찾았다.
                    isFound = true;
                    break;
                }
            }
            // 찾지 못했다.
            // isFound == false
            if (!isFound)
                //
                bar[(int) i / MAX_COL][i % MAX_COL] = temp;
        }


    }
}

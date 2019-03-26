import java.util.Scanner;

public class Q_2583 {
    public static void main(String[] args) {
        int[][] wholeArea; // 전체 좌표를 이중배열로 관리
        int M=0, N=0, K=0, point_1=0, point_2=0, point_3=0, point_4=0;
        Scanner SC = new Scanner(System.in);

        while(true) {
            System.out.printf("M, N, K의 값을 입력하세요 >>");
            N = SC.nextInt();
            M = SC.nextInt();
            K = SC.nextInt(); // M, N, K가 빈칸을 사이에 두고 차례로 주어진다.
            wholeArea = new int[M+1][N+1];

            if(M > 100 || N > 100 || K > 100) { // 모두 100이하의 자연수이다.
                System.out.println("100이하의 자연수를 입력해주세요.");
                continue;
            }
            break;
        }

        // 이중배열 초기화(0은 x, 1은 도형)
        for(int i = 0; i < M; i++) {
            for(int j=0; j < N; j++) {
                wholeArea[i][j] = 0;
            }
        }

        for(int i = 0; i < K; i++) { // K개의 줄에는 한 줄에 하나씩
            System.out.printf("좌표 4개 입력 >>");
            point_1 = SC.nextInt();
            point_2 = SC.nextInt();
            point_3 = SC.nextInt();
            point_4 = SC.nextInt();

            // 좌표에 도형 채우기
            for(int k = point_1; k < point_3; k++) {
                for(int j=point_2; j < point_4; j++) {
                    wholeArea[k][j] = 1;
                }
            }
        }

        // 0 인접에 0이 있는지 검사
        for(int i = 0; i < M; i++) {
            for(int j=0; j < N; j++) {
                if(wholeArea[i][j] == 0) {
                    System.out.println("넓이는 = " + adjacentZero(wholeArea, i, j));
                }
                else {
                    continue;
                }
            }
        }

    }

    static int adjacentZero(int[][] area, int i, int j) {
        int areaValue = 0;
        try {
            while (true) {
                if (area[i - 1][j] == 0) {
                    areaValue++;
                    adjacentZero(area, i -1, j);
                }else if (area[i][j - 1] == 0) {
                    areaValue++;
                    adjacentZero(area, i, j - 1);
                }else if (area[i + 1][j] == 0) {
                    areaValue++;
                    adjacentZero(area, i + 1, j);
                }else if (area[i][j + 1] == 0) {
                    areaValue++;
                    adjacentZero(area, i, j + 1);
                }
            }
        } catch (Exception e) {
        }
        return areaValue;
    }
}

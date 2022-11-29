import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    ArrayList<Integer> array = new ArrayList<>();
    int M = 0, N = 0, K = 0;
    int areaValue = 0;

    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }

    public void start() {
        int[][] wholeArea; // 전체 좌표를 이중배열로 관리
        int point_1 = 0, point_2 = 0, point_3 = 0, point_4 = 0;
        Scanner SC = new Scanner(System.in);

        while (true) {
            try {
                M = SC.nextInt();
                N = SC.nextInt();
                K = SC.nextInt(); // M, N, K가 빈칸을 사이에 두고 차례로 주어진다.

                if (M > 100 || N > 100 || K > 100) { // 모두 100이하의 자연수이다.
                    return;
                }
            } catch (Exception e) {
                return;
            }
            wholeArea = new int[N][M];

            // 이중배열 초기화(0은 x, 1은 도형)
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    wholeArea[i][j] = 0;
                }
            }
            break;
        }

        for (int i = 0; i < K; i++) { // K개의 줄에는 한 줄에 하나씩
            try {
                point_1 = SC.nextInt();
                point_2 = SC.nextInt();
                point_3 = SC.nextInt();
                point_4 = SC.nextInt();
                if (point_1 > N || point_3 > N || point_2 > M || point_4 > M) return;
            } catch (Exception e) {
                return;
            }

            // 좌표에 도형 채우기
            for (int k = point_1; k < point_3; k++) {
                for (int j = point_2; j < point_4; j++) {
                    wholeArea[k][j] = 1;
                }
            }
        }

        ArrayList<Integer> arrayList = new ArrayList<>();

        // 0 인접에 0이 있는지 검사
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (wholeArea[i][j] == 0 && is_array(i, j)) {
                    areaValue = 0;
                    int volume = adjacentZero(wholeArea, i, j);
                    if (volume == 0) volume = 1;
                    arrayList.add(volume);
                } else {
                    continue;
                }
            }
        }

        // 정렬
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(i) > arrayList.get(j)) {
                    Collections.swap(arrayList, i, j);
                }
            }
        }

        // 출력
        System.out.println(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.printf(arrayList.get(i) + " ");
        }
    }

    int adjacentZero(int[][] area, int i, int j) {
        if (j > 0 && area[i][j - 1] == 0 && is_array(i, j - 1)) {
            array.add(i);
            array.add(j - 1);
            areaValue++;
            adjacentZero(area, i, j - 1);
        }
        if (i > 0 && area[i - 1][j] == 0 && is_array(i - 1, j)) {
            array.add(i - 1);
            array.add(j);
            areaValue++;
            adjacentZero(area, i - 1, j);
        }
        if (j < M - 1 && area[i][j + 1] == 0 && is_array(i, j + 1)) {
            array.add(i);
            array.add(j + 1);
            areaValue++;
            adjacentZero(area, i, j + 1);
        }
        if (i < N - 1 && area[i + 1][j] == 0 && is_array(i + 1, j)) {
            array.add(i + 1);
            array.add(j);
            areaValue++;
            adjacentZero(area, i + 1, j);
        }
        return areaValue;
    }

    boolean is_array(int a, int b) {
        for (int i = 0; i < array.size(); ) {
            if (array.get(i) == a) {
                if (array.get(i + 1) == b) {
                    return false;
                }
            }
            i = i + 2;
        }
        return true;
    }
}
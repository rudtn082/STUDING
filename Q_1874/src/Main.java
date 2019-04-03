import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int num = SC.nextInt();

        int[] array_1 = new int[num]; // 1~num까지의 배열
        int[] array_2 = new int[num]; // 완성해야할 배열

        for(int i = 0; i < num; i++) { // 배열 채워넣기
            array_1[i] = i+1;
            array_2[i] = SC.nextInt();
        }





    }
}

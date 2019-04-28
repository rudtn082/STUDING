import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        int kilogram = Integer.parseInt(SC.nextLine());

        // 5로 먼저 나누고 나머지를 구한다.
        int five = kilogram / 5;
        int fiveRest = kilogram % 5;

        // 5의 나머지를 3으로 나눈다.
        int three = fiveRest / 3;
        int threeRest = fiveRest % 3;

        // 5로 나눴을 때 나머지가 1이다 (N >= 6일 때)
        if(fiveRest == 1 && kilogram >= 6) {
            System.out.println((five-1) + 2);
        }
        // 5로 나눴을 때 나머지가 2이다 (N >= 22일 때)
        else if(fiveRest == 2 && kilogram >= 22) {
            System.out.println((five-2) + 4);
        }
        // 5로 나눴을 때 나머지가 4이다 (N >= 9일 때)
        else if(fiveRest == 4 && kilogram >= 9) {
            System.out.println((five-1) + 3);
        }
        // 3으로 나눴을 때 나머지가 있으면 3으로만 가능한지 확인
        else if(threeRest != 0) {
            int onlyThree = kilogram % 3;
            // 불가능하면 -1을 출력
            if(onlyThree != 0) System.out.println("-1");
            else System.out.println(kilogram / 3);
        }
        // 그 외 경우
        else System.out.println(five + three);
    }
}

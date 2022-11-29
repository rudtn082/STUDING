import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        while (true) {
            int A = SC.nextInt();
            int B = SC.nextInt();

            if(A <= 0 || B >= 10) break;
            if(A + B == 0) break;

            System.out.println(A+B);
        }
    }
}

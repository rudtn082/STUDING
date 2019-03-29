import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        while (SC.hasNextInt()) {
            int A = SC.nextInt();
            int B = SC.nextInt();

            System.out.println(A+B);
            if(A <= 0 && B >= 10) return;
        }
    }
}

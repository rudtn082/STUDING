import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        int A = SC.nextInt();
        int B = SC.nextInt();

        if(A <= 0 || B >=10) return;

        System.out.println(A-B);
    }
}

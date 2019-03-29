import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        int num = SC.nextInt();
        SC.nextLine();

        for(int i = 0; i < num; i++) {
            String Line = SC.nextLine();
            int A = Integer.parseInt(String.valueOf(Line.charAt(0)));
            int B = Integer.parseInt(String.valueOf(Line.charAt(2)));

            if(A <= 0 || B >= 10) return;

            System.out.println(A+B);
        }
    }
}

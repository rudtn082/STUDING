import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        int A=0, B=0, num = SC.nextInt();
        int[] numArray = new int[num];

        for(int i = 0; i < num; i++) {
            A = SC.nextInt();
            B = SC.nextInt();
            numArray[i] = A+B;
        }

        if(A <= 0 && B >= 10) return;

        for(int i = 0; i < numArray.length; i++) {
            System.out.println(numArray[i]);
        }
    }
}

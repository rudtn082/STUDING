import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int num = SC.nextInt();

        ArrayList<Integer> stack = new ArrayList<>();
        int[] array_2 = new int[num]; // 입력된 수열

        for(int i = 0; i < num; i++) { // 배열 채워넣기
            array_2[i] = SC.nextInt();
        }

        ArrayList<Character> printArray = new ArrayList<>();

        int k = 0, i = 1;
        while(k != num) {
            int searchNum = array_2[k];
            while (true) {
                    if(stack.size() == 0 || stack.get(stack.size()-1) != searchNum) {
                        stack.add(i++);
                        printArray.add('+');
                        if(i > num+1) {
                            System.out.println("NO");
                            return;
                        }
                    }
                    else {
                        if(stack.size() <= 0) {
                            System.out.println("NO");
                            return;
                        }
                        stack.remove(stack.size()-1);
                        printArray.add('-');
                        break;
                    }
            }
            k++;
        }

        for(int j = 0; j < printArray.size(); j++) {
            System.out.println(printArray.get(j));
        }
    }
}

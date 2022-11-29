import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static boolean is_big(ArrayList<Integer> array, int n) {
        int num = array.get(n);
        for(int i = n; i < array.size(); i++) {
            if(num < array.get(i)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        ArrayList<Integer> Queue = new ArrayList<>(); // 큐
        ArrayList<Integer> importance = new ArrayList<>(); // 찾을 위치

        int tasecase = SC.nextInt();
        SC.nextLine();

        for(int i = 0; i < tasecase; i++) {
            String line = SC.nextLine();
            String splitLine[] = line.split(" ");
            int length = Integer.parseInt(splitLine[0]);
            int locate = Integer.parseInt(splitLine[1]);

            line = SC.nextLine();
            String splitLine2[] = line.split(" ");

            for(int j = 0; j < length; j++) {
                Queue.add(Integer.parseInt(splitLine2[j]));
                if(j == locate) importance.add(1);
                else importance.add(0);
            }

            // 정렬
            int temp = 0;

            if(Queue.size() > 1) {
                for(int j = 0; j < Queue.size()-1; j++) {
                    for(int k = 0; k < Queue.size()-1; k++) {
                        int n = j;
                        if(is_big(Queue, n)) {
                            temp = Queue.remove(n);
                            Queue.add(temp);
                            temp = importance.remove(n);
                            importance.add(temp);
                        }
                    }
                }
            }



            for(int j = 0; j < importance.size(); j++) {
                if(importance.get(j) == 1) System.out.println(j+1);
            }

            Queue.removeAll(Queue);
            importance.removeAll(importance);
        }
    }
}

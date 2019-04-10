import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        ArrayList<Integer> Queue = new ArrayList<>();

        int num = SC.nextInt();
        SC.nextLine();

        for(int i = 0; i < num; i++) {
            String str = SC.nextLine();

            String[] splitStr = str.split(" ");

            switch (splitStr[0]) {
                case "push":
                    Queue.add(Integer.valueOf(splitStr[1]));
                    break;
                case "pop":
                    if(Queue.size() == 0) System.out.println(-1);
                    else {
                        System.out.println(Queue.get(0));
                        Queue.remove(0);
                    }
                    break;
                case "size":
                    System.out.println(Queue.size());
                    break;
                case "empty":
                    if(Queue.size() == 0) System.out.println(1);
                    else System.out.println(0);
                    break;
                case "front":
                    if(Queue.size() == 0) System.out.println(-1);
                    else System.out.println(Queue.get(0));
                    break;
                case "back":
                    if(Queue.size() == 0) System.out.println(-1);
                    else System.out.println(Queue.get(Queue.size()-1));
                    break;
            }
        }
    }
}

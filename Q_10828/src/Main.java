import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private ArrayList<Integer> stack = new ArrayList<>();

    public void pushItem(int item) {
        stack.add(item);
    }

    public void popItem() {
        if(stack.size() <= 0) System.out.println(-1);
        else System.out.println(stack.remove(stack.size()-1));
    }

    public void stackSize() {
        System.out.println(stack.size());
    }

    public void isEmpty() {
        if(stack.size() == 0) System.out.println(1);
        else System.out.println(0);
    }

    public void stackTop() {
        if(stack.size() == 0) System.out.println(-1);
        else System.out.println(stack.get(stack.size()-1));
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        Main stack = new Main();

        int comNum = SC.nextInt();
        SC.nextLine();

        for(int i = 0; i < comNum; i++) {
            String Line = SC.nextLine();
            String[] splitStr = Line.split(" "); // 띄어쓰기로 split해서 첫 번째 단어만 확인

            switch (splitStr[0]) {
                case "push":
                    stack.pushItem(Integer.parseInt(splitStr[1]));
                    break;
                case "pop":
                    stack.popItem();
                    break;
                case "size":
                    stack.stackSize();
                    break;
                case "empty":
                    stack.isEmpty();
                    break;
                case "top":
                    stack.stackTop();
                    break;
            }
        }
    }
}

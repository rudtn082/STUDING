import java.util.*;

class Ball implements Comparable<Ball>{
    int Color;
    int Value;
    int idx;

    public Ball(int color, int Value, int idx) {
        this.Color = color;
        this.Value = Value;
        this.idx = idx;
    }

    public int getValue() {
        return Value;
    }

    public int getColor() {
        return Color;
    }

    public int getIdx() {
        return idx;
    }

    @Override
    public int compareTo(Ball arg) {
        return this.Value - arg.Value;
    }
}

class Main {

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int num = Integer.parseInt(SC.nextLine());

        int score[] = new int[num];
        int color[] = new int[num + 1];
        Ball temp[] = new Ball[num];

        for (int i = 0; i < num; i++) {
            String line = SC.nextLine();
            String[] splitLine = line.split(" ");

            temp[i] = new Ball(Integer.parseInt(splitLine[0]), Integer.parseInt(splitLine[1]), i);
        }

        Arrays.sort(temp);
        int result = 0;


        for (int i = 0, j = 0; i < num; i++) {
            for (; temp[j].getValue() < temp[i].getValue(); j++) {
                result += temp[j].getValue();
                color[temp[j].getColor()] += temp[j].getValue();
            }
            score[temp[i].getIdx()] += result - color[temp[i].getColor()];
        }

        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
        }
    }
}
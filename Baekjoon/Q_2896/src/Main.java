import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static double min(double a, double b) {
        if (a < b) return a;
        else return b;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String[] splitStr = s1.split(" ");
        String s2 = br.readLine();
        String[] splitStr2 = s2.split(" ");

        double a = Double.parseDouble(splitStr[0]),b = Double.parseDouble(splitStr[1]),c = Double.parseDouble(splitStr[2]),i = Double.parseDouble(splitStr2[0]),j = Double.parseDouble(splitStr2[1]),k = Double.parseDouble(splitStr2[2]),m;


        m=min(min(a/i,b/j),c/k);
        System.out.println((a-m*i) + " " + (b-m*j) + " " + (c-m*k));
    }
}

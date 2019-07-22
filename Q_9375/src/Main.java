import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        int inputN = Integer.parseInt(br.readLine());
        int[] cases = new int[inputN];

        for(int i = 0; i < inputN; i++) {
            int clothes = Integer.parseInt(br.readLine());

            for(int k = 0; k < clothes; k++) {
                String[] clothesType = new String[clothes];

                String[] clothesName =  br.readLine().split(" ");
                clothesType[k] = clothesName[1];

                int temp = 0;
                try {
                    temp = hm.get(clothesType[k]);
                } catch (Exception e) {

                } finally {
                    if(temp > 0) {
                        hm.put(clothesType[k], ++temp);
                    }
                    else hm.put(clothesType[k], 1);
                }
            }

            Set keyset = hm.keySet();
            Iterator iterator = keyset.iterator();

            int[] x = new int[keyset.size()];
            int k = 0;

            while (iterator.hasNext()) {
                String key = (String)iterator.next();
                x[k++] = hm.get(key)+1;
            }

            int xx = 1;
            for(int j = 0; j < x.length; j++) {
                xx *= x[j];
            }
            cases[i] = xx-1;

            hm.clear();

        }


        for(int i = 0; i < cases.length; i++) {
            System.out.println(cases[i]);
        }
    }
}

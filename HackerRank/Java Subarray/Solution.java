import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        List<Integer> arr = new ArrayList<Integer>();
        
        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            arr.add(a);
        }
        
        for(int i = 0; i < n; i++) {
            int sum = 0;
            for(int j = i; j < n; j++) {
                sum += arr.get(j);
                if(sum < 0) result++;
            }
            
        }
        
        System.out.println(result);
    }
}
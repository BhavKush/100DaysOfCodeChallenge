import java.io.*;

import java.util.*;




public class Solution {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        int n, s = 0;
        n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            s = s + arr[i];
        }
        System.out.println(s);
    }
}

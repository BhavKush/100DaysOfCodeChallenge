import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        
        int ans = 0;
        
        for(int j=1;j<=100;j++)
            {
            boolean hh = true;
            for(int bb : b)
                {
                if(bb%j!=0)
                    {
                    hh = false;
                    break;
                }
            }
            
            if(hh)
                {
                 for(int bb : a)
                {
                if(j%bb!=0)
                    {
                    hh = false;
                    break;
                }
            }
                
                if(hh)
                    ans++;
                
            }
        }
        
        System.out.println(ans);
    }
}

import java.io.*;

import java.util.*;

public class Solution {
    public static void main(String[] args){
        int n,s=0,s2=0,t=0;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                if(i==j) {
                    s = s + arr[i][j];
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                    s2 = s2 + arr[i][n-1-i];
                    break;
            }
        }
        if(s>s2){
        t=s-s2;
        }
        else{
            t=s2-s;
        }
        System.out.println(t);
        
}
}

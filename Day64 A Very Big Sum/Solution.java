import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n;
       long s=0;
       n=sc.nextInt();
       long[] arr = new long[n];
       for(int i=0;i<n;i++)
       {
           arr[i]=sc.nextLong();
       }
       for(int i=0;i<n;i++)
       {
           s=s+arr[i];
       }
       System.out.println(s);
    }
}

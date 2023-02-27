//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int sum = sc.nextInt();
            int N = sc.nextInt();
            int coins[] = new int[N];
            for (int i = 0; i < N; i++) coins[i] = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.count(coins, N, sum));
        }
    }
}


// } Driver Code Ends


// User function Template for Java

class Solution {
    public long count(int coins[], int n, int sum) {
        // code here.
        long t[][]=new long[n+1][sum+1];
        for(int i=0;i<n+1;i++)
        {
            for(int j=0;j<sum+1;j++)
            {
                if(i==0 && j==0)
                {
                    t[i][j]=1;
                }
                else if(i==0)
                {
                    t[i][j]=0;
                }
                else if(j==0)
                {
                    t[i][j]=1;
                }
            }
        }
        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<sum+1;j++)
            {
                if(i>0)
                {
                if(coins[i-1]<=j)
                {
                    t[i][j]=t[i-1][j]+t[i][j-coins[i-1]];
                }
                else
                {
                    t[i][j]=t[i-1][j];
                }
                }
            }
        }
        return t[n][sum];
    }
}

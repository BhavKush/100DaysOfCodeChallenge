//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N, M, x, y;
            String S[] = read.readLine().split(" ");
            N = Integer.parseInt(S[0]);
            M = Integer.parseInt(S[1]);
            int a[][] = new int[N][M];
            for (int i = 0; i < N; i++) {
                String s[] = read.readLine().split(" ");
                for (int j = 0; j < M; j++) a[i][j] = Integer.parseInt(s[j]);
            }
            Solution ob = new Solution();
            System.out.println(ob.maximumSumRectangle(N, M, a));
        }
    }
}
// } Driver Code Ends


// User function Template for Java





class Solution {
    public static int kadane(int[] sum){
        int x=0;
        int maxSum=sum[0];
        for(int i=0;i<sum.length;i++){
            x+=sum[i];
            if(x>maxSum){
                maxSum=x;
            }
            if(x<0){
                x=0;
            }
        }
        return maxSum;
    }
    int maximumSumRectangle(int n, int m, int a[][]) {
        int[] sum=new int[n];
        int maxSum=Integer.MIN_VALUE;
        int[][] prefix=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                prefix[i][j]=a[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=1;j<m;j++){
                prefix[i][j]+=prefix[i][j-1];
            }
        }
        int firstCol=0,secondCol=0,firstRow=0,secondRow=0;
        for(firstCol=0;firstCol<m;firstCol++){
            Arrays.fill(sum,0);
            for(secondCol=firstCol;secondCol<m;secondCol++){
                for(int row=0;row<n;row++){
                    sum[row]=prefix[row][secondCol]-(firstCol>0 ? prefix[row][firstCol-1]:0);
                }
                int lsum=kadane(sum);
                if(lsum>maxSum){
                    maxSum=lsum;
                }
            }
        }
        return maxSum;
    }
};

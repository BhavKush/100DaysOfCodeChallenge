//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
         BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t= Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            int matrix[][] = new int[n][n];
            String st[] = read.readLine().trim().split("\\s+");
            int k = 0;
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                    matrix[i][j] = Integer.parseInt(st[k++]);
            }
            Solution ob = new Solution();
            ob.rotateby90(matrix, n);
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                    System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java



//User function Template for Java

class Solution
{
    //Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int a[][], int n) 
    { 
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp=a[j][i];
                a[j][i]=a[i][j];
                a[i][j]=temp;
            }
        }
        // code here
        // int temp;
        for(int i=0;i<n;i++){
            for(int j=0,k=n-1;j<k;j++,k--){
                int temp=a[j][i];
                a[j][i]=a[k][i];
                a[k][i]=temp;
                
            }
        }
        
    }
    
    public static void swap(int x,int y){
        int temp=x;
        x=y;
        y=temp;
    }
}

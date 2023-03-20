//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int N=sc.nextInt();
                    String S=sc.next();
                        
                    Solution obj = new Solution();
                    
                    
                    System.out.println(obj.CountPS(S,N));
                    
                }
                
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int CountPS(String S, int N)
    {
         int count = 0;
    for(int i = 0; i < S.length(); i++) {
      // odd
      int l = i-1, r = i+1;
      while(l >= 0 && r < S.length() && S.charAt(r) == S.charAt(l)) {
        count++; l--; r++;
      }
      // even
      l = i;r = i+1;
      while(l >= 0 && r < S.length() && S.charAt(r) == S.charAt(l)) {
        count++; l--; r++;
      }
    }
    return count;
    }
}

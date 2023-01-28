import java.io.*;

import java.util.*;


public class Solution {
    public static void main(String[] args)
{
        Scanner sc = new Scanner(System.in);
        // int n;
        // n=sc.nextInt();
        int al=0,bo=0;
        int[] a = new int[3];
        int[] b = new int[3];

        for (int i=0;i<3;i++)
        {
            a[i]=sc.nextInt();
        }
        for (int i=0;i<3;i++)
        {
            b[i]=sc.nextInt();
        }
        for (int i =0;i<3;i++)
        {
            if(a[i] > b[i]){
                al++;
            }
            else if(a[i]<b[i])
            {
                bo++;
            }
        }
        System.out.print(al +" "+ bo);
    }
    }


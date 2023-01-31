import java.io.*;

import java.util.*;




public class Solution {
    public static void main(String[] args) {
    double pos_c=0,neg_c=0,zero_c=0;
        double n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextDouble();
        double [] arr= new double[(int) n];
        double [] res_arr = new double[3];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]<0){
                neg_c++;
            } else if (arr[i]>0) {
                pos_c++;
            }
            else if (arr[i]==0){
                zero_c++;
            }
        }
        res_arr[0]=pos_c/n;
        res_arr[1]=neg_c/n;
        res_arr[2]=zero_c/n;
        System.out.println(String.format("%.6f", res_arr[0]));
        System.out.println(String.format("%.6f", res_arr[1]));
        System.out.println(String.format("%.6f", res_arr[2]));
    }
}

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        for(int score_i=0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
        }
        int max=score[0];
        int min=score[0];
        int maxcount=0;
        int mincount=0;
        for(int i=1;i<n;i++){
            if(score[i]>max){
                max=score[i];
                maxcount=maxcount+1;
            }
            if(score[i]<min){
                min=score[i];
                mincount=mincount+1;
            }
        }
        System.out.println(maxcount+" "+mincount);
        // your code goes here
    }
}

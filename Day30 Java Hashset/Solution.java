import java.io.*; import java.util.*;

public class Solution {

public static void main(String[] args) {
    Scanner a= new Scanner(System.in);
    int b= a.nextInt();

   HashSet<String> hs = new HashSet<String>();
   for(int i=0; i<b; i++){
       String c= a.next();
       String d= a.next();

       hs.add(c + " " + d);

       System.out.println(hs.size());

   }
}
}

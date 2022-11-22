import java.util.*;
class Solution{
    
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            String input=sc.next();
            System.out.println(isBalanced(input));
        }
        
    }
    
    public static String isBalanced(String s){
        Stack<Character> stack = new Stack();
        
        for(int i=0;i<s.length();i++){
            if (s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }
            else{
                char pop_val;
                try{
                    pop_val = stack.pop();
                }catch(Exception e){
                    pop_val = '\u0000';
                }
                if (s.charAt(i)==')' && pop_val!='(') return "false";
                else if (s.charAt(i)=='}' && pop_val!='{') return "false";
                else if (s.charAt(i)==']' && pop_val!='[') return "false";
                else continue;
        }}
        if (!stack.isEmpty()) return "false";
        else return "true";
    }
}

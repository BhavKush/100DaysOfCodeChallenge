import java.util.*;
    public class test {
        public static void main(String[] args) {
            
            Scanner in = new Scanner(System.in);
            
            Deque<Integer> deque = new ArrayDeque<>();
            HashSet<Integer> hashSet = new HashSet<>();
            
            int totalNumberOfIntegers = in.nextInt();
            int sizeOfTheSubarray = in.nextInt();
            
            int max = 0;
            
            for (int i = 0; i < totalNumberOfIntegers; i++) {
                
                int num = in.nextInt();
                deque.add(num);
                hashSet.add(num);
                
                if(deque.size() == sizeOfTheSubarray){
                    
                    if(hashSet.size() > max){
                        max = hashSet.size();
                    }
                    
                    int removed = (int)deque.removeFirst();
                    
                    if(!deque.contains(removed)){
                        hashSet.remove(removed);
                    }
                }
            }
            
            System.out.println(max);
            
        }
    }

import java.util.*;
    public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(returnMaxUniqueSubArray(m, arr));

    }

    private static int returnMaxUniqueSubArray(int m, int[] arr) {
        Deque<Integer> deque = new ArrayDeque<>();
        List<Integer> maxList = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < m; i++) {
            deque.add(arr[i]);
        }
        // 5 3 5 2 3 2 m=3
        //System.out.println("initial deque= " + deque);
        int j = 0;
        while (j + (m - 1) < arr.length) {
           // System.out.println("deque= " + deque + " set= " + set + " j=" + j + " maxList= " + maxList);
            j++;
            set.clear();
            set.addAll(deque); //
            maxList.add(set.size());
            if(j+m-1<arr.length) {
                deque.addLast(arr[j + m - 1]);
                deque.removeFirst();
            }else break;
        }
        Collections.sort(maxList);
       // System.out.println(maxList);
        return maxList.get(maxList.size() - 1);
    }
    }

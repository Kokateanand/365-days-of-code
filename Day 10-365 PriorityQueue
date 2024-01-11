import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        inp.nextLine();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            int a = inp.nextInt();
            int b = inp.nextInt();
            inp.nextLine();
            if (a == 1)
                pq.offer(b);
            else if (a == 2) {
                if (pq.size() == 0) System.out.println("-1");
                else System.out.println(pq.peek());
            } else {
                if (pq.size() == 0) continue;
                else pq.poll();
            }
        }

    }
}

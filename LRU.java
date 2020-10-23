package LRU;


import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        // Protype Code for implementing LRU
        // Queue here is tlb
        // and by inputting we can give the page which is needed by OS
        // so its a protype and we can implement it
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i <= 5; i++) {
            q.add(i);
            set.add(i);
        }
        Scanner sc = new Scanner(System.in);
        while (1 != 0) {
            String s = sc.next();
            if (s.equals("no"))
                break;
            int k = Integer.parseInt(s);
            if (set.contains(k)) {
                System.out.println("Already Present in Cache");
                q.remove(k);
                q.add(k);
            } else {
                q.poll();
                q.add(k);

            }
            System.out.println(q);
        }
        sc.close();

    }
}

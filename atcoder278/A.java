package atcoder278;

import java.util.LinkedList;
import java.util.Scanner;

public class A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            int res = sc.nextInt();
            list.add(res);
        }
        for (int i = 0; i < k; i++) {
            list.remove(0);
            list.add(0);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}

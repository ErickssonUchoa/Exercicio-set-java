package application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        System.out.print("How many students for course A? ");
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            int id = sc.nextInt();
            a.add(id);
        }

        Set<Integer> b = new HashSet<>();
        System.out.print("How many students for course B? ");
        n = sc.nextInt();
        for (int i=0; i<n; i++) {
            int id = sc.nextInt();
            b.add(id);
        }

        Set<Integer> c = new HashSet<>();
        System.out.print("How many students for course C? ");
        n = sc.nextInt();
        for (int i=0; i<n; i++) {
            int id = sc.nextInt();
            c.add(id);
        }

        Set<Integer> total = new HashSet<>(a);
        total.addAll(b);
        total.addAll(c);

        System.out.println("Total Students: " + total.size());
    }
}

import java.util.TreeSet;
import java.util.Scanner;
import java.util.Set;

public class App69 {
    public static void main(String[] args) {
        int n, number;

        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> set = new TreeSet<>();
        System.out.println("nhap so phan tu: ");
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("nhap phan tu thu " + (i + 1) + ":");
            number = sc.nextInt();
            set.add(number);
        }
        System.out.println("cac phan tu trong set: ");
        System.out.println(set);
        System.out.println("nhap so can them: ");
        number = sc.nextInt();
        if (!set.contains(number)) {
            set.add(number);
            System.out.println("them thanh cong");
            System.out.println("cac phan tu trong set:");
            System.out.println(set);
        } else
            System.out.println("phan tu " + number + "khong co trong set");
    }
}
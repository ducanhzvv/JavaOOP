package Chuong4;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class deletelinkedhashset 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        int a;
        System.out.println("moi nhap so luong cac phan tu: ");
        a = scanner.nextInt();
        System.out.println("nhap cac phan tu: ");
        scanner.nextLine();
        for(int i = 0; i < a; i++)
        {
            String n;
            n = scanner.nextLine();
            lhs.add(n);
        }
        System.out.println("LinkedHashSet sau khi nhap la: ");
        for(String x : lhs)
        {
            System.out.println(x + " ");
        }
        System.out.println("nhap phan tu muon xoa: ");
        String m;
        m = scanner.nextLine();
        if(lhs.contains(m))
        {
            lhs.remove(m);
        }
        System.out.println("cac phan tu con lai sau khi xoa la: ");
        for(String x : lhs)
        {
            System.out.print(x + " ");
        }
    }
}

package Chuong4;

import java.util.HashSet;
import java.util.Scanner;

public class addHashSet 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> hs = new HashSet<>();
        String a;
        System.out.println("moi nhap cac phan tu: ");
        a = scanner.nextLine();
        hs.add(a);
        System.out.println("nhap vao phan tu muon them: ");
        String n;
        n = scanner.nextLine();
        if(hs.contains(n))
            System.out.println("phan tu da co trong Hashset");
        else
        {
            hs.add(n);
            {
                System.out.println("hashset sau khi them phan tu moi");
            }
            for(String x : hs)
            {
                System.out.print(x + " ");
            }
        }
    }
}

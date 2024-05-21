package Chuong4;

import java.util.HashSet;
import java.util.Scanner;

public class deletehashset 
{
    
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> hs = new HashSet<>();
        String a;
        System.out.println("moi nhap cac phan tu: ");
        a = scanner.nextLine();
        hs.add(a);
        System.out.println("nhap phan tu muon xoa khoi hashset: ");
        String n;
        n = scanner.nextLine();
        if(hs.contains(n))
        {
            hs.remove(n);
        }
        System.out.println("phan tu con lai cua hashset la: ");
        for (String x : hs)
        {
            System.out.print( x + " ");
        }
    }
}
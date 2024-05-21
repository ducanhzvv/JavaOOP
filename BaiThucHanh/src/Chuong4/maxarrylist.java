package Chuong4;

import java.util.ArrayList;
import java.util.Scanner;

public class maxarrylist 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> maxlist = new ArrayList<>();
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so luong phan tu: ");
        x = scanner.nextInt();
        for(int i = 0; i < x; i ++)
        {
            int n;
            System.out.println(" nhap phan tu thu " + i + 1 + " : ");
            n = scanner.nextInt();
            maxlist.add(n);
        }
        int max = maxlist.get(0);
        for(int i = 1; i < x; i++)
        {
            if(maxlist.get(i) > max)
            {
                max = maxlist.get(i);
            }
        }
        System.out.println("phan tu co gia tri lon nhat cua list la: " + max);
    }
}

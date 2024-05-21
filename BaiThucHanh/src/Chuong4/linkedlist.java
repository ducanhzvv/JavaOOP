package Chuong4;

import java.util.LinkedList;
import java.util.Scanner;

public class linkedlist 
{
    public static void main(String[] args) 
    {
    LinkedList<String> llist = new LinkedList<>();
    Scanner scanner = new Scanner(System.in);
    int x;
    System.out.print("Nhap so luong phan tu: ");
    x = scanner.nextInt();
    scanner.nextLine(); // Tiêu thụ dòng trống còn lại

    for (int i = 0; i < x; i++) 
    {
        System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
        String a = scanner.nextLine();
        llist.add(a);
    }

    int n;
    do {
        System.out.print("Nhap chi so cua phan tu can lay (tu 0 den " + (llist.size() - 1) + "): ");
        n = scanner.nextInt();
    } while (n < 0 || n >= llist.size());

    System.out.println("Phan tu co chi so = " + n + " la phan tu " + llist.get(n -1) + " trong List");
    }
}

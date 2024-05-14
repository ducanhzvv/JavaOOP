package Chuong4;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylistst {
    public static void main(String[] args) 
    {
        ArrayList<student> arrayListst = new ArrayList<student>();
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so luong sinh vien: ");
        a = scanner.nextInt();
        for (int i = 0; i < a; i++)
            {
                student st = new student();
                System.out.println("thong tin sinh vien thu " +(i + 1) + ": ");
                st.nhapthongtin();
                arrayListst.add(st);
            }
        for ( student st : arrayListst)
        {   
            {   
                for (int i = 0; i < a; i++)
                {
                    System.out.println("thong tin sinh vien thu " +(i + 1) + ": ");
                    st.in();
                }
            }
        }
    }
}
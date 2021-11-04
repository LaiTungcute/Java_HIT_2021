package Bai1;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhập số sách: ");
        n = sc.nextInt();
        Sach[] a = new Sach[n];
        for (int i=0;i<n;i++) {
            a[i] = new Sach();
            System.out.println("Nhập thông tin của cuốn sách thứ "+(i+1)+": ");
            a[i].nhap();
        }
        for (int i=0;i<n;i++) {
            System.out.println("THÔNG TIN  CUỐN SÁCH "+(i+1)+": ");
            a[i].xuat();
        }
    }
}

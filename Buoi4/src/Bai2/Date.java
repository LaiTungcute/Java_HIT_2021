package Bai2;

import java.util.Scanner;

public class Date {
    Scanner sc = new Scanner(System.in);
    private int D,M,Y;

    public Date() {
    }

    public Date(int d, int m, int y) {
        D = d;
        M = m;
        Y = y;
    }

    public void Nhap() {
        System.out.print("Nhập ngày: ");
        D = sc.nextInt();
        System.out.print("Nhập tháng: ");
        M = sc.nextInt();
        System.out.print("Nhập năm: ");
        Y = sc.nextInt();
    }

    public void Xuat() {
        System.out.println(D+"/"+M+"/"+Y);
    }
}

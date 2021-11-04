package Bai4;

import java.util.Scanner;

public class Quanly {
    Scanner sc = new Scanner(System.in);
    private String Maql;
    private String Hoten;

    public Quanly() {

    }

    public Quanly(String maql, String hoten) {
        Maql = maql;
        Hoten = hoten;
    }

    @Override
    public String toString() {
        return "Quanly{" +
                "Maql='" + Maql + '\'' +
                ", Hoten='" + Hoten + '\'' +
                '}';
    }

    public void nhap(){
        System.out.print("Nhập mã quản lý: ");
        Maql = sc.nextLine();
        System.out.print("Nhập họ tên: ");
        Hoten = sc.nextLine();
    }
    public void xuat() {
        System.out.println(toString());
    }
}
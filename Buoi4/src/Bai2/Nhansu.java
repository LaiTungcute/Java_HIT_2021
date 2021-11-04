package Bai2;

import java.util.Scanner;

public class Nhansu {
    Scanner sc = new Scanner(System.in);
    private String Manhansu;
    private String Hoten;
    private Date NS = new Date();

    public Nhansu() {
    }

    public Nhansu(String manhansu, String hoten, Date NS) {
        Manhansu = manhansu;
        Hoten = hoten;
        this.NS = NS;
    }

    public void Nhap() {
        System.out.print("Nhập mã nhân sự: ");
        Manhansu = sc.nextLine();
        System.out.print("Nhập họ tên: ");
        Hoten = sc.nextLine();
        System.out.print("Nhập ngày tháng năm: ");
        NS.Nhap();
    }

    public void Xuat() {
        System.out.println("Mã nhân sự: "+Manhansu);
        System.out.println("Họ tên: "+Hoten);
        System.out.print("NS: ");
        NS.Xuat();
    }
}

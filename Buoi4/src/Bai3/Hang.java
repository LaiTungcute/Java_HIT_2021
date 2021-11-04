package Bai3;

import java.util.Scanner;

public class Hang {
    Scanner sc = new Scanner(System.in);
    private String Mahang;
    private String Tenhang;
    private long Dongia;

    public Hang() {

    }

    public Hang(String mahang, String tenhang, long dongia) {
        Mahang = mahang;
        Tenhang = tenhang;
        Dongia = dongia;
    }

    public String getMahang() {
        return Mahang;
    }

    public void setMahang(String mahang) {
        Mahang = mahang;
    }

    public String getTenhang() {
        return Tenhang;
    }

    public void setTenhang(String tenhang) {
        Tenhang = tenhang;
    }

    public long getDongia() {
        return Dongia;
    }

    public void setDongia(long dongia) {
        Dongia = dongia;
    }

    @Override
    public String toString() {
        return "Hang{" +
                "Mahang='" + Mahang + '\'' +
                ", Tenhang='" + Tenhang + '\'' +
                ", Dongia=" + Dongia +
                '}';
    }

    public void Nhap() {
        System.out.print("Nhập mã hàng: ");
        Mahang = sc.nextLine();
        System.out.print("Nhập tên hàng: ");
        Tenhang = sc.nextLine();
        System.out.print("Nhập đơn giá: ");
        Dongia = sc.nextInt();
        sc.nextLine();
    }

    public void Xuat() {
        System.out.println(toString());
    }
}

package Bai1;

import java.util.Scanner;

public class Sach {
    Scanner sc = new Scanner(System.in);
    private String Masach;
    private String Tensach;
    private String Nxb;
    private int Sotrang;
    private long Giatien;

    public Sach() {

    }

    public Sach(Scanner sc, String masach, String tensach, String nxb, int sotrang, long giatien) {
        this.sc = sc;
        Masach = masach;
        Tensach = tensach;
        Nxb = nxb;
        Sotrang = sotrang;
        Giatien = giatien;
    }

    public String getMasach() {
        return Masach;
    }

    public void setMasach(String masach) {
        Masach = masach;
    }

    public String getTensach() {
        return Tensach;
    }

    public void setTensach(String tensach) {
        Tensach = tensach;
    }

    public String getNxb() {
        return Nxb;
    }

    public void setNxb(String nxb) {
        Nxb = nxb;
    }

    public int getSotrang() {
        return Sotrang;
    }

    public void setSotrang(int sotrang) {
        Sotrang = sotrang;
    }

    public long getGiatien() {
        return Giatien;
    }

    public void setGiatien(long giatien) {
        Giatien = giatien;
    }

    public void nhap() {
        System.out.print("Nhập mã sách: ");
        Masach = sc.nextLine();
        System.out.print("Nhập tên sách: ");
        Tensach = sc.nextLine();
        System.out.print("Nhập tên nhà xuất bản: ");
        Nxb = sc.nextLine();
        System.out.print("Nhập số trang: ");
        Sotrang = sc.nextInt();
        System.out.print("Nhập giá tiền: ");
        Giatien = sc.nextLong();
        sc.nextLine();
    }

    @Override
    public String toString() {
        return "Sach{" +
                "Masach='" + Masach + '\'' +
                ", Tensach='" + Tensach + '\'' +
                ", Nxb='" + Nxb + '\'' +
                ", Sotrang=" + Sotrang +
                ", Giatien=" + Giatien +
                '}';
    }

    public void xuat() {
        System.out.println(toString());
    }
}
    //Eclipse: alt + shift + s
    //Netbean: alt + insert
    //intel: alt + insert
    //ctrl + D: duplicate line

package Bai3;

import java.util.Scanner;

public class Phieu {
    Scanner sc = new Scanner(System.in);
    private String Maphieu;
    private int n;
    private Hang[] x;

    public Phieu() {

    }

    public Phieu(String maphieu, int n, Hang[] x) {
        Maphieu = maphieu;
        this.n = n;
        this.x = x;
    }

    public void Nhap() {
        System.out.print("Nhập mã phiếu: ");
        Maphieu = sc.nextLine();
        System.out.print("Nhập số mặt hàng: ");
        n = sc.nextInt();
        System.out.println("\t\t\t\tNhập thông tin các mặt hàng");
        x = new Hang[n];
        for (int i=0;i<n;i++) {
            x[i] = new Hang();
            System.out.println("Nhập thông tin mặt hàng "+(i+1)+": ");
            x[i].Nhap();
        }
    }

    public void Xuat() {
        System.out.println("Mã phiếu: "+Maphieu);
        System.out.println("\t\t\t\tThông tin các mặt hàng");
        for (int i=0;i<n;i++) {
            System.out.println("Thông tin mặt hàng "+(i+1)+": ");
            x[i].Xuat();
        }
        System.out.println("Tổng số tiền la: "+tong());
    }

    private long tong() {
        long s=0;
        for (int i=0;i<n;i++) {
            s+=x[i].getDongia();
        }
        return s;
    }
}

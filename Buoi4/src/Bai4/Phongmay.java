package Bai4;

import java.util.Arrays;
import java.util.Scanner;

public class Phongmay {
    Scanner sc = new Scanner(System.in);
    private String Maphong;
    private String Tenphong;
    private int Dientich;
    private Quanly x;
    private May[] y;
    private int n;

    public Phongmay() {

    }

    public Phongmay(String maphong, String tenphong, int dientich, Quanly x, May[] y, int n) {
        Maphong = maphong;
        Tenphong = tenphong;
        Dientich = dientich;
        this.x = x;
        this.y = y;
        this.n = n;
    }

    public void nhap() {
        System.out.print("Nhập mã phòng: ");
        Maphong = sc.nextLine();
        System.out.print("Nhập tên phòng: ");
        Tenphong = sc.nextLine();
        System.out.print("Nhập diện tích: ");
        Dientich = sc.nextInt();
        x = new Quanly();
        x.nhap();
        System.out.print("Nhập số máy: ");
        n = sc.nextInt();
        y = new May[n];
        System.out.println("\t\t\t\tNHẬP CÁC THÔNG TIN VỀ MÁY");
        for(int i=0;i<n;i++) {
            y[i] = new May();
            System.out.println("Nhập thông tin của máy thứ "+(i+1)+": ");
            y[i].nhap();
        }
        sc.nextLine();
    }
    public void xuat() {
        System.out.println("Mã phòng: "+Maphong);
        System.out.println("Tên phòng: "+Tenphong);
        System.out.println("Diện tích phòng: "+Dientich);
        x.xuat();
        System.out.println("\t\t\t\tTHÔNG TIN VỀ MÁY");
        for(int i=0;i<n;i++) {
            y[i].xuat();
        }
    }
}

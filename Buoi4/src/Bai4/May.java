package Bai4;

import java.util.Scanner;

public class May {
    Scanner sc = new Scanner(System.in);
    private String Mamay;
    private String Kieumay;
    private String Tinhtrang;

    public May() {

    }

    public May(String mamay, String kieumay, String tinhtrang) {
        Mamay = mamay;
        Kieumay = kieumay;
        Tinhtrang = tinhtrang;
    }

    @Override
    public String toString() {
        return "May{" +
                "Mamay='" + Mamay + '\'' +
                ", Kieumay='" + Kieumay + '\'' +
                ", Tinhtrang='" + Tinhtrang + '\'' +
                '}';
    }

    public void nhap() {
        System.out.print("Nhập mã máy: ");
        Mamay = sc.nextLine();
        System.out.print("Nhập kiểu máy: ");
        Kieumay = sc.nextLine();
        System.out.print("Nhập tình trạng máy: ");
        Tinhtrang = sc.nextLine();
    }
    public void xuat() {
        System.out.println(toString());
    }
}

package Bai2;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Array arr1 = new Array();
        Array arr2 =new Array();
        System.out.println("Nhap thong tin mang 1");
        arr1.InputData();
        arr1.Show();
        System.out.println();
        System.out.print("Tong cac phan tu la: "+ arr1.Sum());
        System.out.println();
        System.out.print("Day so sau khi loc la: ");
        arr1.Filter(true);
        System.out.println();
        System.out.println("Nhap thong tin mang 2");
        arr2.InputData();
        arr2.Show();
        System.out.println();
        System.out.print("Tong cac phan tu la: "+ arr2.Sum());
        System.out.println();
        System.out.print("Day so sau khi lap la: ");
        arr2.Filter(false);
        System.out.println();

        if(arr1.TBC()>arr2.TBC()){
            System.out.println("arr1");
        }
        else if(arr1.TBC()<arr2.TBC()){
            System.out.println("arr2");
        }
        else {
            System.out.println("Bye");
        }
    }
}

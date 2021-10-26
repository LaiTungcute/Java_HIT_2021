package Bai2;

import java.util.Scanner;

public class Array {
    Scanner sc = new Scanner(System.in);
    private int n;
    private int[] a;

    public Array(int n, int[] a) {
        this.n = n;
        this.a = a;
    }

    public Array() {
        this.n = 0;
        this.a = null;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    public void InputData() {
        System.out.print("Nhap so phan tu: ");
        n = sc.nextInt();
        a = new int[n];
        for (int i=0;i<n;i++){
            System.out.print("a["+i+"]= ");
            a[i] = sc.nextInt();
        }
    }

    public void Show(){
        for (int i: a) {
            System.out.print(i+" ");
        }
    }

    public int Sum(){
        int s = 0;
        for(int i=0;i<n;i++){
            s+=a[i];
        }
        return s;
    }

    public void Filter (boolean flag) {
        if(flag==true){
            for(int i=0;i<n;i++){
                if(a[i]%2==0){
                    System.out.print(a[i]+" ");
                }
            }
        }
        else {
            for(int i=0;i<n;i++){
                if(a[i]%2!=0){
                    System.out.print(a[i]+" ");
                }
            }
        }
    }

    public double TBC(){
        return (double) Sum()/n;
    }
}

package Cau2;

import java.util.Arrays;
import java.util.Scanner;

public class runMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap n= ");
        n = sc.nextInt();
        int []a = new int[n];
//        boolean flag = true;
        System.out.print("Nhap lua chon so: ");
        int x = sc.nextInt();
        do {
            switch (x) {
                case 1:
                    nhap(a, n);
                    break;
                case 2:
                    xuat(a, n);
                    break;
                case 3: {
                    nhap(a,n);
                    System.out.print("Nhap vi tri can chen: ");
                    int vt = sc.nextInt();
                    System.out.print("Nhap phan tu can chen: ");
                    int k = sc.nextInt();
                    a = insert(a, vt, n, k);
                    xuat(a, n);
                    break;
                }
                case 4: {
                    nhap(a,n);
                    System.out.println("Nhap vi tri can xoa: ");
                    int pos = sc.nextInt();
                    delete(a, pos, n);
                    break;
                }
                case 5:
                    nhap(a,n);
                    dao(a,n);
                    break;
                case 6:
                    nhap(a,n);
                    chiaHet(a,n);
                    break;
                case 7:
                    nhap(a,n);
                    tongSNT(a,n);
                    break;
                case 8:
                    System.exit(0);
                    break;
            }

        }while (x==8);
    }

    public static void nhap(int []a, int n){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.print("Nhap a["+i+"]= ");
            a[i] = sc.nextInt();
        }
    }

    public static void xuat(int []a, int n){
        for(int i=0;i<n;i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println();
    }

    public static int[] insert(int[] a, int vt, int n, int k){
        int[] newA = Arrays.copyOf(a,n+1);
        for(int i=n;i>vt-1;i--){
            newA[i] = newA[i-1];
        }
        newA[vt-1] = k;
        return newA;
    }

    public static void delete(int[] a, int vt, int n){
        //int[] newArr = Arrays.copyOf(a,n-1);
        for(int i=0;i<=n-1;i++){
            a[vt] = a[vt+1];
        }
        n--;
        xuat(a,n);
    }

    public static void dao(int[] a, int n){
        for(int i=n-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
    }

    public static void chiaHet(int[] a, int n){
        int k = a[1];
        System.out.print(k);
        System.out.println();
        for(int i=2;i<n;i++){
            if(a[i]%k==0){
                System.out.print(a[i]+" ");
            }
        }
    }

    public static boolean snt(int n){
        if(n<=1) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }

    public static int tongSNT(int[] a, int n) {
        int t = 0;
        for (int i = 0; i < n; i++) {
            if (snt(a[i])) {
                t += a[i];
            }
        }
        return t;
    }
}

package Cau1;

import java.util.Scanner;

public class runMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("So lon nhat trong 3 so la: "+ max(a,b,c));
    }

    public static int max(int a, int b, int c){
//        int x = Math.max(a,b);
//        int y = Math.max(b,c);
//        return Math.max(x,y);
        int m = (a>b) ? a:((b>c)?b:c);
        return m;
    }
}

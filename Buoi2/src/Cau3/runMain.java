package Cau3;

import java.util.Scanner;

public class runMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        if(chuoi(a)){
            System.out.println("Chuoi nay la chuoi so");
            System.out.println("Trung binh cong cac chu so trong chuoi so la: "+trungBinhCong(a));
        }
        else {
            System.out.println("Chuoi nay ko la chuoi so");
        }
    }

    public static boolean chuoi (String a){
        int t=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)>=48 && a.charAt(i)<=57){
                t++;
            }
        }
        if(t==a.length()){
            return true;
        }
        else return false;
    }

    public static int trungBinhCong(String a){
        int t=0;
        if (chuoi(a)){
            for(int i=0;i<a.length();i++){
                int s = a.charAt(i);
                s-=48;
                t+=s;
            }
        }
        return t/a.length();
    }
}

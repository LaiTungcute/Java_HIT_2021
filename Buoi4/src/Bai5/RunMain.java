package Bai5;

public class RunMain {
    public static boolean isPrime(int n) {
        if(n<=1) return false;
        for(int i=2;i<=Math.sqrt(n);i++) {
            if(n%i==0) return false;
        }
        return true;
    }

    public static boolean isPrime(long n) {
        if(n<=1) return false;
        for(long i=2;i<=Math.sqrt(n);i++) {
            if(n%i==0) return false;
        }
        return true;
    }

    public static boolean isPrime(float n) {
        return false;
    }

    public static boolean isPrime(double n) {
        return false;
    }

    public static void main(String[] args) {
        if(isPrime(5)) {
            System.out.println(5+" là số nguyên tố");
        }
        else {
            System.out.println(5+" không là số nguyên tố");
        }
        if(isPrime(5l)) {
            System.out.println(5l+" là số nguyên tố");
        }
        else {
            System.out.println(5l+" không là số nguyên tố");
        }
        if(isPrime(5.5f)) {
            System.out.println(5.5f+" là số nguyên tố");
        }
        else {
            System.out.println(5.5f+" không là số nguyên tố");
        }
        if(isPrime(5.3)) {
            System.out.println(5.3+" là số nguyên tố");
        }
        else {
            System.out.println(5.3+" không là số nguyên tố");
        }
    }
}

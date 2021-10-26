package Bai3;

public class RunMain {
    public static void main(String[] args) {
        Guns DiepBeDe = new Guns();
        Guns DoanXinhGai = new Guns();
        DiepBeDe.setWeaponName("Súng lục");
        DoanXinhGai.setWeaponName("Súng ak");
        while (true) {
            DiepBeDe.Load((int) Math.floor(Math.random()*10));
            DoanXinhGai.Load((int) Math.floor(Math.random()*10));
            int S1 = DiepBeDe.Shoot((int) Math.floor(Math.random()*10));
            int S2 = DoanXinhGai.Shoot((int) Math.floor(Math.random()*10));
            if(S1==0 && S2!=0){
                System.out.println("DoanXinhGai thắng");
                System.exit(0);
            }
            else if(S2==0 && S1!=0) {
                System.out.println("DiepBeDe thắng");
                System.exit(0);
            }
            else if(S1==0 && S2==0){
                System.out.println("Hòa nhau");
                System.exit(0);
            }
        }
    }
}
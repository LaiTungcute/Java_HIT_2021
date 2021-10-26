package Bai3;

public class Guns {
    private int  ammoNumber = 100;
    private String weaponName;

    public void Load(int x) {
        this.ammoNumber+=x;
    }

    public int Shoot(int x) {
        if(ammoNumber-x>=0) {
            return ammoNumber-=x;
        }
        else{
            return 0;
        }
    }

    public Guns(String weaponName)
    {
        this.weaponName = weaponName;
    }

    public Guns() {

    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public int getAmmoNumber() {
        return ammoNumber;
    }

    public void setAmmoNumber(int ammoNumber) {
        this.ammoNumber = ammoNumber;
    }
}

package postest_6;


final public class Tembak_Senjata {
    public final int magazine;
    public int magazine_ammo;

    public Tembak_Senjata(int magazine) {
        this.magazine = magazine;
        this.magazine_ammo = magazine;
    }

    public final int tembak(){
        if (magazine_ammo > 0){
            System.out.print("Duar dorr . . .");
            magazine_ammo--;
        }else{
            System.out.println("Peluru Habis Bang Reload dulu");
        }
        return magazine_ammo;
    }
    
    public final void reload() throws InterruptedException{
        magazine_ammo = magazine;
        System.out.println("Reloaded . . .");
        Thread.sleep(2000);
    }
    
}

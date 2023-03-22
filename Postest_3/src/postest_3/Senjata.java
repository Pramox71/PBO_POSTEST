package postest_3;

public class Senjata {
    protected String Nama_Senjata;
    protected int Stok;
    
    public Senjata(String Nama, int stok){
        this.Nama_Senjata =  Nama;
        this.Stok = stok;
    }

    public void setNama_Senjata(String Nama_baru){
        this.Nama_Senjata = Nama_baru;
    }
    public void setStok(int stok_baru){
        this.Stok =  stok_baru;
    }
    
    public String getNama_Senjata(){
        return Nama_Senjata;
    }
    public int getStok() {
        return Stok;
    }
    
}

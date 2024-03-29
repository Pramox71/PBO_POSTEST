package postest_2;

public class Senjata {
    private String Nama_Senjata, Jenis;
    private int Kode, Stok;
    
    public Senjata(String Nama, String Jenis, int kode, int stok){
        this.Nama_Senjata =  Nama;
        this.Jenis = Jenis;
        this.Kode = kode;
        this.Stok = stok;
    }
    
    public void display(){
        System.out.printf("|%-21s|%-23s|%-10s|%-8s|", Nama_Senjata, Jenis, Kode, Stok);
        System.out.printf("\n");
    }
    
    public void setNama_Senjata(String Nama_baru){
        this.Nama_Senjata = Nama_baru;
    }
    public void setJenis(String Jenis_baru){
        this.Jenis = Jenis_baru;
    }
    public void setKode(int kode_baru){
        this.Kode = kode_baru;
    }
    public void setStok(int stok_baru){
        this.Stok =  stok_baru;
    }
    
    public String getNama_Senjata(){
        return Nama_Senjata;
    }

    public String getJenis() {
        return Jenis;
    }

    public int getKode() {
        return Kode;
    }

    public int getStok() {
        return Stok;
    }
    
}

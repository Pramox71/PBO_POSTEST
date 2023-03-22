package postest_3;

public class SMG extends Senjata{
    private String Jenis = "SMG", kode;

    public SMG(String Nama, int stok, String Jenis, String kode) {
        super(Nama, stok);
        this.Jenis = Jenis;
        this.kode =  kode;
    }
    
    public void display(){
        System.out.printf("|%-21s|%-23s|%-10s|%-8s|", Nama_Senjata, Jenis, kode, Stok);
        System.out.printf("\n");
    }
    
    public String getJenis() {
        return Jenis;
    }

    public String getKode() {
        return kode;
    }

    public void setJenis(String Jenis) {
        this.Jenis = Jenis;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }
    
}

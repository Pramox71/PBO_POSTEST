package postest_4;

public class AR extends Senjata{
    private String Jenis = "AR", kode;

    public AR(String Nama, int stok, String Jenis, String kode) {
        super(Nama, stok);
        this.Jenis = Jenis;
        this.kode = kode;
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
    
    @Override
    public void display(){
        System.out.printf("|%-21s|%-23s|%-10s|%-8s|", Nama_Senjata, Jenis, kode, Stok);
        System.out.printf("\n");
    }
    
    public void display(boolean Detail){
        if (Detail)display();
        else super.display();
    }
    
}

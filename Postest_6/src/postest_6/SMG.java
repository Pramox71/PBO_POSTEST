package postest_6;

public class SMG extends Senjata{
    private final String Jenis = "SMG";
    private String kode;
    private int pelor;

    public SMG(String Nama, int stok, String kode, int pelor) {
        super(Nama, stok);
        this.kode = kode;
        this.pelor = pelor;
    }
    
    public String getJenis() {
        return Jenis;
    }

    public int getPelor() {
        return pelor;
    }

    public void setPelor(int pelor) {
        this.pelor = pelor;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }
    
     @Override
    public final void display(){
        System.out.printf("|%-21s|%-23s|%-10s|%-8s|", Nama_Senjata, Jenis, kode, Stok);
        System.out.printf("\n");
    }
    
    public void display(boolean Detail){
        if (Detail)display();
        else{
            System.out.printf("|%-21s|%-8s|", Nama_Senjata, Stok);
            System.out.printf("\n");
        }
    }
    
}

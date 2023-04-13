package postest_6;

public class AR extends Senjata{
    private final String Jenis = "AR"; 
    private String kode;
    private int pelor;

    public AR(String Nama, int stok, String kode, int pelor) {
        super(Nama, stok);
        this.pelor = pelor;
        this.kode = kode;
    }
    
    public String getJenis() {
        return Jenis;
    }

    public void setPelor(int pelor) {
        this.pelor = pelor;
    }

    public int getPelor() {
        return pelor;
    }

    public String getKode() {
        return kode;
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
        else {
            System.out.printf("|%-21s|%-8s|", Nama_Senjata, Stok);
            System.out.printf("\n");
        }
        
    }
    
}

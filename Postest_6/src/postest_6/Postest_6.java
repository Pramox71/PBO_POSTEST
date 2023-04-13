package postest_6;
import java.io.*;
import java.util.*;
public class Postest_6 {
    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(isr);
    static Scanner enter = new Scanner(System.in);
    static ArrayList<SMG> Data_SMG = new ArrayList<>();
    static ArrayList<AR> Data_AR = new ArrayList<>();
    static int pilih;
    
    public static void main(String[] args) throws Exception{
        while (true){
            
            System.out.println("==========================");
            System.out.println("====== Data Senjata ======");
            System.out.println("| 1. Tambah Data Senjata |");
            System.out.println("| 2. Lihat Data Senjata  |");
            System.out.println("| 3. Update Data Senjata |");
            System.out.println("| 4. Hapus Data Senjata  |");
            System.out.println("| 5. Pakai Senjata       |");
            System.out.println("| 6. Exit                |");
            System.out.println("==========================");
            System.out.print("\nMasukkan Pilihan Anda >> ");
            pilih = cek();
            switch(pilih){
                case 1:
//                    clear_screen();
                    Tambah_Data();break;
                case 2:
//                    clear_screen();
                    boolean Kondisi = true;
                    while (Kondisi){
                        String Yakin;
                        System.out.println("===========================");
                        System.out.println("====== Lihat Senjata ======");
                        System.out.println("| 1. Lihat Data AR       |");
                        System.out.println("| 2. Lihat Data SMG        |");
                        System.out.println("| 3. Exit                 |");
                        System.out.println("===========================");
                        System.out.print("\nMasukkan Pilihan Anda >> ");
                        pilih = cek();
                        switch(pilih){
                            case 1:
                                System.out.println("Lihat Detail ? ");
                                System.out.print("Iya/ Tidak : "); Yakin = br.readLine();
                                if("y".equals(cek(Yakin))){
                                    Read_Data(1,1);break;
                                }else if ("n".equals(cek(Yakin))){
                                    Read_Data(1, 2);break;
                                }
                            case 2:
                                System.out.println("Lihat Detail ? ");
                                System.out.print("Iya/ Tidak : "); Yakin = br.readLine();
                                if (Yakin.equalsIgnoreCase("y") || Yakin.equalsIgnoreCase("ya")){
                                    Read_Data(2,1);break;
                                }else{
                                    Read_Data(2, 2);break;
                                }
                            case 3:
                                Kondisi = false;break;
                            default:
                                System.out.println("Pilihan Tidak Tersedia . . .");
                                Thread.sleep(1500);break;
                        }
                    }break;
                case 3:
//                    clear_screen();
                    while (true){
                        System.out.println("============================");
                        System.out.println("====== Update Senjata ======");
                        System.out.println("| 1. Update Data AR       |");
                        System.out.println("| 2. Update Data SMG        |");
                        System.out.println("| 3. Exit                  |");
                        System.out.println("============================");
                        System.out.print("\nMasukkan Pilihan Anda >> ");
                        pilih = cek();
                        if (pilih == 1){
                            Update_Data(1);
                        }else if(pilih == 2){
                            Update_Data(2);
                        }else if (pilih == 3){
                            break;
                        }else{
                            System.out.println("Pilihan Tidak Tersedia . . .");
                            Thread.sleep(1500);
                        }
                    }break;
                case 4:
//                    clear_screen();
                    while (true){
                        System.out.println("============================");
                        System.out.println("====== Delete Senjata ======");
                        System.out.println("| 1. Delete Data AR        |");
                        System.out.println("| 2. Delete Data SMG       |");
                        System.out.println("| 3. Exit                  |");
                        System.out.println("============================");
                        System.out.print("\nMasukkan Pilihan Anda >> ");
                        pilih = cek();
                        if (pilih == 1){
                            delete_data(1);
                        }else if(pilih == 2){
                            delete_data(2);
                        }else if (pilih == 3){
                            break;
                        }else{
                            System.out.println("Pilihan Tidak Tersedia . . .");
                            Thread.sleep(1500);
                        }
                    }break;
                case 5:
                    while (true){
                        System.out.println("============================");
                        System.out.println("====== Pakai  Senjata ======");
                        System.out.println("| 1. Pakai Senjata AR      |");
                        System.out.println("| 2. Pakai Senjata SMG     |");
                        System.out.println("| 3. Exit                  |");
                        System.out.println("============================");
                        pilih = cek();
                        if (pilih == 1){
                            pakai_AR();
                        }else if(pilih == 2){
                            pakai_SMG();
                        }else if (pilih == 3){
                            break;
                        }else{
                            System.out.println("Pilihan Tidak Tersedia . . .");
                            Thread.sleep(1500);
                        }
                    }
                    break;
                case 6:
//                    clear_screen();
                    System.out.println("=============================");
                    System.out.println("==Anda Keluar Program . . .==");
                    System.out.println("=============================");
                    System.out.println("\nenter untuk melanjutkan . . .");
                    enter.nextLine();
                    System.exit(0);break;
                default:
//                    clear_screen();
                    System.out.println("=============================");
                    System.out.println("== Pilihan Tidak Ada . . . ==");
                    System.out.println("=============================");
                    Thread.sleep(1500);
                    break;
            }
        }
    }
    
//    public static void clear_screen(){
//         try {
//            if (System.getProperty("os.name").contains("Windows")) {
//                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
//            } else{
//                System.out.print("\033[H\033[2J");
//            }
//        } catch (Exception e) {
//            System.err.println("Gagal Membersihkan");
//        }
//    }
    public static void pakai_AR() throws Exception{
        Read_Data(1,1);
        boolean lagi = true;
        System.out.println("========================================================================");
        System.out.print("Pilih Senjata yang akan di gunakan . . .\n");
        System.out.print("Senjata : ");
        String Pakai = br.readLine();
        for (AR Cari : Data_AR){
            if(Cari.getNama_Senjata().equalsIgnoreCase(Pakai)){
                Tembak_Senjata Guna = new Tembak_Senjata(Cari.getPelor());
                int peluru = Guna.magazine_ammo;
                while (lagi){
                    System.out.print("Tembak Berapa kali : ");
                    int kali = cek();
                    if (peluru > 0){
                        for(int i = 0; i < kali;i++){
                            System.out.println("Peluru : " + Guna.magazine_ammo + "/" + Guna.magazine);
                            enter.nextLine();
                            peluru = Guna.tembak();
                        }
                    }else{
                        Guna.reload();
                        peluru = Guna.magazine_ammo;
                    }
                    while(true){
                        System.out.println("Tembak Lagi ?");
                        System.out.print("Iya / Tidak : ");
                        String yakin = cek(br.readLine());
                        if (yakin.equalsIgnoreCase("y")){
                            break;
                        }else if (yakin.equalsIgnoreCase("n")){
                            lagi=false;
                            break;
                        }
                    }continue;
                }  
            }
        }  
    }
    public static void pakai_SMG() throws Exception{
        Read_Data(2,1);
        boolean lagi = true;
        System.out.println("========================================================================");
        System.out.print("Pilih Senjata yang akan di gunakan . . .\n");
        System.out.print("Senjata : ");
        String Pakai = br.readLine();
        for (SMG Cari : Data_SMG){
            if(Cari.getNama_Senjata().equalsIgnoreCase(Pakai)){
                Tembak_Senjata Guna = new Tembak_Senjata(Cari.getPelor());
                int peluru = Guna.magazine_ammo;
                while (lagi){
                    System.out.print("Tembak Berapa kali : ");
                    int kali = cek();
                    if (peluru > 0){
                        for(int i = 0; i < kali;i++){
                            System.out.println("Peluru : " + Guna.magazine_ammo + "/" + Guna.magazine);
                            enter.nextLine();
                            peluru = Guna.tembak();
                        }
                    }else{
                        Guna.reload();
                        peluru = Guna.magazine_ammo;
                    }
                    while(true){
                        System.out.println("Tembak Lagi ?");
                        System.out.print("Iya / Tidak : ");
                        String yakin = cek(br.readLine());
                        if (yakin.equalsIgnoreCase("y")){
                            break;
                        }else if (yakin.equalsIgnoreCase("n")){
                            lagi=false;
                            break;
                        }
                    }continue;
                }  
            }
        }  
    }
    public static int cek() throws IOException{
        int cek = 0;
        while (true){
            try{
            cek = Integer.parseInt(br.readLine());
            break;
            }catch (NumberFormatException e){
                System.out.println("Harapa Masukkan Nilai Integer . . . ");
            }
        }
        return cek;
    }
    public static String cek(String yakin) throws IOException{
        while (true){
            if (yakin.equalsIgnoreCase("y") || yakin.equalsIgnoreCase("ya") || yakin.equalsIgnoreCase("iya")){
                yakin = "y";
                return yakin;
            }else if(yakin.equalsIgnoreCase("n") || yakin.equalsIgnoreCase("tidak") || yakin.equalsIgnoreCase("no")){
                yakin = "n";
                return yakin;
            }else{
                System.out.println("=============================");
                System.out.println("== Pilihan Tidak Ada . . . ==");
                System.out.println("=============================");
                System.out.print("Iya / Tidak : ");
                yakin = cek(br.readLine());
                return yakin;
            }
        }
        
        
    }
    
    public static void tambah_smg() throws IOException{
        int banyak = cek();
        int Banyak_Data = Data_SMG.size();
        for (int i = 0; i < banyak; i++){
            System.out.println("===========================");
            System.out.println("Data Ke- " + (Banyak_Data + 1));
            System.out.print("Nama Senjata\t: ");
            String Nama = br.readLine();
            System.out.print("Kode Senjata\t: ");
            String kode = br.readLine();
            System.out.print("Stok Senjata\t: ");
            int stok = cek();
            System.out.print("Jumlah Pelor\t: ");
            int pelor = cek();
            SMG D_Baru = new SMG(Nama, stok, kode, pelor);
            Data_SMG.add(D_Baru);
            Banyak_Data++;
        }
        System.out.println("===============================");
        System.out.println("Data Berhasil Ditambahkan . . .");
        System.out.println("===============================");
        Data_SMG.sort(Comparator.comparing(Senjata::getNama_Senjata));
    }
    public static void tambah_ar() throws IOException{
        int banyak = cek();
        int Banyak_Data = Data_AR.size();
        for (int i = 0; i < banyak; i++){
            System.out.println("===========================");
            System.out.println("Data Ke- " + (Banyak_Data + 1));
            System.out.print("Nama Senjata\t: ");
            String Nama = br.readLine();
            System.out.print("Kode Senjata\t: ");
            String kode = br.readLine();
            System.out.print("Stok Senjata\t: ");
            int stok = cek();
            System.out.print("Jumlah Pelor\t: ");
            int pelor = cek();
            AR D_Baru = new AR(Nama, stok, kode, pelor);
            Data_AR.add(D_Baru);
            Banyak_Data++;
        }
        System.out.println("===============================");
        System.out.println("Data Berhasil Ditambahkan . . .");
        System.out.println("===============================");
        Data_AR.sort(Comparator.comparing(Senjata::getNama_Senjata));
        
    }
    public static void Tambah_Data() throws IOException{
        OUTER:
        while (true) {
            System.out.println("============================");
            System.out.println("====== Tambah Senjata ======");
            System.out.println("============================");
            System.out.println("= 1. ASSAULT RIFLE         =");
            System.out.println("= 2. SUB-MACHINE GUN       =");
            System.out.println("= 3. Back                  =");
            System.out.println("============================");
            System.out.print("\nMasukkan Pilihan : ");
            pilih = cek();
            System.out.print("Masukkan Banyak Data : ");
            switch (pilih) {
                case 1:
                    tambah_ar();
                    break;
                case 2:
                    tambah_smg();
                    break;
                case 3:
                    break OUTER;
                default:
                    break;
            }
        }  
    }
    
    public static void Read_Data(int tipe, int detail) throws InterruptedException{
        if (tipe == 1){
            int Banyak_Data = Data_AR.size();
            if (Banyak_Data == 0){
                System.out.println("===============================");
                System.out.println("Data Masih Kosong . . .        ");
                System.out.println("===============================");
                Thread.sleep(1500);
                return;
            }
            if (detail == 1){
                System.out.println("========================================================================");
                System.out.println("| No |    Nama Senjata     |     Jenis Senjata     |   Kode   |  Stok  |");
                System.out.println("========================================================================");
                for(int i = 0; i < Banyak_Data; i++){
                    System.out.printf("|%-4s", i+1);
                    Data_AR.get(i).display(true);
                }
            }else{
                System.out.println("=====================================");
                System.out.println("| No |    Nama Senjata     |  Stok  |");
                System.out.println("=====================================");
                for(int i = 0; i < Banyak_Data; i++){
                    System.out.printf("|%-4s", i+1);
                    Data_AR.get(i).display(false);
                }
            }
        }else if(tipe == 2){
            int Banyak_Data = Data_SMG.size();
            if (Banyak_Data == 0){
                System.out.println("===============================");
                System.out.println("Data Masih Kosong . . .        ");
                System.out.println("===============================");
                Thread.sleep(1500);
                return;
            }
            if (detail == 1){
                System.out.println("========================================================================");
                System.out.println("| No |    Nama Senjata     |     Jenis Senjata     |   Kode   |  Stok  |");
                System.out.println("========================================================================");
                for(int i = 0; i < Banyak_Data; i++){
                    System.out.printf("|%-4s", i+1);
                    Data_SMG.get(i).display(true);
                }
            }else{
                System.out.println("=====================================");
                System.out.println("| No |    Nama Senjata     |  Stok  |");
                System.out.println("=====================================");
                for(int i = 0; i < Banyak_Data; i++){
                    System.out.printf("|%-4s", i+1);
                    Data_SMG.get(i).display(false);
                }
            }        
        }
    }
    public static void Update_Data(int tipe) throws IOException, InterruptedException{
        if (tipe == 1){
            Read_Data(1,1);
            if (Data_AR.isEmpty()){
                System.out.println("===============================");
                System.out.println("Data Masih Kosong . . .        ");
                System.out.println("===============================");
                Thread.sleep(1500);
                return;
            }
            while (true){
                System.out.print("\nPilih Data Yang akan di Update : ");
                int nomor = cek() - 1;
                System.out.println("Apakah anda ingin mengupdate senjata " + Data_AR.get(nomor).getNama_Senjata());
                System.out.print("Iya / Tidak : ");
                String Yakin = cek(br.readLine());
                if ("y".equals(cek(Yakin))){
                    System.out.print("Nama Senjata Baru\t : ");
                    Data_AR.get(nomor).setNama_Senjata(br.readLine());
                    System.out.print("Kode Senjata Baru\t : ");
                    Data_AR.get(nomor).setKode(br.readLine());
                    System.out.print("Stok Senjata Baru\t : ");
                    Data_AR.get(nomor).setStok(cek());
                    System.out.println("=============================");
                    System.out.println("Data Berhasil Di Update . . .");
                    System.out.println("=============================");
                    break;
                }else if ("n".equals(cek(Yakin))){
                    System.out.println("=============================");
                    System.out.println("=Data Batal Di Update . . . =");
                    System.out.println("=============================");
                    break;
                }
            }
        }else{
            Read_Data(2,1);
            if (Data_SMG.isEmpty()){
                System.out.println("===============================");
                System.out.println("Data Masih Kosong . . .        ");
                System.out.println("===============================");
                Thread.sleep(1500);
                return;
            }
            while (true){
                System.out.print("\nPilih Data Yang akan di Update : ");
                int nomor = cek() - 1;
                System.out.println("Apakah anda ingin mengupdate senjata " + Data_SMG.get(nomor).getNama_Senjata());
                System.out.print("Iya / Tidak : ");
                String yakin = cek(br.readLine());
                if (yakin.equalsIgnoreCase("y")){
                    System.out.print("Nama Senjata Baru\t : ");
                    Data_SMG.get(nomor).setNama_Senjata(br.readLine());
                    System.out.print("Kode Senjata Baru\t : ");
                    Data_SMG.get(nomor).setKode(br.readLine());
                    System.out.print("Stok Senjata Baru\t : ");
                    Data_SMG.get(nomor).setStok(cek());
                    System.out.println("=============================");
                    System.out.println("Data Berhasil Di Update . . .");
                    System.out.println("=============================");
                    break;
                }else if (yakin.equalsIgnoreCase("n")){
                    System.out.println("=============================");
                    System.out.println("=Data Batal Di Update . . . =");
                    System.out.println("=============================");
                    break;
                }
            }
        }
    }
    
    public static void delete_data(int tipe) throws IOException, InterruptedException{
        if (tipe == 1){
            Read_Data(1,1);
            if (Data_AR.isEmpty()){
                System.out.println("===============================");
                System.out.println("Data Masih Kosong . . .        ");
                System.out.println("===============================");
                Thread.sleep(1500);
                return;
            }
            while (true){
                System.out.print("\nPilih Data Yang akan di Hapus : ");
                int nomor = cek()-1;
                System.out.println("=========================================================================");
                System.out.println("| No |    Nama Senjata     |     Jenis Senjata     |   Kode   |  Stok  |");
                System.out.println("=========================================================================");
                System.out.printf("|%-4s", (nomor+1));
                Data_AR.get(nomor).display();
                System.out.println("Apakah anda ingin menhapus senjata " + Data_AR.get(nomor).getNama_Senjata());
                System.out.print("Iya / Tidak : ");
                String Yakin = br.readLine();
                if ("y".equals(cek(Yakin))){
                    Data_AR.remove(nomor);
                    System.out.println("=============================");
                    System.out.println("Data Berhasil Di Delete . . .");
                    System.out.println("=============================");
                    break;
                }else if ("n".equals(cek(Yakin))){
                    System.out.println("=============================");
                    System.out.println("=Data Batal Di Delete . . . =");
                    System.out.println("=============================");
                    break;
                }
            }
        }else{
            Read_Data(2,1);
            if (Data_AR.isEmpty()){
                System.out.println("===============================");
                System.out.println("Data Masih Kosong . . .        ");
                System.out.println("===============================");
                Thread.sleep(1500);
                return;
            }
            while (true){
                System.out.print("\nPilih Data Yang akan di Hapus : ");
                int nomor = cek()-1;
                System.out.println("=========================================================================");
                System.out.println("| No |    Nama Senjata     |     Jenis Senjata     |   Kode   |  Stok  |");
                System.out.println("=========================================================================");
                System.out.printf("|%-4s", (nomor+1));
                Data_SMG.get(nomor).display();
                System.out.println("Apakah anda ingin menhapus senjata " + Data_SMG.get(nomor).getNama_Senjata());
                System.out.print("Iya / Tidak : ");
                String yakin = br.readLine();
                if (yakin.equalsIgnoreCase("Ya") || yakin.equalsIgnoreCase("Y")){
                    Data_SMG.remove(nomor);
                    System.out.println("=============================");
                    System.out.println("Data Berhasil Di Delete . . .");
                    System.out.println("=============================");
                    break;
                }else if (yakin.equalsIgnoreCase("Tidak")){
                    System.out.println("=============================");
                    System.out.println("=Data Batal Di Delete . . . =");
                    System.out.println("=============================");
                    break;
                }
            }
        }
    }
}

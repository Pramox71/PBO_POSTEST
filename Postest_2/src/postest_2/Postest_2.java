package postest_2;
import java.io.*;
import java.util.*;
public class Postest_2 {
    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(isr);
    static Scanner enter = new Scanner(System.in);
    static ArrayList<Senjata> Data_Senjata = new ArrayList<>();
    
    public static void main(String[] args) throws IOException, InterruptedException{
        while (true){
            System.out.println("==========================");
            System.out.println("====== Data Senjata ======");
            System.out.println("| 1. Tambah Data Senjata |");
            System.out.println("| 2. Lihat Data Senjata  |");
            System.out.println("| 3. Update Data Senjata |");
            System.out.println("| 4. Hapus Data Senjata  |");
            System.out.println("| 5. Exit                |");
            System.out.println("==========================");
            System.out.print("\nMasukkan Pilihan Anda >> ");
            int pilih = cek_int();
            switch(pilih){
                case 1:
//                    clear_screen();
                    Tambah_Data();break;
                case 2:
//                    clear_screen();
                    Read_Data();break;
                case 3:
//                    clear_screen();
                    Update_Data();break;
                case 4:
//                    clear_screen();
                    delete_data();break;
                case 5:
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
    
    public static int cek_int() throws IOException{
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
    public static void Tambah_Data() throws IOException{
        System.out.println("============================");
        System.out.println("====== Tambah Senjata ======");
        System.out.println("============================");
        System.out.print("\nMasukkan Banyak Data : ");
        int Banyak_Data = Data_Senjata.size();
        int banyak = cek_int();
        for (int i = 0; i < banyak; i++){
            System.out.println("===========================");
            System.out.println("Data Ke- " + (Banyak_Data + 1));
            System.out.print("Nama Senjata\t: ");
            String Nama = br.readLine();
            System.out.print("Jenis Senjata\t: ");
            String Jenis = br.readLine();
            System.out.print("Kode Senjata\t: ");
            int kode = cek_int();
            System.out.print("Stok Senjata\t: ");
            int stok = cek_int();
            Senjata D_Baru = new Senjata(Nama, Jenis, kode, stok);
            Data_Senjata.add(D_Baru);
            Banyak_Data++;
        }
        System.out.println("===============================");
        System.out.println("Data Berhasil Ditambahkan . . .");
        System.out.println("===============================");
    }
    
    public static void Read_Data(){
        System.out.println("=========================================================================");
        System.out.println("| No |    Nama Senjata     |     Jenis Senjata     |   Kode   |  Stok  |");
        System.out.println("=========================================================================");
        for(int i = 0; i < Data_Senjata.size(); i++){
            System.out.printf("|%-4s", i+1);
            System.out.printf("|%-21s|%-23s|%-10s|%-8s|", Data_Senjata.get(i).getNama_Senjata(), Data_Senjata.get(i).getJenis(), Data_Senjata.get(i).getKode(), Data_Senjata.get(i).getStok());
            System.out.printf("\n");
        }
    }
    
    public static void Update_Data() throws IOException{
        Read_Data();
        while (true){
            System.out.print("\nPilih Data Yang akan di Update : ");
            int nomor = cek_int() - 1;
            System.out.println("Apakah anda ingin mengupdate senjata " + Data_Senjata.get(nomor).getNama_Senjata());
            System.out.print("Ya / Tidak : ");
            String yakin = br.readLine();
            if (yakin.equalsIgnoreCase("Ya") || yakin.equalsIgnoreCase("Y")){
                System.out.print("Nama Senjata Baru\t : ");
                Data_Senjata.get(nomor).setNama_Senjata(br.readLine());
                System.out.print("Jenis Senjata Baru\t : ");
                Data_Senjata.get(nomor).setJenis(br.readLine());
                System.out.print("Kode Senjata Baru\t : ");
                Data_Senjata.get(nomor).setKode(cek_int());
                System.out.print("Stok Senjata Baru\t : ");
                Data_Senjata.get(nomor).setStok(cek_int());
                System.out.println("=============================");
                System.out.println("Data Berhasil Di Update . . .");
                System.out.println("=============================");
                break;
            }else if (yakin.equalsIgnoreCase("Tidak")){
                System.out.println("=============================");
                System.out.println("=Data Batal Di Update . . . =");
                System.out.println("=============================");
                break;
            }else{
                System.out.println("=============================");
                System.out.println("== Pilihan Tidak Ada . . . ==");
                System.out.println("=============================");
            }
        }
    }
    
    public static void delete_data() throws IOException{
        Read_Data();
        while (true){
            System.out.print("\nPilih Data Yang akan di Hapus : ");
            int nomor = cek_int()-1;
            System.out.println("=========================================================================");
            System.out.println("| No |    Nama Senjata     |     Jenis Senjata     |   Kode   |  Stok  |");
            System.out.println("=========================================================================");
            System.out.printf("|%-4s", (nomor+1));
            Data_Senjata.get(nomor).display();
            System.out.println("Apakah anda ingin menhapus senjata " + Data_Senjata.get(nomor).getNama_Senjata());
            System.out.print("Ya / Tidak : ");
            String yakin = br.readLine();
            if (yakin.equalsIgnoreCase("Ya") || yakin.equalsIgnoreCase("Y")){
                Data_Senjata.remove(nomor);
                System.out.println("=============================");
                System.out.println("Data Berhasil Di Delete . . .");
                System.out.println("=============================");
                break;
            }else if (yakin.equalsIgnoreCase("Tidak")){
                System.out.println("=============================");
                System.out.println("=Data Batal Di Delete . . . =");
                System.out.println("=============================");
                break;
            }else{
                System.out.println("=============================");
                System.out.println("== Pilihan Tidak Ada . . . ==");
                System.out.println("=============================");
            }
        }
    }
}

package sistemperpustakaan;

import java.util.Scanner;

class Admin {
    private String laporan;

    public Admin() {
        this.laporan = "";
    }
    

    public void kelolaAnggota() {
        System.out.println("Sedang Mengelola Anggota: Candra Wijaya");
    }

    public void kelolaBuku() {
        
        System.out.println("Sedang Mengelola Buku: Jujutsu Kaisen");
    }

    public void buatLaporan() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan laporan: ");
        laporan = scanner.nextLine();

        System.out.println("Laporan telah berhasil dibuat.");
    }

    public String getLaporan() {
        return laporan;
    }

    public void setLaporan(String laporan) {
        this.laporan = laporan;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemperpustakaan;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class SistemPerpustakaan {
    public static void main(String[] args) {
        
        Buku buku1 = new Buku("Jujutsu Kaisen", "Gege Akutami", "9786230022180");
        Buku buku2 = new Buku("Attack on Titan", "Hajime Isayama", "978619034144");
        
        System.out.println("\n==================INFORMASI BUKU==================\n");
        buku1.informasiBuku();
        buku1.cekKetersediaan();
        System.out.println(); 
        buku2.informasiBuku();
        buku2.cekKetersediaan();
        

        System.out.println("\n===============CATATAN PEMINJAMAN BUKU===================\n");
        AnggotaPerpustakaan anggota1 = new AnggotaPerpustakaan("Candra Wijaya", 111333, "Jl. Natar Gg Seblak");
        String tanggal = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        TransaksiPeminjaman transaksi1 = new TransaksiPeminjaman("Candra Wijaya", "10-11-2023",  3, anggota1, buku1);
        transaksi1.catatPeminjaman();
        
        
        System.out.println("\n=============CATATAN PENGEMBALIAN BUKU================\n");
        TransaksiPengembalian pengembalian1 = new TransaksiPengembalian("25-11-2023", anggota1, buku1);
        pengembalian1.catatPengembalian();
        

        System.out.println("\n================RIWAYAT PEMINJAMAN===================\n");
        anggota1.lihatRiwayatPeminjaman();
        

        System.out.println("\n================NOTIFIKASI====================\n");
        Notifikasi notifikasi = new Notifikasi() {};
        notifikasi.setBatas_waktu("24-11-2023");
        notifikasi.setInfo_terbaru("Peminjaman buku Anda segera berakhir.");
        notifikasi.kirimNotifikasi();
        
        
        System.out.println("\n==================LAPORAN==================\n");
        Admin admin = new Admin();
        admin.kelolaAnggota();
        admin.kelolaBuku();
        admin.buatLaporan();
        System.out.println("Laporan: " + admin.getLaporan());
    }
}

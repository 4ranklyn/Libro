/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi2_l0122081_sc;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
/**
 *
 * @author franklynical
 */



public class Pinjam {
    public static HashMap<String, Buku> rakBuku = new HashMap<>();
    public static HashMap<String, AnggotaBulanan> bMap = new HashMap<>();
    public static HashMap<String, AnggotaTetap> tMap = new HashMap<>();

    public static void bukuBaru(String id, String judul, int tahun){
        Buku buku = new Buku(id, judul, tahun);
        rakBuku.put(id, buku);
    }

    public static void anggotaTetapBaru(String id, String nama, LocalDate tanggalMulai, int jumlahDipinjam){
        AnggotaTetap anggotaTetap = new AnggotaTetap(id, nama, tanggalMulai, jumlahDipinjam);
        tMap.put(id, anggotaTetap);
    }

    public static void anggotaBulananBaru(String id, String nama, LocalDate tanggalMulai, int jumlahDipinjam){
        AnggotaBulanan anggotaBulanan = new AnggotaBulanan(id, nama, tanggalMulai, jumlahDipinjam);
        bMap.put(id, anggotaBulanan);
    }

    public static void pinjamBukuTetap(String idBuku, String idAnggota){
        Buku buku = rakBuku.get(idBuku);
        AnggotaTetap anggotaTetap = tMap.get(idAnggota);
        if (buku != null && anggotaTetap != null) {
            anggotaTetap.tambahBuku(buku);
        }
    }

    public static void pinjamBukuBulanan(String idBuku, String idAnggota){
        Buku buku = rakBuku.get(idBuku);
        AnggotaBulanan anggotaBulanan = bMap.get(idAnggota);
        if (buku != null && anggotaBulanan != null) {
            anggotaBulanan.tambahBuku(buku);
        }
    }

    public static void kembalikanBukuTetap(String idBuku, String idAnggota){
        Buku buku = rakBuku.get(idBuku);
        AnggotaTetap anggotaTetap = tMap.get(idAnggota);
        if (buku != null && anggotaTetap != null) {
            anggotaTetap.hapusBuku(buku);
        }
    }

    public static void kembalikanBukuBulanan(String idBuku, String idAnggota){
        Buku buku = rakBuku.get(idBuku);
        AnggotaBulanan anggotaBulanan = bMap.get(idAnggota);
        if (buku != null && anggotaBulanan != null) {
            anggotaBulanan.hapusBuku(buku);
        }
    }
}


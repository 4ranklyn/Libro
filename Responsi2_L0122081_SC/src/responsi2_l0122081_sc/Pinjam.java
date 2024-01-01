/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi2_l0122081_sc;
import java.time.LocalDate;
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

    public static void anggotaBaru(String id, String nama, LocalDate tanggalMulai, int jumlahDipinjam, boolean isTetap){
        Anggota anggota;
        jumlahDipinjam = 0;
        if (isTetap) {
            anggota = new AnggotaTetap(id, nama, tanggalMulai, jumlahDipinjam);
            tMap.put(id, (AnggotaTetap) anggota);
        } else {
            anggota = new AnggotaBulanan(id, nama, tanggalMulai, jumlahDipinjam);
            bMap.put(id, (AnggotaBulanan) anggota);
        }
        
    }

    public static void pinjamBuku(String idBuku, String idAnggota){
        Buku buku = rakBuku.get(idBuku);
        AnggotaTetap anggotaTetap = tMap.get(idAnggota);
        AnggotaBulanan anggotaBulanan = bMap.get(idAnggota);
        if (buku != null) {
            if (anggotaTetap != null) {
                anggotaTetap.tambahBuku(buku);
            } else if (anggotaBulanan != null) {
                anggotaBulanan.tambahBuku(buku);
            }
        }
    }

    public static void kembalikanBuku(String idBuku, String idAnggota){
        Buku buku = rakBuku.get(idBuku);
        AnggotaTetap anggotaTetap = tMap.get(idAnggota);
        AnggotaBulanan anggotaBulanan = bMap.get(idAnggota);
        if (buku != null) {
            if (anggotaTetap != null) {
                anggotaTetap.hapusBuku(buku);
            } else if (anggotaBulanan != null) {
                anggotaBulanan.hapusBuku(buku);
            }
        }
    }
}

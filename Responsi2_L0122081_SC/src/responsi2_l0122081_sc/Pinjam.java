/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi2_l0122081_sc;
import java.util.HashMap;
/**
 *
 * @author franklynical
 */


/**
 * The Pinjam class represents a borrowing system with book and member management.
 */
public class Pinjam {
    /**
     * A HashMap representing the bookshelf, where each book is identified by its ID.
     */
    public static HashMap<String, Buku> rakBuku = new HashMap<>();
    /**
     * A HashMap representing monthly members, where each member is identified by their ID.
     */
    public static HashMap<String, AnggotaBulanan> bMap = new HashMap<>();
    /**
     * A HashMap representing permanent members, where each member is identified by their ID.
     */
    public static HashMap<String, AnggotaTetap> tMap = new HashMap<>();
    /**
     * Adds a new book to the bookshelf with the specified ID, title, and publication year.
     *
     * @param id    The unique identifier of the book.
     * @param judul The title of the book.
     * @param tahun The publication year of the book.
     */
    public static void bukuBaru(String id, String judul, int tahun){
        Buku buku = new Buku(id, judul, tahun);
        rakBuku.put(id, buku);
    }
    /**
     * Adds a new permanent member with the specified ID, name, and the number of books borrowed.
     *
     * @param id             The unique identifier of the member.
     * @param nama           The name of the member.
     * @param jumlahDipinjam The number of books borrowed by the member.
     */
    public static void anggotaTetapBaru(String id, String nama, int jumlahDipinjam){
        AnggotaTetap anggotaTetap = new AnggotaTetap(id, nama, jumlahDipinjam);
        tMap.put(id, anggotaTetap);
    }
    /**
     * Adds a new monthly member with the specified ID, name, and the number of books borrowed.
     *
     * @param id             The unique identifier of the member.
     * @param nama           The name of the member.
     * @param jumlahDipinjam The number of books borrowed by the member.
     */
    public static void anggotaBulananBaru(String id, String nama, int jumlahDipinjam){
        AnggotaBulanan anggotaBulanan = new AnggotaBulanan(id, nama, jumlahDipinjam);
        bMap.put(id, anggotaBulanan);
    }
    /**
     * Borrows a book for a permanent member with the specified book ID and member ID.
     *
     * @param idBuku    The unique identifier of the book to be borrowed.
     * @param idAnggota The unique identifier of the permanent member.
     */
    public static void pinjamBukuTetap(String idBuku, String idAnggota) {
        Buku buku = rakBuku.get(idBuku);
        AnggotaTetap anggotaTetap = tMap.get(idAnggota);
        if (buku != null && anggotaTetap != null) {
            if (buku.getTersedia()) {
                anggotaTetap.tambahBuku(buku);
                buku.setDikembalikanToTersedia(false);
                System.out.println("Peminjaman berhasil.");
            } else {
                System.out.println("Buku tidak tersedia untuk dipinjam.");
            }
        }
    }
    
    /**
     * Returns a borrowed book from a permanent member with the specified book ID and member ID.
     *
     * @param idBuku    The unique identifier of the book to be returned.
     * @param idAnggota The unique identifier of the permanent member.
     */
    public static void kembalikanBukuTetap(String idBuku, String idAnggota) {
        Buku buku = rakBuku.get(idBuku);
        AnggotaTetap anggotaTetap = tMap.get(idAnggota);
        if (buku != null && anggotaTetap != null) {
            anggotaTetap.hapusBuku(buku);
            buku.setDikembalikanToTersedia(true);
            System.out.println("Pengembalian berhasil.");
        }
    }
    
    /**
     * Borrows a book for a monthly member with the specified book ID and member ID.
     *
     * @param idBuku    The unique identifier of the book to be borrowed.
     * @param idAnggota The unique identifier of the monthly member.
     */
    public static void pinjamBukuBulanan(String idBuku, String idAnggota) {
        Buku buku = rakBuku.get(idBuku);
        AnggotaBulanan anggotaBulanan = bMap.get(idAnggota);
        if (buku != null && anggotaBulanan != null) {
            if (buku.getTersedia()) {
                anggotaBulanan.tambahBuku(buku);
                buku.setDikembalikanToTersedia(false);
                System.out.println("Peminjaman berhasil.");
            } else {
                System.out.println("Buku tidak tersedia untuk dipinjam.");
            }
        }
    }
    
    /**
     * Returns a borrowed book from a monthly member with the specified book ID and member ID.
     *
     * @param idBuku    The unique identifier of the book to be returned.
     * @param idAnggota The unique identifier of the monthly member.
     */
    public static void kembalikanBukuBulanan(String idBuku, String idAnggota) {
        Buku buku = rakBuku.get(idBuku);
        AnggotaBulanan anggotaBulanan = bMap.get(idAnggota);
        if (buku != null && anggotaBulanan != null) {
            anggotaBulanan.hapusBuku(buku);
            buku.setDikembalikanToTersedia(true);
            System.out.println("Pengembalian berhasil.");
        }
    }
}


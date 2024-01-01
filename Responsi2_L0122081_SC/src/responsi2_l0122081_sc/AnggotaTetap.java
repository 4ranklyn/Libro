package responsi2_l0122081_sc;

import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author franklynical
 */
public class AnggotaTetap extends Anggota {
    public void setAnggotaTetap(String id, String nama, String tanggalMulai, int jumlahDipinjam) {
    this.id = id;
    this.nama = nama;
    this.date = tanggalMulai;
    this.jumlahPinjam = jumlahDipinjam;
}
    
    @Override
    public void addData(String id, String nama) {
        super.addData(id, nama);
        String ex = "Anggota Tetap " + nama + " telah ditambahkan.";
    }
    
    public void tambahBuku(Buku buku) {
        jumlahPinjam++;
    }
    
    public void hapusBuku(Buku buku) {
        jumlahPinjam--;
    }

    public AnggotaTetap(String iD, String nama, String date, int jumlahDipinjam) {
        super(iD,nama,date,jumlahDipinjam);
    }

}

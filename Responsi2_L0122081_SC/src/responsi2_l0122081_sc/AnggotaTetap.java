package responsi2_l0122081_sc;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author franklynical
 */
public class AnggotaTetap extends Anggota {
    public void setAnggotaTetap(String id, String nama, int jumlahDipinjam) {
    this.id = id;
    this.nama = nama;
    this.jumlahPinjam = jumlahDipinjam;
}
    public String getID(){
        return id;
    }
    
    public String getNama(){
        return nama;
    }
    
    public int getJumlahPinjam(){
        return jumlahPinjam;
    }
    
    @Override
    public void addData(String id, String nama) {
        super.addData(id, nama);
    }
    
    public void tambahBuku(Buku buku) {
        jumlahPinjam++;
    }
    
    public void hapusBuku(Buku buku) {
        jumlahPinjam--;
    }

    public AnggotaTetap(String iD, String nama, int jumlahDipinjam) {
        super(iD,nama,jumlahDipinjam);
    }

}

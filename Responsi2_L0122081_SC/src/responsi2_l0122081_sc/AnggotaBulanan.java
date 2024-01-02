/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi2_l0122081_sc;



/**
 *
 * @author franklynical
 */
public class AnggotaBulanan extends Anggota{
    
    public void setAnggotaBulanan(String id, String nama, int jumlahDipinjam) {
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
    
    
    public AnggotaBulanan(String id, String nama, int jumlahDipinjam){
        super(id,nama,jumlahDipinjam);
    }
    
    public void tambahBuku(Buku buku) {
        if (jumlahPinjam < 5) {
            jumlahPinjam++;
        } else {
            System.out.println("Maksimal 5 buku");
        }
    }

    public void hapusBuku(Buku buku) {
        jumlahPinjam--;
    }
    
    @Override
    public void addData(String id, String nama) {
        super.addData(id, nama);
    }
}

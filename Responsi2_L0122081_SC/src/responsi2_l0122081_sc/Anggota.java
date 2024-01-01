/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi2_l0122081_sc;
import java.time.LocalDate;
/**
 *
 * @author franklynical
 */
public class Anggota implements data{
    
    protected String id;
    protected String nama;
    protected int jumlahPinjam;
    protected LocalDate tanggalMulai;
    
    public Anggota(String id, String nama, LocalDate l, int jumlahDipinjam) {
        this.id = id;
        this.nama = nama;
        this.tanggalMulai = l;
        this.jumlahPinjam = jumlahDipinjam;
    }    
    
    public void setAnggota(String n, LocalDate l, int j) {
        this.nama = n;
        this.tanggalMulai = l;
        this.jumlahPinjam = j;
    }
    
    public String getName(){
        return nama;
    }
    
    @Override
    public void addData(String id, String nama){
        this.id = id;
        this.nama = nama;
        this.tanggalMulai = LocalDate.now();
        this.jumlahPinjam = 0;
    }

}

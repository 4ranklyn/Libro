/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi2_l0122081_sc;

/**
 *
 * @author franklynical
 */
public class Anggota implements data{
    
    protected String id;
    protected String nama;
    protected int jumlahPinjam;
    
    public Anggota(String iD, String nama,  int jumlahDipinjam) {
        this.id = iD;
        this.nama = nama;
        this.jumlahPinjam = jumlahDipinjam;
    }    
    
    public void setAnggota(String n, int j) {
        this.nama = n;
        this.jumlahPinjam = j;
    }
    
    public String getName(){
        return nama;
    }
    
    @Override
    public void addData(String id, String nama){
        this.id = id;
        this.nama = nama;
        this.jumlahPinjam = 0;
    }

}

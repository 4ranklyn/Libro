/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi2_l0122081_sc;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author franklynical
 */
public class Anggota implements data{
    
    protected String id;
    protected String nama;
    protected int jumlahPinjam;
    protected LocalDate d = LocalDate.now();
    public DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    String date = d.format(formatter);
    
    public Anggota(String iD, String nama, LocalDate d, int jumlahDipinjam) {
        this.id = iD;
        this.nama = nama;
        date = d.format(formatter);
        this.jumlahPinjam = jumlahDipinjam;
    }    
    
    public void setAnggota(String n, LocalDate d, int j) {
        this.nama = n;
        date = d.format(formatter);
        this.jumlahPinjam = j;
    }
    
    public String getName(){
        return nama;
    }
    
    @Override
    public void addData(String id, String nama){
        this.id = id;
        this.nama = nama;
        this.date = LocalDate.now().toString();
        this.jumlahPinjam = 0;
    }

}

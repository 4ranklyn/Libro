/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi2_l0122081_sc;

/**
 *
 * @author franklynical
 */
public class Buku{
    protected String id;
    protected String judul;
    protected int tahun;
    protected boolean tersedia;
    
    public Buku(String id, String judul, int tahun) {
        this.id = id;
        this.judul = judul;
        this.tahun = tahun;
        this.tersedia = true;
    }
    
    public String getJudul() {
        return judul;
    }
    
    public void setDikembalikanToTersedia(){
        this.tersedia = true;
    }
    
    public boolean getTersedia(){
        return tersedia;
    }
    
    public void setTahun(int tahun){
        this.tahun=tahun;
    }
    
}

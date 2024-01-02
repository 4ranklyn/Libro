/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi2_l0122081_sc;

/**
 *
 * @author franklynical
 */

/**
 * The Anggota class represents a member with a unique identifier, name, and the number of items borrowed.
 * It implements the data interface to provide a method for adding data.
 */
public class Anggota implements data{
    /**
     * The unique identifier for the member.
     */    
    protected String id;
    /**
     * The name of the member.
     */    
    protected String nama;
    /**
     * The number of items currently borrowed by the member.
     */    
    protected int jumlahPinjam;

    /**
     * Constructs an Anggota object with the specified ID, name, and the initial number of items borrowed.
     *
     * @param iD             The unique identifier for the member.
     * @param nama           The name of the member.
     * @param jumlahDipinjam The initial number of items borrowed by the member.
     */    
    public Anggota(String iD, String nama,  int jumlahDipinjam) {
        this.id = iD;
        this.nama = nama;
        this.jumlahPinjam = jumlahDipinjam;
    }    
    /**
     * Sets the name and the number of items borrowed for the member.
     *
     * @param n The new name for the member.
     * @param j The new number of items borrowed by the member.
     */
    public void setAnggota(String n, int j) {
        this.nama = n;
        this.jumlahPinjam = j;
    }
    /**
     * Gets the name of the member.
     *
     * @return The name of the member.
     */
    public String getName(){
        return nama;
    }
    /**
     * Adds data with the specified ID and name, initializing the number of items borrowed to 0.
     *
     * @param id   The unique identifier for the member.
     * @param nama The name of the member.
     */    
    @Override
    public void addData(String id, String nama){
        this.id = id;
        this.nama = nama;
        this.jumlahPinjam = 0;
    }

}

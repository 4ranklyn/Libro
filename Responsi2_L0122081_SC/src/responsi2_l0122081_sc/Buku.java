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
    /**
     * The attributes of the book.
     */
    protected String id;
    protected String judul;
    protected int tahun;
    protected boolean tersedia;
    
    /**
     * Constructs a new Buku object with the specified ID, title, and publication year.
     *
     * @param id    The unique identifier of the book.
     * @param judul The title of the book.
     * @param tahun The publication year of the book.
     */
    public Buku(String id, String judul, int tahun) {
        this.id = id;
        this.judul = judul;
        this.tahun = tahun;
        this.tersedia = true;
    }
    
    /**
     * Updates the book information with the specified ID, title, publication year, and availability status.
     *
     * @param id        The unique identifier of the book.
     * @param judul     The title of the book.
     * @param tahun     The publication year of the book.
     * @param tersedia The availability status of the book.
     */
    public void bukuBaru(String id, String judul, int tahun, boolean tersedia) {
        this.id = id;
        this.judul = judul;
        this.tahun = tahun;
        this.tersedia = tersedia;
    }
    
    /**
     * Gets the title of the book.
     *
     * @return The title of the book.
     */
    public String getJudul() {
        return judul;
    }
    
    /**
     * Sets the availability status of the book to the specified value.
     *
     * @param t True if the book is available, false otherwise.
     */
    public void setDikembalikanToTersedia(boolean t){
        this.tersedia = t ;
    }
    
    /**
     * Gets the publication year of the book.
     *
     * @return The publication year of the book.
     */
    public int getTahun() {
        return tahun;
    }
    
    /**
     * Checks if the book is available.
     *
     * @return True if the book is available, false otherwise.
     */
    public boolean getTersedia(){
        return tersedia;
    }
    /**
     * Sets the publication year of the book to the specified value.
     *
     * @param tahun The new publication year of the book.
     */
    public void setTahun(int tahun){
        this.tahun=tahun;
    }
    
}

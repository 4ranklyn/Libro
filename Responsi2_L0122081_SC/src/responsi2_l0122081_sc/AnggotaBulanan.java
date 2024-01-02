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
 * The AnggotaBulanan class represents a monthly member that extends the Anggota class.
 * It includes methods for adding and removing books, and inherits properties from the Anggota class.
 */
public class AnggotaBulanan extends Anggota{
    /**
     * Sets the ID, name, and the initial number of items borrowed for the monthly member.
     *
     * @param id            The unique identifier for the monthly member.
     * @param nama          The name of the monthly member.
     * @param jumlahDipinjam The initial number of items borrowed by the monthly member.
     */
    public void setAnggotaBulanan(String id, String nama, int jumlahDipinjam) {
    this.id = id;
    this.nama = nama;
    this.jumlahPinjam = jumlahDipinjam;
    }
    /**
     * Gets the unique identifier of the monthly member.
     *
     * @return The unique identifier of the monthly member.
     */
    public String getID(){
        return id;
    }
    /**
     * Gets the name of the monthly member.
     *
     * @return The name of the monthly member.
     */
    public String getNama(){
        return nama;
    }
    
    /**
     * Gets the current number of items borrowed by the monthly member.
     *
     * @return The current number of items borrowed by the monthly member.
     */
    public int getJumlahPinjam(){
        return jumlahPinjam;
    }
    
    /**
     * Constructs an AnggotaBulanan object with the specified ID, name, and the initial number of items borrowed.
     *
     * @param id            The unique identifier for the monthly member.
     * @param nama          The name of the monthly member.
     * @param jumlahDipinjam The initial number of items borrowed by the monthly member.
     */
    public AnggotaBulanan(String id, String nama, int jumlahDipinjam){
        super(id,nama,jumlahDipinjam);
    }

    /**
     * Adds a book to the monthly member's borrowed items, up to a maximum of 5 books.
     *
     * @param buku The book to be added.
     */    
    public void tambahBuku(Buku buku) {
        if (jumlahPinjam < 5) {
            jumlahPinjam++;
        } else {
            System.out.println("Maksimal 5 buku");
        }
    }
    /**
     * Removes a book from the monthly member's borrowed items.
     *
     * @param buku The book to be removed.
     */
    public void hapusBuku(Buku buku) {
        jumlahPinjam--;
    }
    /**
     * Adds data with the specified ID and name using the superclass method.
     *
     * @param id   The unique identifier for the monthly member.
     * @param nama The name of the monthly member.
     */
    @Override
    public void addData(String id, String nama) {
        super.addData(id, nama);
    }
}

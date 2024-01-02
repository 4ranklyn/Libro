package responsi2_l0122081_sc;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author franklynical
 */

/**
 * The AnggotaTetap class represents a permanent member that extends the Anggota class.
 * It includes methods for adding and removing books, and inherits properties from the Anggota class.
 */
public class AnggotaTetap extends Anggota {
    /**
     * Sets the ID, name, and the initial number of items borrowed for the permanent member.
     *
     * @param id            The unique identifier for the permanent member.
     * @param nama          The name of the permanent member.
     * @param jumlahDipinjam The initial number of items borrowed by the permanent member.
     */
    public void setAnggotaTetap(String id, String nama, int jumlahDipinjam) {
    this.id = id;
    this.nama = nama;
    this.jumlahPinjam = jumlahDipinjam;
}
    /**
     * Gets the unique identifier of the permanent member.
     *
     * @return The unique identifier of the permanent member.
     */
    public String getID(){
        return id;
    }
    /**
     * Gets the name of the permanent member.
     *
     * @return The name of the permanent member.
     */
    public String getNama(){
        return nama;
    }
    /**
     * Gets the current number of items borrowed by the permanent member.
     *
     * @return The current number of items borrowed by the permanent member.
     */
    public int getJumlahPinjam(){
        return jumlahPinjam;
    }
    /**
     * Adds data with the specified ID and name using the superclass method.
     *
     * @param id   The unique identifier for the permanent member.
     * @param nama The name of the permanent member.
     */
    @Override
    public void addData(String id, String nama) {
        super.addData(id, nama);
    }
    
    /**
     * Adds a book to the permanent member's borrowed items.
     *
     * @param buku The book to be added.
     */
    public void tambahBuku(Buku buku) {
        jumlahPinjam++;
    }
    /**
     * Removes a book from the permanent member's borrowed items.
     *
     * @param buku The book to be removed.
     */
    public void hapusBuku(Buku buku) {
        jumlahPinjam--;
    }
    /**
     * Constructs an AnggotaTetap object with the specified ID, name, and the initial number of items borrowed.
     *
     * @param iD            The unique identifier for the permanent member.
     * @param nama          The name of the permanent member.
     * @param jumlahDipinjam The initial number of items borrowed by the permanent member.
     */
    public AnggotaTetap(String iD, String nama, int jumlahDipinjam) {
        super(iD,nama,jumlahDipinjam);
    }

}

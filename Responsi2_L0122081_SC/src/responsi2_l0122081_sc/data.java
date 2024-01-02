/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package responsi2_l0122081_sc;
/**
 *
 * @author franklynical
 */

/**
 * The data interface declares the method for adding data.
 * Classes implementing this interface must provide an implementation for adding data.
 */
public interface data {
    /**
     * Adds data with the specified ID and name.
     *
     * @param id The unique identifier for the data.
     * @param n  The name associated with the data.
     */
    void addData(String id, String n);
}

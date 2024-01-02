/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi2_l0122081_sc;
import java.util.HashMap;

/**
 *
 * @author franklynical
 */

/**
 * The User class manages user data for the application.
 * It stores user information in a HashMap where the username is associated with the corresponding password.
 */
public class User {

    /**
     * A HashMap to store user data, where the key is the username and the value is the password.
     */
    public static HashMap<String, String> users = new HashMap<>();

    /**
     * Adds a new user to the user data HashMap.
     *
     * @param username The username of the new user.
     * @param password The password associated with the username.
     */
    public static void addUser(String username, String password) {
        users.put(username, password);
    }
}
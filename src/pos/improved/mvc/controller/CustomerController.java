/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.improved.mvc.controller;
import java.sql.Connection;
import pos.improved.mvc.db.DBConnection;

/**
 *
 * @author User
 */
public class CustomerController {
    Connection connection=DBConnection.getInstance().getConnection();
}

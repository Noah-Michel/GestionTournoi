/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOA;

/**
 *
 * @author noahm
 */
public class DAOException extends Exception{
    public DAOException(String message, Throwable cause){
        super(message, cause);
    }
    public DAOException(Throwable cause){
        super(cause);
    }
}
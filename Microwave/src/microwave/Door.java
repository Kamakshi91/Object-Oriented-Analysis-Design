/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package microwave;

/**
 *
 * @author kamakshi
 */

public class Door {

    private boolean Ison;
    public void open()
    {
        Ison = true;
        System.out.println("Door is open.");
            
    }
    public void close()
    {
        Ison = false;
        System.out.println("Door is closed.");
    }
    public boolean ison()
    {
        return Ison;
    }
    
}

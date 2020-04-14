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
public class Light {
    private boolean Ison;
    public void on()
    {
        Ison = true;
        System.out.println("Light is on.");
    }
    public void off()
    {
        Ison = false;
        System.out.println("Light is off.");
    }
    public boolean ison()
    {
        return Ison;
    }
}

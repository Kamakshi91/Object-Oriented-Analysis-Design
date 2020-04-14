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
public class PowerTube {
    private boolean Ison;
    public void on()
    {
        Ison = true;
        System.out.println("the power tube is on.");
    }
    public void off()
    {
        Ison = false;
        System.out.println("the power tube is off.");
    }
    public boolean ison()
    {
        return Ison;
    }
}

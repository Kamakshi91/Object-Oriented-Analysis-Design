/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fsm;

/**
 *
 * @author kamakshi
 */
public class One extends Fsm {
    
    boolean state=false;
    public void on(){
        state=true;
    
    }
    public void off(){
        state=false;
    }

    

    
}

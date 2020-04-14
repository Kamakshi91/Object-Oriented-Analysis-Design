/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.ArrayList;

/**
 *
 * @author kamakshi
 */
public class DoubleIterator implements iIterator<Double> {
    ArrayList<Double> str;
    int i =0;
    
    DoubleIterator(ArrayList<Double> inte) {
        this.str=inte; 
         }
   @Override 
    public Double first() {
            return str.get(0);
        }
@Override
        public boolean isDone() {
            
        if(i>=str.size())
        {return true;}
        else
        {return false;}
        }
@Override
        public Double currentItem() {
            return str.get(i);
        }
@Override
        public Double next() {
            if(!isDone()) {
            return str.get(i++);
                
                
            } else  {
                return null;
            }
} 
    
}

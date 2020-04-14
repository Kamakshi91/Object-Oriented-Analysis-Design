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
public class IntegerIterator implements iIterator<Integer> {
  ArrayList<Integer> str;
    int i =0;
    

    IntegerIterator(ArrayList<Integer> inte) {
        this.str=inte; 
         }
   @Override 
    public Integer first() {
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
        public Integer currentItem() {
            if(!isDone()){
                return str.get(i);}
            else{return null;}
        }
@Override
        public Integer  next() {
            if(!isDone()) { 
            return str.get(i++);
                
                
            } else  {
                return null;
            }
} 
}

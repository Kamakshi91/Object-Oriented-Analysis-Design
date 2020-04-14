/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author kamakshi
 */
public class StringIterator implements iIterator<String> {
    ArrayList<String> str;
    int i =0;
    

    StringIterator(ArrayList<String> stri) {
        this.str=stri; }
   @Override 
    public String first() {
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
        public String currentItem() {
            return str.get(i);
        }
@Override
        public String  next() {
            if(!isDone()) { 
            return str.get(i++);
               
            } else  {
                return null;
            }
}
}

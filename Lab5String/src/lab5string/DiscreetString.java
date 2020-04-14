/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5string;

import mystring.MyString;
import mystring.IndiscreetString;

/**
 *
 * @author kamakshi
 */
public class DiscreetString implements MyString{
    int n=0;
    String string1;
    IndiscreetString ind=new IndiscreetString();
    
    public void setText(String stri) {
        
       
        
        
        stri=stri.replaceAll("bom","b*m");
        stri=stri.replaceAll("poopoos", "po*po*s");
        stri=stri.replaceAll("knickers", "kn*ckers");
        stri=stri.replaceAll("weewee", "w**w**");
        String[] str = stri.split(" ");
        for(String s:str){
            if(s.contains("*"))
            {
                n+=1;
                
               
                
            }
          
            
    }
      
        
        ind.setText(stri);
        close();
           }

    
    public String getText() {
        //ind.getText();
        return ind.getText();}

   
    public void clear() {
        ind.clear();
          }

  
    public void reverse() {
        
        ind.reverse();
     }
    
    public void close(){
        System.out.println("The user attempted to insert "+ n +" naughty words");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        String st="All you hear on TV now is bom, bom, weewee, knickers, poopoos, bom, bom, weewee, knickers and a lot of poopoos";
        DiscreetString dis=new DiscreetString();
        dis.setText(st);
        System.out.println(dis.getText());
        
        dis.reverse();
        System.out.println(dis.getText());
        
        
    }
}

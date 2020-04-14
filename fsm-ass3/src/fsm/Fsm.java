/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fsm;
import java.util.Scanner;
import java.util.*;



/**
 *
 * @author kamakshi
 */
public class Fsm implements FSMState {
    int i =0;
    int j = 0;
    Fsm state;
    boolean st=false;
    public void fsm(){
        while(j==0){
        Scanner in = new Scanner( System.in );
        System.out.println("Enter string >");
    String input= in.next();
    One one=new One();
    Two two =new Two();
    Three three = new Three();
    Four four=new Four();
    if(input.startsWith("a") || input.startsWith("b")){
       one.on();
       while(i<input.length())
       {
       //System.out.println(input.charAt(i));
       if(input.charAt(i)=='a' && one.state)
       {
       one.off();
       three.on();
       }
       else if(input.charAt(i)=='b' && one.state)
       {
       one.off();
       two.on();
       }
       else if(input.charAt(i)=='a' && two.state)
       {
       two.off();
       four.on();
       }
       else if(input.charAt(i)=='b' && two.state)
       {
       two.off();
       one.on();
       }
       else if(input.charAt(i)=='a' && three.state)
       {
       three.off();
       one.on();
       }
       else if(input.charAt(i)=='b' && three.state)
       {
       three.off();
       four.on();
       }
       else if(input.charAt(i)=='a' && four.state)
       {
       four.off();
       two.on();
       }
       else if(input.charAt(i)=='b' && four.state)
       {
       four.off();
       three.on();
       }
       i++;
       }
       st=one.state;
       states(one);
       
    }
    else{
        System.out.println("Goodbye!");
        j++;
    }
    
    
        }
    }
    public void states(One state) {
        if(state.state==true){
        System.out.println("String accepted");
    }
        else{System.out.println("String not accepted");}
        
        
    
    }
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fsm fsm = new Fsm();
        fsm.fsm();
    }

   

    

  
    
}

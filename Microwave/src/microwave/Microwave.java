/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package microwave;
import java.util.Scanner;
/**
 *
 * @author kamakshi
 */
public class Microwave {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // TODO code application logic herechar cook;
        boolean carryon = true;
        CookButton cook = new CookButton();
        CancelButton cancel = new CancelButton();
        Door door = new Door();
        Oven oven = new Oven();
        PowerTube tube = new PowerTube();
        Beeper beep = new Beeper();
        Light light = new Light();
        MyTimer tim = new MyTimer(oven);
        boolean isrunning;
        while(carryon){
        System.out.println("Enter the function");
        String micro = input.nextLine();
        
            
            switch(micro)
            {
                case "p":cook.Cook();
                
                    break;
                case "d":
                    
                   cook.door();
                    break;
                case "c":
                    cook.Cancel();
              
                    break;  
                default: System.out.println("ending the microwave system");
                        
                    carryon = false;
                break;
            }
        }    
    } 
    
}

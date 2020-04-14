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
public class CookButton {
    private boolean isrunning;
    
    Oven oven;
    
    Light light = new Light();
    Beeper beep = new Beeper();
    Door door = new Door();
    MyTimer timers = new MyTimer(oven);
    PowerTube tube = new PowerTube();
    
    
    public void Cook(){
        isrunning = timers.isRunning();
        if(isrunning==false && door.ison()==false){
          light.on(); 
          tube.on();
          beep.beep();
          timers.Add1Minute();
          
          }
        else if(isrunning && door.ison()==false){
            timers.AddExtraMinute();
            beep.beep();
                  
                  }
        else{beep.beep();
        }
          
          
        }
    public void Cancel()
        {
        isrunning = timers.isRunning();
        if(isrunning)
            {
            light.off(); 
            beep.beep();
            System.out.println("Cooking cancelled by pressing Cancel");
            timers.Cancel();
            }
       
        else
        {
            beep.beep();}
              
        }  
    public void door(){
        isrunning = timers.isRunning();
                if(door.ison())
                    {door.close();}
                    else if(door.ison()==false && isrunning)
                    {
                    door.open();
                    System.out.println("Cooking cancelled by opening door");
                    light.on();
                    beep.beep();
                    tube.off();
                    timers.Cancel();
                    }
                    else
                    {door.open();}      
    }  
}

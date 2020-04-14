/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

import java.awt.event.KeyEvent;
import java.util.Scanner;
import java.io.Console;
import java.util.*;

/**
 *
 * @author kamakshi
 */
public class Pizza {
    Scanner pi = new Scanner(System.in);
    Scanner pi2 = new Scanner(System.in);
    private int pick;
    
public Pizza(){
    int i=0;
     while(i==0){
      Pizzas pizza;
     List<String> topp=new ArrayList<String>(); 
    int pick;
    double cost;
    
    pick=pi.nextInt();
    pizza=createPizza(pick);
    String ing;
    ing = pi2.next();
    for(int a=0;a< ing.length();a++){
        decorations(ing.charAt(a),pizza);
    }
    topp=pizza.Topping;
    cost = pizza.cost;
    
    
    
        //KeyEvent KeyEvent;
    KeyEvent ke ;
    //i = enter(ke);
    //if(i==1)
    //{
        if(topp.size()>0){
     System.out.println("Order: "+pizza.size+" with "+topp+" $"+cost);
        System.out.println((topp.size())+" Ingredients ");
        System.out.println("End Order ");
        }
        else{
            System.out.println("Order: "+pizza.size);
        //System.out.println((topp.size()+1)+" Ingredients ");
        System.out.println("End Order ");
            
       // }
    }
     }
    }
public Pizzas createPizza(int pick)
{
   
	if (pick == 1) {Pizzas pizza = new small();return pizza;}
        else if (pick == 2) {Pizzas pizza = new medium();return pizza;}
        else if (pick == 3){Pizzas pizza = new large();return pizza;}
        else if (pick == 4) {Pizzas pizza = new family();
        return pizza;}
        
        return null;
}
/*public int enter(KeyEvent ke)
{
    if(ke.getKeyCode() == KeyEvent.VK_ESCAPE)
    {
        System.out.println("order is cancelled");
        return 1;
    }
    else if (ke.getKeyCode() == KeyEvent.VK_ENTER){
        return 0;
    }
    return 0;
}*/
public void decorations(char a, Pizzas pizza){
    
    switch(a)
    {
        case 'p':pizza = new Pepperoni(pizza);
            
                break;
        case 's':pizza = new Sausage(pizza);
                break;
        case 'h':pizza = new Hamburger(pizza);
                break;
        case 'c':pizza = new CanadianBacon(pizza);
                break;
        case 'e':pizza = new Extracheese(pizza);
                break;
        case 'o':pizza = new Onions(pizza);
                break;
        case 'g':pizza = new GreenPepper(pizza);
                break;
        case 'b':pizza = new BlackOlives(pizza);
                break;
        case 'n':pizza = new GreenOlives(pizza);
                break;
        case 'm':pizza = new Mushrooms(pizza);
                break;
        case 'a':pizza = new Anchovies(pizza);
                break;
        case 'r':pizza = new Beer(pizza);
                break;
        default:break;
        
    }
    //return pizza;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pizza pi = new Pizza();
        // TODO code application logic here
    }
    
}

package pizza;
import java.util.*;

import pizza.Toppings;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kamakshi
 */
public class Pepperoni extends Toppings {
    Pizzas pizzas; 
  
    public Pepperoni(Pizzas pizza) { this.pizzas = pizza;Toppings();pizza.cost+= getCost()+pizza.getCost();} 
    
    public String Toppings() { 
        pizzas.Topping.add("Pepperoni");
        
        return pizzas.Topping+"Pepperoni";
        
                 
    } 
    public double getCost() { 
        return 2;  } 

    public String getsize() 
    { 
        return this.size; 
    }

   

   
     }
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

import java.util.List;

/**
 *
 * @author kamakshi
 */
public class Onions extends Toppings {
    Pizzas pizza; 
  
    public Onions(Pizzas pizza) { this.pizza = pizza;Toppings();pizza.cost+= getCost()+pizza.getCost(); } 
    public String Toppings() { 
       pizza.Topping.add("Onions");
        return pizza.Topping+"Onions";
                 
    } 
    public double getCost() {return 1.5;  } 

    public String getsize() 
    { 
        return this.size; 
    }
    
}

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
public class Beer extends Toppings {
    Pizzas pizza; 
  
    public Beer(Pizzas pizza) { this.pizza = pizza; Toppings();pizza.cost+= getCost()+pizza.getCost(); } 
    public String Toppings() { 
        pizza.Topping.add("Beer");
        return pizza.Topping+"Beer";
                 
    } 
    public double getCost() { return 3.25;  } 

    public String getsize() 
    { 
        return this.size; 
    }
    
}

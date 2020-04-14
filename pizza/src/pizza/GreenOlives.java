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
public class GreenOlives extends Toppings {
    Pizzas pizza; 
  
    public GreenOlives(Pizzas pizza) { this.pizza = pizza;Toppings();pizza.cost+= getCost()+pizza.getCost(); } 
    public String Toppings() { 
        pizza.Topping.add("GreenOlives");
        return pizza.Topping+"GreenOlives";
                 
    } 
    public double getCost() { return 1.35;  } 

    public String getsize() 
    { 
        return this.size; 
    }
    
    
}

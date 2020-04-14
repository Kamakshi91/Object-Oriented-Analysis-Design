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
public class BlackOlives extends Toppings {
    Pizzas pizza; 
  
    public BlackOlives(Pizzas pizza) { this.pizza = pizza;Toppings(); pizza.cost+= getCost()+pizza.getCost(); } 
    public String Toppings() { 
        pizza.Topping.add("Black Olives");
        return pizza.Topping+"Black Olives";
                 
    } 
    public double getCost() { return  1.5;  } 

    public String getsize() 
    { 
        return this.size; 
    }
    
}

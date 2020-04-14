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
public class Anchovies extends Toppings {
    Pizzas pizza; 
  
    public Anchovies(Pizzas pizza) { this.pizza = pizza;Toppings();pizza.cost+= getCost()+pizza.getCost(); } 
    public String Toppings() { 
        pizza.Topping.add("Anchovies");
        return pizza.Topping+"Anchovies";
                 
    } 
    public double getCost() { return 0;  } 

    public String getsize() 
    { 
        return this.size; 
    }
    
}

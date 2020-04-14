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
public class Extracheese extends Toppings {
    Pizzas pizza; 
  
    public Extracheese(Pizzas pizza) { this.pizza = pizza;Toppings();pizza.cost+= getCost()+pizza.getCost(); } 
    public String Toppings() { 
        pizza.Topping.add("Extracheese");
        return pizza.Topping+"Extracheese";
                 
    } 
    public double getCost() { return 1.85; } 

    public String getsize() 
    { 
        return this.size; 
    }
    
}

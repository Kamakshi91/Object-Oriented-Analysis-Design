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
public class Sausage extends Toppings {
    Pizzas pizza; 
  
    public Sausage(Pizzas pizza) { this.pizza = pizza;Toppings();pizza.cost+= getCost()+pizza.getCost(); } 
    public String Toppings() { 
        pizza.Topping.add("Sausage");
        return pizza.Topping+"Sausage";
                 
    } 
    public double getCost() { 
        return 2 ; } 

    public String getsize() 
    { 
        return this.size; 
    }

}

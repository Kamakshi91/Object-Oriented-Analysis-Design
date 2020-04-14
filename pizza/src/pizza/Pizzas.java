/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;


import java.util.*;

/**
 *
 * @author kamakshi
 */
abstract class Pizzas 
{ 
    // it is an abstract pizza 
    String size = "Unknown size";
    List<String> Topping= new ArrayList<String>();
    double cost =0.0;
  
    public String getsize() 
    {
        
        return size; 
    }
   
  
    public abstract double getCost(); 
} 

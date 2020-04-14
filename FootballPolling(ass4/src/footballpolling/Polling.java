/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballpolling;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.*;

/**
 *
 * @author kamakshi
 */
public class Polling extends Voters {
    protected Map<String,Integer> APsums = new HashMap<String,Integer>();
    protected Map<String,Integer> USAsums = new HashMap<String,Integer>();
    Hashtable<String,ArrayList<Integer>> APpoll = new Hashtable<String,ArrayList<Integer>>();
    Hashtable<String,ArrayList<Integer>> USApoll = new Hashtable<String,ArrayList<Integer>>();
    String key;
    int APsum=0;
    int USAsum=0;
    List<Integer> value= new ArrayList<Integer>();
    
   public Polling(){
       for(int i =1;i<=25;i++)
       {
           Random p =new Random();
           int randomint;
           List<Integer> Ranks= new ArrayList<Integer>();
           key=Teams.get(i);
           value=polls.get(i);
         //getting ranks from each voter who voted for each team
           if(value.size()>0){
                for(int a : value)
                {
                    if(a<=40)
                    {
                     randomint=p.nextInt(25)+1;
                     AP(key,randomint);
                     USA(key,26);
                    }
                    else if(a>60)
                    {
                      randomint=p.nextInt(25)+1;
                      USA(key,randomint);
                      AP(key,26);
                    }
                    else if(a>40 && a<=60)
                    {
                        randomint=p.nextInt(25)+1;
                        AP(key,randomint);
                        USA(key,randomint);
                    }
                }
           }
           else
           {
                AP(key,26);
                USA(key,26);
           }
       }
      //Finding sum of the ranks
       APSum();
       USASum();
   }
   
   //Get ranks for each votes in AP poll
   public void AP(String s,int m)
   {
       List<Integer> ranks= new ArrayList<Integer>();
   if(!APpoll.containsKey(s))
       {
         ranks.add(m);  
       APpoll.put(s, (ArrayList<Integer>) ranks);
       }
   else  
       {  
           ranks.add(m);
           APpoll.get(s).add(m);      
       }          
   }
   
   //Get ranks for each votes in USA poll
   public void USA(String s,int m)
   {
       List<Integer> ranks= new ArrayList<Integer>();
   if(!USApoll.containsKey(s))
       {
         ranks.add(m);  
       USApoll.put(s, (ArrayList<Integer>) ranks);
       }
       else
       {  
           ranks.add(m);
           USApoll.get(s).add(m);      
       }
   }
   
   public void APSum()
   {
       
       for(String s:APpoll.keySet())
       {
           int sum=0;
           value=APpoll.get(s);
           if(value!=null){
           for(int o:value)
           {
              sum+=26-o; 
           }
           }
           APsums.put(s,  sum);  
       }
       
   }
   
   public void USASum()
   {
       for(String s:USApoll.keySet())
       {
           int sum=0;
           value=USApoll.get(s);
           if(value!=null){
           for(int o:value)
           {
              sum+=26-o; 
           }
           }
           USAsums.put(s,  sum);   
       }
   }
}

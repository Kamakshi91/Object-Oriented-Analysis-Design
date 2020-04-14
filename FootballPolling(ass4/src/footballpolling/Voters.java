/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballpolling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/**
 *
 * @author kamakshi
 */
public class Voters{
    
    protected Hashtable<Integer, ArrayList<Integer>> polls = new Hashtable<Integer, ArrayList<Integer>>();
    protected Hashtable<Integer, String> Teams = new Hashtable<Integer, String>();
    List<Integer> votes= new ArrayList<Integer>();
     public Voters(){
        
        List<Integer> nums= new ArrayList<Integer>() ;
        String randomstring;
        int randomint;
        Random r =new Random();
        //array for number of teams to be given random numbers
        for (int i = 0; i < 25; ++i)
        {
            nums.add(i+1);
        }
        
        try
        {
            //reading the team.txt
        List<String> line = Files.readAllLines(Paths.get("/Users/kamakshi/Desktop/FootballPolling/src/footballpolling/teams.txt"));
        //System.out.println(line);
        for(int j=0;j<25;j++)
        {
         int k=r.nextInt(line.size());
         int l=r.nextInt(nums.size());
        randomstring=line.get(k);
        randomint=nums.get(l);
        Teams.put(randomint, randomstring);
        line.remove(k);
        nums.remove(l);
        }
        //System.out.println(Teams);
        //voting of 100 persons for 25 teams
        for(int i =1;i<=100;i++){
        int j = r.nextInt(25)+1;
        teams(i,j);
        
        }
        for (int i=1;i<=25;i++)
        {
          if(!polls.containsKey(i))  {
          polls.put(i, (ArrayList<Integer>) votes);
          }
          
        }
        }
        catch (IOException e) {e.printStackTrace();}   
        //System.out.println(polls.size());
        //System.out.println(polls);
    }

    public void teams(int i, int j) {
        List<Integer> votes= new ArrayList<Integer>();
        //votes.add(i);
       
       if(!polls.containsKey(j) )
       {
         votes.add(i);  
       polls.put(j, (ArrayList<Integer>) votes);
       }
       else if(polls.containsKey(j))
       {  
           votes.add(i);
           polls.get(j).add(i);      
       }
       
       else {return;}
       
       
             
        }
    
    
}

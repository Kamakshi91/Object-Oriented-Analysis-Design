/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballpolling;

import java.io.IOException;
import java.util.*;
import java.util.Map.*;

/**
 *
 * @author kamakshi
 */
public class Media extends Polling {
    List<Entry<String,Integer>> USA= new ArrayList<Entry<String,Integer>>();
    List<Entry<String,Integer>> AP= new ArrayList<Entry<String,Integer>>();
    public Media()
    {
        USA=Sorted(USAsums);
        AP=Sorted(APsums);
        
        //printing for media with both polls
       System.out.printf("%-10s%-50s%-30s%n", "    ","LA Times", "ESPN");
        System.out.printf("%-20s%-30s%-20s%-25s%n","AP","USAToday","AP","USAToday" );
        
        int d=0,e=0;
        while(d<USA.size() && e<AP.size())
        {
            System.out.printf("%-20s%-30s%-20s%-25s%n",(e+1)+"."+AP.get(e).getKey(), (d+1)+"."+USA.get(d).getKey(), (e+1)+"."+AP.get(e).getKey(), (d+1)+"."+USA.get(d).getKey());
            d++;
            e++;
        }
        System.out.println("\n");
        System.out.printf("%-10s%-50s%-30s%n", "    ","Washington Post", "Sports Weekly");
        System.out.printf("%-20s%-30s%-20s%-25s%n","AP","USAToday","AP","USAToday" );
        d=0;
        e=0;
        while(d<USA.size() && e<AP.size())
        {
            System.out.printf("%-20s%-30s%-20s%-25s%n",(e+1)+"."+AP.get(e).getKey(), (d+1)+"."+USA.get(d).getKey(), (e+1)+"."+AP.get(e).getKey(), (d+1)+"."+USA.get(d).getKey());
            d++;
            e++;
        }
    }
    //Sorting the Usasums and APsums 
    public List<Entry<String,Integer>> Sorted(Map<String,Integer> loan)
    {
            List<Entry<String,Integer>> sortedEntries = new ArrayList<Entry<String,Integer>>(loan.entrySet());
            Collections.sort(sortedEntries, 
            new Comparator<Entry<String,Integer>>() {
                @Override
                public int compare(Entry<String,Integer> e1, Entry<String,Integer> e2) {
                    return e2.getValue().compareTo(e1.getValue());
                }
            }
            );
           return sortedEntries;
    }
}

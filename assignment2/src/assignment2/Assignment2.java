/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;
import java.io.*; 
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;


/**
 *
 * @author kamakshi
 */

public class Assignment2 {
        
        public static <T> void printAll(iIterator<T> s){
            
            while(!s.isDone())
            {
                System.out.println(s.currentItem());
                s.next();
            }
            
        }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> stri = new ArrayList<String>();
        ArrayList<Integer> inte = new ArrayList<Integer>();
        ArrayList<Double> doub = new ArrayList<Double>();
        
        try (BufferedReader br = new BufferedReader(new FileReader("/Users/kamakshi/Desktop/assignment2/src/assignment2/input.txt")))
        {
            String str;
            int i=0, j =0,k =0;
            int a=1;
            int n = 0;
            String line = Files.readAllLines(Paths.get("/Users/kamakshi/Desktop/assignment2/src/assignment2/input.txt")).get(n);
            String[] details = line.split(" ");
            i=Integer.parseInt(details[0]);
            j = Integer.parseInt(details[1]);
            k = Integer.parseInt(details[2]);
            int l =1;
            while ((str = br.readLine()) != null) {
                if(i!=0){
                    if(l==1){
                       l++; 
                    }
                    else{
                    inte.add(Integer.parseInt(str));
                    i--;
                    }
                }
                else if(i==0 && j!=0){
                    doub.add(Double.parseDouble(str));
                    j--;
            }
                else if(i==0 && j==0 && (k!=0)){
                    k--;
                    stri.add(str);
                }
            }
            iIterator<String> Str=new StringIterator(stri);
            iIterator<Integer> Int=new IntegerIterator(inte);
            iIterator<Double> DoubleI=new DoubleIterator(doub);
            printAll(DoubleI);
            printAll(Int);
            printAll(Str);
        } catch (IOException e) {
            e.printStackTrace();
        } 

    }
        
    
}
    
    


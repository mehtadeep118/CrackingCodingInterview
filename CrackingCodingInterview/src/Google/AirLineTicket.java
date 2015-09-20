/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Google;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Deep
 * Given an bunch of airline tickets with [from, to], for example [MUC, LHR], [CDG, MUC], [SFO, SJC], [LHR, SFO], please reconstruct the itinerary in order, 
   for example: [ CDG, MUC, LHR, SFO, SJC ]. 
   tickets can be represented as nodes
 */
public class AirLineTicket 
{
    public static void main(String[] args)
    {
        reconstruct();
    }
    
    public static void reconstruct()
    {
        String start="";
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("MUC", "LHR");
        map.put("CDG", "MUC");
        map.put("SFO", "SJC");
        map.put("LHR", "SFO");
        TreeMap<String,String> tree = new TreeMap<String,String>(map);
        TreeSet<String> set = new TreeSet<String>(map.values());
        System.out.println(set);
       // if(tree.containsValue(tree))
        start=tree.firstKey();
        System.out.println(start);
        for(int i=0;i<tree.size();i++)
        {
            
            System.out.print(" "+tree.get(start));
            
            start=tree.get(start);
            
           
        }
        
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Carinfo;

import java.util.ArrayList;
import Carinfo.Servicerecord;

/**
 *
 * @author Sachin
 */
public class Servicerecordhistory {
    
    private ArrayList<Servicerecord> history;
    
    public Servicerecordhistory(){
        
        this.history = new ArrayList<Servicerecord>();
    }

    public ArrayList<Servicerecord> getHistory()             {
        return history;
    }

    public void setHistory(ArrayList<Servicerecord> history) {
        this.history = history;
    }
     public Servicerecord addNewServicerecord(){
         
         Servicerecord newServicerecord = new Servicerecord();
         history.add(newServicerecord);
         return newServicerecord;
     }
    
}

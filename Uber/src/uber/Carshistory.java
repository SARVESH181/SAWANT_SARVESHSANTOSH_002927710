/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uber;
import java.util.ArrayList;

/**
 *
 * @author Sarvesh
 */
public class Carshistory {
    private ArrayList<Cars> hist;
    public Carshistory(){
        this.hist = new ArrayList<Cars>();
    }

    public ArrayList<Cars> getHist() {
        return hist;
    }

    public void setHist(ArrayList<Cars> hist) {
        this.hist = hist;
    }
    
    public Cars addDetails(){
        Cars cars = new Cars();
        hist.add(cars);
        return cars;
    }
         
    public void deleteDetails(Cars cars){
        hist.remove(cars);
    }
    
    
}

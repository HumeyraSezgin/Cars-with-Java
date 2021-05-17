/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje;

/**
 *
 * @author hmyra
 */
public class Truck extends Vehicle{
    private int yukKapasitesi;
    
    public Truck(){
        super();
        yukKapasitesi = 0;
    }
    
    public Truck(String nPlaka, String nModel, String nMarka, int nYukKapasitesi){
        super(nPlaka, nModel, nMarka);
        yukKapasitesi = nYukKapasitesi;
    }
    
    public String toString(){
        return super.toString() + " " + getYukKapasitesi();
    }

    /**
     * @return the yukKapasitesi
     */
    public int getYukKapasitesi() {
        return yukKapasitesi;
    }

    /**
     * @param yukKapasitesi the yukKapasitesi to set
     */
    public void setYukKapasitesi(int yukKapasitesi) {
        this.yukKapasitesi = yukKapasitesi;
    }
    
    
}

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
public class Car extends Vehicle{
    private int kapiSay;
    
    public Car(){
        super();
        kapiSay = 0;
    }
    
    public Car(String thePlaka, String theModel, String theMarka, int theKapiSay){
        super(thePlaka, theModel, theMarka);
        kapiSay = theKapiSay;
    }
    
    public String toString(){
        return super.toString() + " " + getKapiSay() ;
    }

    /**
     * @return the kapiSay
     */
    public int getKapiSay() {
        return kapiSay;
    }

    /**
     * @param kapiSay the kapiSay to set
     */
    public void setKapiSay(int kapiSay) {
        this.kapiSay = kapiSay;
    }
    
    
}

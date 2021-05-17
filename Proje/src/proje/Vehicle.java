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
public class Vehicle implements Comparable {

    private String plaka;
    private String model;
    private String marka;
    
    public Vehicle(){
        plaka = null;
        model = null;
        marka = null;
    }
    
    public Vehicle(String newPlaka, String newModel, String newMarka){
        plaka = newPlaka;
        model = newModel;
        marka = newMarka;
    }
    
    public String toString(){
        return getPlaka() + " " + getModel() + " " + getMarka() ;
    }
    
    public int compareTo(Object other){//plaka koduna göre verileri sıralıyor.
        Vehicle otherVehicle = (Vehicle) other;
        return getPlaka().compareTo(otherVehicle.getPlaka());
    }

    /**
     * @return the plaka
     */
    public String getPlaka() {
        return plaka;
    }

    /**
     * @param plaka the plaka to set
     */
    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the marka
     */
    public String getMarka() {
        return marka;
    }

    /**
     * @param marka the marka to set
     */
    public void setMarka(String marka) {
        this.marka = marka;
    }
    
    
}

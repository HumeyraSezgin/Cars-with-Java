
package proje;

import java.io.BufferedReader;
import java.io.File;
import java.util.Scanner; 
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import java.io.FileReader;
import java.io.IOException;

public class Proje {
    
   

    public static void main(String[] args) throws IOException {
        Vehicle [] vehicleList = new Vehicle[100];
        File veriler = new File("veriler.txt");
        BufferedReader b = new BufferedReader(new FileReader(veriler));
        String readLine = "";
        String aracTipi = null;
        int index = 0;
        while ((readLine = b.readLine()) != null) {
            
            String parts [] = readLine.split(" ");//her elemanın verilerinin arasında bir boşluk olduğu için split ile eleman verilerini ayırdım.
            
            if(parts[0].equals("car")){
                Car car = new Car();
                car.setPlaka(parts[1]);
                car.setModel(parts[2]);
                car.setMarka(parts[3]);
                car.setKapiSay(Integer.parseInt(parts[4]));//üstteki değerler String iken bu satırdaki string int tipinde bu yüzden veri alımı için parseInt kullandım.
                vehicleList[index] = car;               
            }else if(parts[0].equals("truck")){
                Truck truck = new Truck();
                truck.setPlaka(parts[1]);
                truck.setModel(parts[2]);
                truck.setMarka(parts[3]);
                truck.setYukKapasitesi(Integer.parseInt(parts[4]));
                vehicleList[index] = truck;
            } 
            index++;
        }
        
                 
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        
        
        for (int i=0; i<index; i++){

            if(vehicleList[i] instanceof Car){//nesne car mı diye kontrol etmemizi sağlıyor.
            Car car = (Car)vehicleList[i];    
            
            if (car.getKapiSay() == 2){
                aracTipi = ("Spor Araba");
            }
            else if (car.getKapiSay() == 5){
                aracTipi = ("SWagon araba"); 
            }
            else if (car.getKapiSay() == 4){
                aracTipi = ("standart araba" );
            }
                            
            }
            System.out.println(aracTipi);
        }
        System.out.println("Dizi yazdırılıyor:");
        
        for (int i=0; i<index; i++){
            System.out.println(vehicleList[i] + " ");
            doubleLinkedList.add(vehicleList[i]);
        }
        
        System.out.println("İşlem yapılmamış ikili bağlı liste yazdırılıyor:");
        doubleLinkedList.displayForward();
        
        
  
        File f = new File("islemler.txt");
        b = new BufferedReader(new FileReader(f));
        readLine = "";
        

        while ((readLine = b.readLine()) != null) {
            String parts [] = readLine.split(" ");
            if (parts[0].equals("ekle")){
                if(parts[1].equals("car")){//car nesnesi oluşturup bağlı listeye ekliyor.
                    Car car = new Car();
                    car.setPlaka(parts[2]);
                    car.setModel(parts[3]);
                    car.setMarka(parts[4]);
                    car.setKapiSay(Integer.parseInt(parts[5]));
                    doubleLinkedList.add(car);

                }else if(parts[1].equals("truck")){//truck nesnesi oluşturup bağlı listeye ekliyor.
                    Truck truck = new Truck();
                    truck.setPlaka(parts[2]);
                    truck.setModel(parts[3]);
                    truck.setMarka(parts[4]);
                    truck.setYukKapasitesi(Integer.parseInt(parts[5]));
                    doubleLinkedList.add(truck);

                }
            }
            if (parts[0].equals("sil")){
                doubleLinkedList.delete(parts[1]);
            }
        }
        System.out.println("İşlem yapılmış liste baştan yazdırılıyor:");
        doubleLinkedList.displayForward();
        System.out.println("İşlem yapılmış liste sondan yazdırılıyor:");
        doubleLinkedList.displayBackward();
       
       
    }  
}

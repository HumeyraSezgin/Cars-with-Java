
package proje;

public class DoubleLinkedList {
    private class Node{
        Node next;
        Node previous;
        Vehicle item;
        
        public Node(){
            next=null;
            previous=null;
            item=null;
        }
        
        public Node(Node newNext, Node newPrevious, Vehicle newItem){
            next = newNext;
            previous = newPrevious;
            item = newItem;
        }
    }
    
    Node head;
    Node tail;
    
    
    public DoubleLinkedList(){
        head = null;
        tail = null;
        
    }
    
    public DoubleLinkedList(Node nHead, Node nTail){
        head = nHead;
        tail = nTail;
    } 
    Node temp = null;
    
    public void displayForward(){//diziyi baştan yazdırma.
        if (head == null){//eğer başlangıç değeri yoksa hata vermemesi için yazıldı.
            return;
        }
        temp = head;
        while (temp != null){
            System.out.println(temp.item);
            temp = temp.next;
        }
    }
    
   
    public void displayBackward(){//diziyi sondan yazdırma.
        if (tail == null){//eğer kuyruk değeri yoksa hata vermemesi için yazıldı.
            return;
        }
        temp = tail;
        while (temp != null){
            System.out.println(temp.item);
            temp = temp.previous;
        }
    }
    
    public void add(Vehicle newItem){   
        Node newNode = new Node();
        newNode.item = newItem;
        
        if (tail == null && head == null) {//düğüm yoksa baş ve son aynı nodu gösterir.
            head = newNode;
            tail = newNode;
        }
        else if(newItem.compareTo(head.item) < 0){//eğer plaka baştaki nesnenin plakasından küçükse yeni başlangıç düğümü oluşturma.
            head.previous = newNode;
            newNode.next = head;
            newNode.previous = null;
            head = newNode;
        }
        else if(newItem.compareTo(tail.item) > 0){//eğer plaka sondaki nesnenin plakasından büyükse yeni son düğüm oluşturma.
            tail.next = newNode;
            newNode.previous = tail;
            newNode.next = null;
            tail = newNode;
        }
        else if (head != null){//eğer plaka değeri ortada bir değere sahipse
            temp = head;
            while (temp.next != null && newItem.compareTo(temp.item) > 0){
                temp = temp.next; //dizide ilerlemeyi sağlıyor.
            }
            newNode.previous = temp.previous;
            newNode.next = temp;
            temp.previous.next = newNode;
            temp.previous = newNode;
         }
       }
    
    
    
        public void delete(String dPlaka){
        if (head == null && tail == null){//düğüm boşsa silinecek nesne de yoktur.
            return;
        }
        if (dPlaka.compareTo(head.item.getPlaka()) == 0){//eğer baştaki nesne silinmek isteniyorsa
            head = head.next;
            head.previous = null;
        }
        else if (dPlaka.compareTo(tail.item.getPlaka()) == 0){//eğer sondaki nesne silinmek isteniyorsa
            tail= tail.previous;
            tail.next =null;
        }
        else if (head != null){//silinecek plaka düğümün ortasındaysa
            temp = head;
            while (temp.next != null){
                if(temp.item.getPlaka().equals(dPlaka)){//eğer plaka silinmek istenen plakaya eşit olursa bağları ayarlamak için yapılması gerekenler
                    temp.previous.next = temp.next;
                    temp.next.previous = temp.previous;
                }
                    temp = temp.next;
            }
         }
        
    }
}
    
    


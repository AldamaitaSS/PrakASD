import java.util.ArrayList;
import org.w3c.dom.Node;

public class HashTableTugas {
    
    private int size = 7;
    private Node[] dataMap;

    class Node {
        String key;
        Mahasiswa value;
        Node next;
        
        Node(String key, Mahasiswa value) {
            this.key = key;
            this.value = value;
        }
    }

    public HashTableTugas() {
        this.dataMap = new Node[this.size];
    }  

    public void printTable() {
        for (int i = 0; i < this.dataMap.length; i++) {
            System.out.println(i + ":");
            Node current = this.dataMap[i];
            while (current != null) {
                System.out.println("Key             : " + current.key + ", Value : " + current.value);
                System.out.println("NIM             : " + current.value.nim);
                System.out.println("Nama Lengkap    : " + current.value.namaLengkap);
                System.out.println("Jurusan         : " + current.value.jurusan);
                System.out.println("Program Studi   : " + current.value.programStudi);
                current = current.next;
                
            }
        }
    }

    public int hash(String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = (hash + key.charAt(i) * i) % this.dataMap.length;
        }
        return hash;
    }

    // Tambahkan method set() yang digunakan untuk menambakan data pada hash table.
    public void set(Mahasiswa mhs) {
        String key = mhs.getNim();
        int hash = this.hash(key);
        Node newNode = new Node(key, mhs);
        if (this.dataMap[hash] == null) {
            this.dataMap[hash] = newNode;
        } else {
            Node current = this.dataMap[hash];
            if(current.key.equals(key)) {
                current.value = mhs;
                return;
            }
            while (current.next != null) {
                current = current.next;
                if(current.key.equals(key)) {
                    current.value = mhs;
                    return;
                }
            }
            current.next = newNode;
        }
    }
    
    // Tambahkan method get() untuk mendapatkan data berdasarkan key pada hash table.
    public Mahasiswa get(String key) {
        int hash = this.hash(key);
        Node current = this.dataMap[hash];
        while (current != null) {
            if (current.key.equals(key)) return current.value;
            current = current.next;
        }
        return null;
    }

    // Tambahkan method keys() pada hash table untuk mendapatkan semua key pada struktur data hash table. Method ini akan menggunakan ArrayList untuk menyimpan key. 
    public ArrayList<String> getNIM() {
        ArrayList<String> nim = new ArrayList<>();
        for (int i = 0; i < this.dataMap.length; i++) {
            Node current = this.dataMap[i];
            while (current != null) {
                nim.add(current.key);
                current = current.next;
            }
        }
        return nim;
    }

    public boolean remove(String key) {
        int hash = this.hash(key);
        Node current = this.dataMap[hash];
        Node previous = null;
        
        while (current != null && !current.key.equals(key)) {
            previous = current;
            current = current.next;
        }    
        if (current != null) {
            if (previous == null) {
                this.dataMap[hash] = current.next;
            } else {
                previous.next = current.next;
            }
            return true;
        }
        return false;
    }
}



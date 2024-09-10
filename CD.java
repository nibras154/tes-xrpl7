package Persewaan;

import java.util.Scanner;

//subclass
public class CD extends Product {
    
    private String artist;
    private int totalSong;
    private String label;

    public CD() {
        number = 10;
        name = "Selamat Siang";
        quantity = 0;
        price = 0.0;
        artist = "Budi";
        totalSong = 2;
        label = "Sony Music";
    }
    public void print() {
        System.out.println("Number "+ number);
        System.out.println("Name "+ name);
        System.out.println("quantity "+ quantity);
        System.out.println("Harga "+ price);
        System.out.println("Artist "+ artist);
        System.out.println("Jumlah Lagu "+ totalSong);
        System.out.println("Label "+ label);
    }
    
    }
    


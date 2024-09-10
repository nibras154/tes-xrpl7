package Persewaan;
//superclass
public class DVD extends Product {
    private int lenght;
    private String rating;
    private String studio;

    public DVD () {
        number = 0;
        name = "DVD Sampai Tua";
        quantity = 50;
        price = 10000;
        lenght = 100;
        rating = "NC-18";
        studio = "Ibra Studio";

    }
    public void print() {
        System.out.println("Number "+ number);
        System.out.println("Name "+ name);
        System.out.println("quantity "+ quantity);
        System.out.println("Harga "+ price);
        System.out.println("Artist "+ lenght);
        System.out.println("Jumlah Lagu "+ rating);
        System.out.println("Label "+ studio);
    }

    }

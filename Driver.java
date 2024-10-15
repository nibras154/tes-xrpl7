import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String pilihBeli;

        Instruments instruments = new Instruments();

        System.out.println("Masukkan jenis instrumen(Piano/Gitar)");
        pilihBeli=s.nextLine();
        System.out.println("Masukkan nama produk: ");
        String name=s.nextLine();
        instruments.name=name;
        System.out.println("Masukkan jumlah "+instruments.name);
        int jumlahBeli = s.nextInt();
        System.out.println("Masukkan harga "+instruments.name);
        double price=s.nextDouble();
        instruments.price=price;
        double totalPrice = instruments.price*jumlahBeli;
        System.out.println("Apakah ada diskon?(Y/N)");
        String discYN = s.next();
        double discperc=0;
        if(discYN.equalsIgnoreCase("Y")) {
            System.out.println("Berapa jumlah diskon?");
            discperc=s.nextInt();
        } 

        if (pilihBeli.equalsIgnoreCase("Gitar")) {
            System.out.println("Berapa Banyak Senar?");
            int numStrings =s.nextInt();
            System.out.println("Listrik atau tidak?");
            String listrikStatus = s.next();
            boolean isElectric=false;
            if(listrikStatus.equalsIgnoreCase("listrik")) {
                isElectric=true;
            } else if(listrikStatus.equalsIgnoreCase("tidak")) {
                isElectric=false;
            }
            guitar guitar = new guitar(name, price, numStrings, isElectric);
            System.out.println("\n==Gitar==");
            guitar.print();
            System.out.println("Total harga: "+totalPrice);
            System.out.println("Total Diskon: "+discperc+"%");
            double totaldisc = discperc/100*totalPrice;
            double finalPrice = totalPrice-totaldisc;
            System.out.println("Harga setelah diskon: "+finalPrice);
        } else if(pilihBeli.equalsIgnoreCase("Piano")){
            System.out.println("Masukkan Jenis Piano");
            String pianoType=s.next();
            piano piano  = new piano(name, price, pianoType);
            System.out.println("\n==Piano==");
            piano.print();
            System.out.println("Total harga: "+totalPrice);
            System.out.println("Total Diskon: "+discperc+"%");
            double totaldisc = discperc/100*totalPrice;
            double finalPrice = totalPrice-totaldisc;
            System.out.println("Harga setelah diskon: Rp."+finalPrice+",-");
        } else {
            System.out.println("Input Salah");
        }
        s.close();
    }
}
import java.util.Scanner;

public class Tambah {
     static void jumlah(int a, int b) {
        int hasil = (a+b);
        System.out.println(hasil);
    }

    static void kurang(int a, int b) {
        int hasil = (a-b);
        System.out.println(hasil);
    }

    static void kali(int a, int b) {
        int hasil = (a*b);
        System.out.println(hasil);
    }

    static void bagi(int a, int b) {
        int hasil = (a/b);
        System.out.println(hasil);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("masukkan nilai a");
        int a = s.nextInt();
        System.out.println("masukkan nilai b");
        int b = s.nextInt();

        System.out.println("Perjumlahan "+a+"+"+b);
        jumlah(a, b);
        System.out.println("Pengurangan "+a+"-"+b);
        kurang(a, b);
        System.out.println("Perkalian "+a+"x"+b);
        kali(a, b);
        System.out.println("Pembagian "+a+"%"+b);
        bagi(a, b);
    }
}


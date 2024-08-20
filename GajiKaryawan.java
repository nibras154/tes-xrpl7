import java.util.Scanner;

public class GajiKaryawan {

    public static void main(String[] args) {

        double jamKerja, gaji, tarifPerjam, pajak;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukan jamKerja: ");
        jamKerja = input.nextDouble();
        System.out.println("Masukan tarif perjam: ");
        tarifPerjam = input.nextDouble();
        System.out.println("Masukan pajak: ");
        pajak = input.nextDouble();
        

        gaji=jamKerja*tarifPerjam;
        pajak=pajak/100*gaji;
        gaji=gaji-pajak;

        System.out.println("gaji "+gaji);
    }
}
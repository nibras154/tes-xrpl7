//Driver CLass
import java.util.Scanner;

public class SiswaTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inputkan Nama Siswa:");
        String nama = input.nextLine();
        System.out.println("Inputkan ID Siswa:");
        int id = input.nextInt();
        System.out.println("Inputkan IPK:");
        double ipk = input.nextDouble();

        Siswa burhan = new Siswa(id, nama, ipk);
        burhan.print();
        //object
        //Class object = new Constructor
        Siswa ibra = new Siswa();
        Siswa rehan = new Siswa();
        Siswa rafly = new Siswa();
        Siswa gilam = new Siswa();
        Siswa reva = new Siswa();
        Siswa naufal = new Siswa(28,"nopal",100);

        ibra.id = 29;
        ibra.nama = "Nibras";
        ibra.ipk = 100;
        rehan.id = 11;
        rehan.nama = "raihan";
        rehan.ipk = 100;
        rafly.id = 27;
        rafly.nama = "rafli";
        rafly.ipk = 100;
        gilam.id = 19;
        gilam.nama = "m.gilam";
        gilam.ipk = 100;
        reva.id = 9;
        reva.nama = "esya";
        reva.ipk = 100;


        System.out.println("Nama : "+ ibra.nama);
        System.out.println("Absen : "+ ibra.id);
        System.out.println("Nilai : "+ ibra.ipk);
        System.out.println("Nama : "+ rehan.nama);
        System.out.println("Absen : "+ rehan.id);
        System.out.println("Nilai : "+ rehan.ipk);
        System.out.println("Nama : "+ rafly.nama);
        System.out.println("Absen : "+ rafly.id);
        System.out.println("Nilai : "+ rafly.ipk);
        System.out.println("Nama : "+ gilam.nama);
        System.out.println("Absen : "+ gilam.id);
        System.out.println("Nilai : "+ gilam.ipk);
        System.out.println("Nama : "+ reva.nama);
        System.out.println("Absen : "+ reva.id);
        System.out.println("Nilai : "+ reva.ipk);

        ibra.print();
        rehan.print();
        rafly.print();
        gilam.print();
        reva.print();
        naufal.print();
        
        input.close();
    }
}
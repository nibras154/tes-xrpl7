import java.util.Scanner;

public class KaryawanTester {
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
    Karyawan ibra = new Karyawan(29,"Nibras","TU","Lamongan");
    Karyawan melvin = new Karyawan(21,"Mulvun","Mulung", "Malang");
    Karyawan bima = new Karyawan(2,"Arbim","Kesiswaan","Banyuwangi");
    Karyawan moreno = new Karyawan(24,"More","Kurikulum","Bogor");
    Karyawan ryu = new Karyawan(30,"Riu","Kesiswaan","Lamongan");

    ibra.print();
    System.out.println();
    melvin.print();
    System.out.println();
    bima.print();
    System.out.println();
    moreno.print();
    System.out.println();
    ryu.print();
    System.out.println();
  }
    
}
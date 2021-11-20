import java.util.Scanner;

public class TugasBiodata {
    public static void main(String[] args) {


        Scanner Input = new Scanner(System.in);
//Data User1
        System.out.print("Masukkan nama user1 :");
        String nama1 = Input.nextLine();
        System.out.print("Masukkan umur user1 :");
        Integer umur1 = Input.nextInt();
        Input.nextLine();
        System.out.print("Masukkan jenis kelamin user1 :");
        String jkelamin1 = Input.nextLine();
//Data User2

        System.out.print("Masukkan nama user2 :");
        String nama2 = Input.nextLine();
        System.out.print("Masukkan umur user2 :");
        Integer umur2 = Input.nextInt();
        Input.nextLine();
        System.out.print("Masukkan jenis kelamin user2 :");
        String jkelamin2 = Input.nextLine();
//Data User3

        System.out.print("Masukkan nama user3 :");
        String nama3 = Input.nextLine();
        System.out.print("Masukkan umur user3 :");
        Integer umur3 = Input.nextInt();
        Input.nextLine();
        System.out.print("Masukkan jenis kelamin user3 :");
        String jkelamin3 =Input.nextLine();
//Tabel Hasil

        System.out.println("Data yang tersimpan");
        System.out.println("-------------------------------------");
        System.out.printf("%-10s %-10s %-10s \n", "|Nama", "|Umur", "|Jenis Kelamin|");
        System.out.println("-------------------------------------");
        System.out.printf("%-10s %-10s %-10s %4s\n", "|" + nama1, "|" + umur1, "|" + jkelamin1, "|");
        System.out.printf("%-10s %-10s %-10s %4s\n", "|" + nama2, "|" + umur2, "|" + jkelamin2, "|");
        System.out.printf("%-10s %-10s %-10s %4s\n", "|" + nama3, "|" + umur3, "|" + jkelamin3, "|");
        System.out.println("-------------------------------------");

    }
}

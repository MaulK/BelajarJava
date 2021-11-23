import java.util.Scanner;
/**
 * Tugas Array Pemrograman Dasar
 * Nama : Maulana Khoirusyifa'
 * NIM : 215150200111014
 */
public class tugasArrayPenjumlahanMatrix {
    public static void main(String[] args) {
        int i, j;
        int[][] matriks1 = new int[10][10];
        int[][] matriks2 = new int[10][10];
        int[][] hasil = new int[10][10];
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris matriks: ");
        int baris = input.nextInt();
        System.out.print("Masukkan jumlah kolom matriks: ");
        int kolom = input.nextInt();
        System.out.println("Masukkan elemen matriks pertama: ");
        for (i = 0; i < baris; i++) {
            for (j = 0; j < kolom; j++) {
                matriks1[i][j] = input.nextInt();
            }
        }
        System.out.println("Masukkan elemen matriks kedua: ");
        for (i = 0; i < baris; i++) {
            for (j = 0; j < kolom; j++) {
                matriks2[i][j] = input.nextInt();
            }
        }
        System.out.println("Hasil penjumlahan matriks: ");
        for (i = 0; i < baris; i++) {
            for (j = 0; j < kolom; j++) {
                hasil[i][j] = matriks1[i][j] + matriks2[i][j];
                System.out.print(hasil[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

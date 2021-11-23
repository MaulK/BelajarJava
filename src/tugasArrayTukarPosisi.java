import java.util.Arrays;
import java.util.Scanner;
/**
 * Tugas Array Pemrograman Dasar
 * Nama : Maulana Khoirusyifa'
 * NIM : 215150200111014
 */
public class tugasArrayTukarPosisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[]{1,2,3,4,5};
        System.out.println("Sebelum :" + Arrays.toString(array));
        array[2] = input.nextInt();
        array[4] = input.nextInt();
        System.out.println("Sesudah :" + Arrays.toString(array));
    }
}

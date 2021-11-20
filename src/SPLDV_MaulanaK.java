import java.text.DecimalFormat;//Digunakan untuk memanggil class DecimalFormat pada java class ini.
import java.util.Scanner;//Digunakan untuk memanggil class Scanner pada java class ini.

/** UTP PEMDAS TIF-B "Sistem Persamaan Linear Dua Variabel"
 * NAMA : Maulana Khoirusyifa'
 * NIM : 215150200111014
 * KELAS : TIF B
 *
 */
public class SPLDV_MaulanaK {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);// Pada Baris ini digunakan untuk membuat Class Scanner Baru.

        DecimalFormat df = new DecimalFormat("0.00");
        // Pada baris ini digunakan untuk membuat class DecimalFormat baru agar membatasi sebuah nilai desimal yang
        // terlalu panjang.

        double[][] spldv1 = new double[2][3];
        /* Pada baris tersebut digunakan untuk mendeklarasikan sebuah array multidimensi dengan panjang baris 2 dan
         panjang kolom 3.*/

        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                spldv1[i][j]= input.nextDouble();
            }
            /*
            Pada bagian ini digunakan untuk mendeklarasikan isi/element array dengan class Scanner agar pengguna dapat
            mengisi/menginput element array sesuai keinginan.
             */
        }

        // Penggunaan if else dalam menentukan apakah terdapat jawabannya atau tidak.
        if (spldv1[0][0]*spldv1[1][1] - spldv1[0][1]*spldv1[1][0] ==0)
            /*
            Pernyataan ini mengumpamakan kondisi  dimana ketika rumus tersebut tidak memiliki sebuah nilai jawaban
            yang pasti sehingga akan mengeluarkan output "Tidak ada solusi".
             */
            System.out.println("Tidak ada solusi");
        else {
            double x = (spldv1[0][2]*spldv1[1][1] - spldv1[0][1]*spldv1[1][2])/(spldv1[0][0]*spldv1[1][1] - spldv1[0][1]*spldv1[1][0]);
            double y = (spldv1[0][0]*spldv1[1][2] - spldv1[0][2]*spldv1[1][0])/(spldv1[0][0]*spldv1[1][1] - spldv1[0][1]*spldv1[1][0]);
            System.out.println(df.format(x) + " " + df.format(y));//df.format membatasi sebuah variabel tertentu berdasarkan DecimalFormal yang kita set
            /*
            Pernyataan ini mengumpamakan kondisi dimana rumus memiliki sebuah nilai jawaban yang pasti sehingga akan
            mengeluarkan output hasil yang sesuai dengan rumus.
             */
        }

    }
}

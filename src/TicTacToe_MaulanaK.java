import java.util.Scanner;//Digunakan untuk memanggil class Scanner pada java class ini.

/** UTP PEMDAS TIF-B "Juri Tic Tac Toe"
 * NAMA : Maulana Khoirusyifa'
 * NIM : 215150200111014
 * KELAS : TIF B
 *
 */
public class TicTacToe_MaulanaK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// Pada Baris ini digunakan untuk membuat Class Scanner Baru.
//**************************************************
        String A = input.nextLine();/* Pada baris ini digunakan untuk menginput variabel A dengan menggunakan
        Class Scanner.*/

        String A1 = A.substring(0, 1);
        /*Pada Baris ini digunakan untuk mendeklarasikan variabel A1 yang merupakan substring dari Variabel A dengan
         posisi karakter antara 0 sampai 1.
         */
        String A2 = A.substring(2, 3);
        /*Pada Baris ini digunakan untuk mendeklarasikan variabel A2 yang merupakan substring dari Variabel A dengan
         posisi karakter antara 2 sampai 3.
         */
        String A3 = A.substring(4, 5);
        /*Pada Baris ini digunakan untuk mendeklarasikan variabel A3 yang merupakan substring dari Variabel A dengan
         posisi karakter antara 4 sampai 5.
         */
//**************************************************
        String B = input.nextLine();/* Pada baris ini digunakan untuk menginput variabel B dengan menggunakan
        Class Scanner.*/

        String B1 = B.substring(0, 1);
        /*Pada Baris ini digunakan untuk mendeklarasikan variabel B1 yang merupakan substring dari Variabel B dengan
         posisi karakter antara 0 sampai 1.
         */
        String B2 = B.substring(2, 3);
        /*Pada Baris ini digunakan untuk mendeklarasikan variabel B2 yang merupakan substring dari Variabel B dengan
        posisi karakter antara 2 sampai 3.
         */
        String B3 = B.substring(4, 5);
        /*Pada Baris ini digunakan untuk mendeklarasikan variabel B3 yang merupakan substring dari Variabel B dengan
        posisi karakter antara 4 sampai 5.
         */
//**************************************************
        String C = input.nextLine();/* Pada baris ini digunakan untuk menginput variabel C dengan menggunakan
        Class Scanner.*/

        String C1 = C.substring(0, 1);
        /*Pada Baris ini digunakan untuk mendeklarasikan variabel C1 yang merupakan substring dari Variabel C dengan
         posisi karakter antara 0 sampai 1.
         */
        String C2 = C.substring(2, 3);
        /*Pada Baris ini digunakan untuk mendeklarasikan variabel C2 yang merupakan substring dari Variabel C dengan
         posisi karakter antara 2 sampai 3.
         */
        String C3 = C.substring(4, 5);
        /*Pada Baris ini digunakan untuk mendeklarasikan variabel C3 yang merupakan substring dari Variabel C dengan
         posisi karakter antara 4 sampai 5.
         */
//**************************************************
        //Penggunaan if,else if, dan else untuk menentukan O sebagai pemenang
        if (A1.equals("O") && A2.equals("O") && A3.equals("O")) {
            /* Baris ini mengumpamakan kondisi dimana A1,A2,A3 diisi O. Sesuai dengan aturan permainan tic tac toe
             sehingga akan menghasilkan output "O menang"
             */
            System.out.println("O menang");
        } else if (B1.equals("O") && B2.equals("O") && B3.equals("O")) {
             /* Baris ini mengumpamakan kondisi dimana B1,B2,B3 diisi O. Sesuai dengan aturan permainan tic tac toe
             sehingga akan menghasilkan output "O menang"
             */
            System.out.println("O menang");
        } else if (C1.equals("O") && C2.equals("O") && C3.equals("O")) {
            /* Baris ini mengumpamakan kondisi dimana C1,C2,C3 diisi O. Sesuai dengan aturan permainan tic tac toe
             sehingga akan menghasilkan output "O menang"
             */
            System.out.println("O menang");
        } else if (A1.equals("O") && B1.equals("O") && C1.equals("O")) {
            /* Baris ini mengumpamakan kondisi dimana A1,B1,C1 diisi O. Sesuai dengan aturan permainan tic tac toe
             sehingga akan menghasilkan output "O menang"
             */
            System.out.println("O menang");
        } else if (A2.equals("O") && B2.equals("O") && C2.equals("O")) {
            /* Baris ini mengumpamakan kondisi dimana A2,B2,C2 diisi O. Sesuai dengan aturan permainan tic tac toe
             sehingga akan menghasilkan output "O menang"
             */
            System.out.println("O menang");
        } else if (A3.equals("O") && B3.equals("O") && C3.equals("O")) {
            /* Baris ini mengumpamakan kondisi dimana A3,B3,C3 diisi O. Sesuai dengan aturan permainan tic tac toe
             sehingga akan menghasilkan output "O menang"
             */
            System.out.println("O menang");
        } else if (A3.equals("O") && B2.equals("O") && C1.equals("O")) {
            /* Baris ini mengumpamakan kondisi dimana A3,B2,C1 diisi O. Sesuai dengan aturan permainan tic tac toe
             sehingga akan menghasilkan output "O menang"
             */
            System.out.println("O menang");
        } else if (A1.equals("O") && B2.equals("O") && C3.equals("O")) {
            /* Baris ini mengumpamakan kondisi dimana A1,B2,C3 diisi O. Sesuai dengan aturan permainan tic tac toe
             sehingga akan menghasilkan output "O menang"
             */
            System.out.println("O menang");

            //Penggunaan if,else if, dan else untuk menentukan X sebagai pemenang
        } else if (A1.equals("X") && A2.equals("X") && A3.equals("X")) {
            /* Baris ini mengumpamakan kondisi dimana A1,A2,A3 diisi X. Sesuai dengan aturan permainan tic tac toe
             sehingga akan menghasilkan output "X menang"
             */
            System.out.println("X menang");
        } else if (B1.equals("X") && B2.equals("X") && B3.equals("X")) {
            /* Baris ini mengumpamakan kondisi dimana B1,B2,B3 diisi X. Sesuai dengan aturan permainan tic tac toe
             sehingga akan menghasilkan output "X menang"
             */
            System.out.println("X menang");
        } else if (C1.equals("X") && C2.equals("X") && C3.equals("X")) {
            /* Baris ini mengumpamakan kondisi dimana C1,C2,C3 diisi X. Sesuai dengan aturan permainan tic tac toe
             sehingga akan menghasilkan output "X menang"
             */
            System.out.println("X menang");
        } else if (A1.equals("X") && B1.equals("X") && C1.equals("X")) {
            /* Baris ini mengumpamakan kondisi dimana A1,B1,C1 diisi X. Sesuai dengan aturan permainan tic tac toe
             sehingga akan menghasilkan output "X menang"
             */
            System.out.println("X menang");
        } else if (A2.equals("X") && B2.equals("X") && C2.equals("X")) {
            /* Baris ini mengumpamakan kondisi dimana A2,B2,C2 diisi X. Sesuai dengan aturan permainan tic tac toe
             sehingga akan menghasilkan output "X menang"
             */
            System.out.println("X menang");
        } else if (A3.equals("X") && B3.equals("X") && C3.equals("X")) {
            /* Baris ini mengumpamakan kondisi dimana A3,B3,C3 diisi X. Sesuai dengan aturan permainan tic tac toe
             sehingga akan menghasilkan output "X menang"
             */
            System.out.println("X menang");
        } else if (A3.equals("X") && B2.equals("X") && C1.equals("X")) {
            /* Baris ini mengumpamakan kondisi dimana A3,B2,C1 diisi X. Sesuai dengan aturan permainan tic tac toe
             sehingga akan menghasilkan output "X menang"
             */
            System.out.println("X menang");

        } else if (A1.equals("X") && B2.equals("X") && C3.equals("X")){
            /* Baris ini mengumpamakan kondisi dimana A1,B2,C3 diisi X. Sesuai dengan aturan permainan tic tac toe
             sehingga akan menghasilkan output "X menang"
             */
            System.out.println("X menang");
        } else{
            /* Baris ini mengumpamakan kondisi dimana semuanya terisi dengan imbang sehingga akan menampilkan
             output "Draw"
             */
            System.out.println("Draw");
        }
    }

}
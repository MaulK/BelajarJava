import java.util.Scanner;

public class TugasSeleksi1 {
    public static void main(String[] args) {
        String namaMahasiswa, namaMahasiswa1, namaMahasiswa2;
        String npm, npm1, npm2;
        String nilai, nilai1, nilai2;
        float ipk, ipk1, ipk2;

        Scanner input = new Scanner(System.in);


        System.out.println("Masukkan nama mahasiswa :");
        namaMahasiswa = input.nextLine();
        System.out.println("Masukkan NPM mahasiswa :");
        npm = input.nextLine();
        System.out.println("Masukkan IPK mahasiswa :");
        ipk = input.nextFloat();
        input.nextLine();
        System.out.println("Masukkan nama mahasiswa :");
        namaMahasiswa1 = input.nextLine();
        System.out.println("Masukkan NPM mahasiswa :");
        npm1 = input.nextLine();
        System.out.println("Masukkan IPK mahasiswa :");
        ipk1 = input.nextFloat();
        input.nextLine();
        System.out.println("Masukkan nama mahasiswa :");
        namaMahasiswa2 = input.nextLine();
        System.out.println("Masukkan NPM mahasiswa :");
        npm2 = input.nextLine();
        System.out.println("Masukkan IPK mahasiswa :");
        ipk2 = input.nextFloat();


        if(ipk >= 3.5){
            nilai = "Sangat Memuaskan";
        } else if(ipk >= 3.0){
            nilai = "Memuaskan";
        } else if(ipk >= 2.5){
            nilai = "Baik Sekali";
        } else if(ipk >= 2.0){
            nilai = "Baik";
        } else {
            nilai = "Kurang";
        }

        if(ipk1 >= 3.5){
            nilai1 = "Sangat Memuaskan";
        } else if(ipk >= 3.0){
            nilai1 = "Memuaskan";
        } else if(ipk >= 2.5){
            nilai1 = "Baik Sekali";
        } else if(ipk >= 2.0){
            nilai1 = "Baik";
        } else {
            nilai1 = "Kurang";
        }

        if(ipk2 >= 3.5){
            nilai2 = "Sangat Memuaskan";
        } else if(ipk >= 3.0){
            nilai2 = "Memuaskan";
        } else if(ipk >= 2.5){
            nilai2 = "Baik Sekali";
        } else if(ipk >= 2.0){
            nilai2 = "Baik";
        } else {
            nilai2 = "Kurang";
        }
        System.out.println("==================================================================");
        System.out.println("                         Data Mahasiswa                          ");
        System.out.println("==================================================================");
        System.out.printf("%-21s %-16s %-4s %-17s %4s\n", "|Nama Mahasiswa", "|NIM", "|IPK", "|Keterangan", "|");
        System.out.println("==================================================================");
        System.out.printf("%-21s %-16s %-4s %-17s %4s\n", "|" + namaMahasiswa, "|" + npm, "|" + ipk, "|" + nilai, "|");
        System.out.printf("%-21s %-16s %-4s %-17s %4s\n",  "|" + namaMahasiswa1, "|" + npm1, "|" + ipk1, "|" + nilai1, "|");
        System.out.printf("%-21s %-16s %-4s %-17s %4s\n", "|" + namaMahasiswa2, "|" + npm2, "|" + ipk2, "|" + nilai2, "|");
        System.out.println("==================================================================");


    }
}

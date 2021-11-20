import java.util.Scanner;

public class TugasSeleksi2 {
    public static void main(String[] args) {
        String namaMahasiswa, keterangan ,bobot;
        int nilaiAkhir, nilaiUAS, nilaiTugas, nilaiKuis;

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Nama Mahasiswa :");
        namaMahasiswa = input.nextLine();
        System.out.println("Masukkan Nilai Tugas :");
        nilaiTugas = input.nextInt();
        System.out.println("Masukkan Nilai Kuis :");
        nilaiKuis = input.nextInt();
        System.out.println("Masukkan Nilai UAS :");
        nilaiUAS = input.nextInt();

        //Percabangan 1
        if (nilaiKuis >= nilaiUAS){
            nilaiAkhir = (nilaiKuis * 40/100) + (nilaiUAS * 40/100) + (nilaiTugas * 20/100);
        } else{
            nilaiAkhir = (nilaiKuis * 30/100) + (nilaiUAS * 50/100) + (nilaiTugas * 20/100);
        }

        //Percabangan 2
        if (nilaiAkhir >= 85){
            keterangan = "Sangat Baik";
            bobot = "A";
        } else if (nilaiAkhir >= 75){
            keterangan = "Baik";
            bobot = "B";
        } else if (nilaiAkhir >= 65){
            keterangan = "Cukup";
            bobot = "C";
        } else if (nilaiAkhir >= 50){
            keterangan = "Kurang";
            bobot = "D";
        } else {
            keterangan = "Gagal";
            bobot = "E";
        }
        //Hasil Keluaran
        System.out.println("================================");
        System.out.println("Data Mahasiswa");
        System.out.println("================================");
        System.out.println("Nama\t\t:" + namaMahasiswa);
        System.out.println("Nilai Akhir\t:" + nilaiAkhir);
        System.out.println("Bobot\t\t:" + bobot);
        System.out.println("Keterangan\t:" + keterangan);
        System.out.println("================================");

    }
}

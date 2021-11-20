import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TugasKasus1 {
    public static void main(String[] args) {
        String namapembeli;
        int hargaTotal, hargaSatuan, uangKembali, uangPembeli, jumlahBarang;


        Scanner eco = new Scanner(System.in);
        LocalDateTime waktu = LocalDateTime.now();

        DateTimeFormatter waktuNow = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String realWaktu = waktu.format(waktuNow);


        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();


        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);


        System.out.println("=========================================================================");
        System.out.println("=                              FILKOM MART                              =");
        System.out.println("=========================================================================");

        System.out.println("Masukkan nama pembeli :");
        namapembeli = eco.nextLine();
        System.out.println("Masukkan uang yang diberi pembeli :");
        uangPembeli = eco.nextInt();
        System.out.println("Masukkan harga satuan barang :");
        hargaSatuan = eco.nextInt();
        System.out.println("Masukkan jumlah barang yang akan dibeli :");
        jumlahBarang = eco.nextInt();

        hargaTotal = jumlahBarang * hargaSatuan;
        uangKembali = uangPembeli - hargaTotal;


        System.out.println("=========================================================================");
        System.out.println("=                           STRUK  PEMBAYARAN                           =");
        System.out.println("=-----------------------------------------------------------------------=");
        System.out.println("=                          " + realWaktu + "                          =");
        System.out.println("=========================================================================");
        System.out.printf("%-17s %-23s %31s\n", "= Nama Pembeli  :", namapembeli, "=");
        System.out.printf("%-17s %-23s %31s\n", "= Uang Pembeli  :", kursIndonesia.format(uangPembeli), "=");
        System.out.printf("%-17s %-23s %31s\n", "= Harga Barang  :", kursIndonesia.format(hargaSatuan), "=");
        System.out.printf("%-17s %-11d %43s\n", "= Jumlah Barang :", jumlahBarang, "=");
        System.out.println("=========================================================================");
        System.out.printf("%47s %-16s %8s\n", "= Jadi total uang yang harus dibayarkan adalah ",kursIndonesia.format(hargaTotal), "=");
        System.out.printf("%54s %-16s %1s\n", "= Jadi total kembalian yang harus dikembalikan adalah ",kursIndonesia.format(uangKembali), "=");
        System.out.println("=========================================================================");

    }
}

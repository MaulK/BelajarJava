
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class StudiKasus3 {
    public static void main(String[] args) {
        final int hargaTiket = 50000;

        String nama, alamat, tglK, stasiunasal, stasiunTujuan, noKtp, noTelp;
        int jumlahTiket, totalPembayaran, uangPembeli, uangKembalian;

        Scanner kereta = new Scanner(System.in);

        Random rand = new Random(); //membuat nomor tiket
        int upperbound = 100;
        int nomorTiket = rand.nextInt(upperbound);
        LocalDateTime currentDate = LocalDateTime.now();//membuat tanggal tiket dicetak

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String currentDateStr = currentDate.format(dateFormatter);

        //format mata uang rupiah
        DecimalFormat kursIndo = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndo.setDecimalFormatSymbols(formatRp);

        //Tahap memasukkan data pembeli
        System.out.println("==================================================");
        System.out.println("                \uD83D\uDE82FILKOM RAIL EXPRESS\uD83D\uDE82               ");
        System.out.println("        PROGRAM PEMESANAN TIKET KERETA API        ");
        System.out.println("==================================================");
        System.out.println("Silahkan masukkan data berikut");
        System.out.print("Nama                       :");
        nama = kereta.nextLine();
        System.out.print("Nomor KTP                  :");
        noKtp = kereta.nextLine();
        System.out.print("Alamat                     :");
        alamat = kereta.nextLine();
        System.out.print("Nomor telepon              :");
        noTelp = kereta.nextLine();
        System.out.print("Tanggal keberangkatan      :");
        tglK = kereta.nextLine();
        System.out.print("Stasiun asal               :");
        stasiunasal = kereta.nextLine();
        System.out.print("Stasiun tujuan             :");
        stasiunTujuan = kereta.nextLine();
        System.out.print("Jumlah tiket               :");
        jumlahTiket = kereta.nextInt();
        System.out.print("Nominal pembayaran         :");
        uangPembeli = kereta.nextInt();
        System.out.println("==================================================");

        //Proses perhitungan total biaya
        totalPembayaran = hargaTiket * jumlahTiket;
        //Logika untuk mendeteksi kecukupan uang pembeli
        if (uangPembeli > totalPembayaran) {
            //Perhitungan kembalian
            uangKembalian = uangPembeli - totalPembayaran;

            System.out.println("   SELAMAT !! PEMESANAN TIKET TELAH BERHASIL!!!   ");

            //Hasil rekap pemesanan tiket
            System.out.println("==================================================");
            System.out.println("               DETAIL PESANAN TIKET               ");
            System.out.println("==================================================");
            System.out.println("No." + "A0920210000" + nomorTiket);
            System.out.println("Nama                       :" + nama);
            System.out.println("Nomor KTP                  :" + noKtp);
            System.out.println("Alamat                     :" + alamat);
            System.out.println("Nomor telepon              :" + noTelp);
            System.out.println("Tanggal keberangkatan      :" + tglK);
            System.out.println("Rute                       :" + stasiunasal + "-" + stasiunTujuan);
            System.out.println("Jumlah tiket               :" + jumlahTiket);
            System.out.println("--------------------------------------------------");
            System.out.println("Total Harga                :" + kursIndo.format(totalPembayaran));
            System.out.println("Nominal pembayaran         :" + kursIndo.format(uangPembeli));
            System.out.println("Kembalian                  :" + kursIndo.format(uangKembalian));
            System.out.println("--------------------------------------------------");
            System.out.println("Tiket ini dicetak pada " + currentDateStr);
            System.out.println("==================================================");
            System.out.println("Selamat menikmati perjalanan anda\uD83E\uDD70");

        } else {
            System.out.println("   MOHON MAAF UANG ANDA TIDAK MENCUKUPI UNTUK MELAKUKAN PEMESANAN TIKET!!!   ");
        }
    }
}
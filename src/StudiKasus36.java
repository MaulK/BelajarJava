import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/** Program FILKOM EXPRESS
 * Nama : Maulana Khoirusyifa
 * NIM : 215150200111014
 * Kelas : B
 */
public class StudiKasus36 {
    static int maxCounter = 5;
    static String[] tickets = new String[maxCounter];
    static int counter = 0;
    //sistem waktu
    static LocalDateTime currentDate = LocalDateTime.now();
    //sistem uang
    static DecimalFormat kursIndo = (DecimalFormat) DecimalFormat.getCurrencyInstance();



    public static void main(String[] args) {
        MenuUtama();
    }
    //Beberapa Method untuk Menu

    static void MenuUtama() {
        int pilihan;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("==================================================");
            System.out.println("                \uD83D\uDE86FILKOM RAIL EXPRESS\uD83D\uDE86               ");
            System.out.println("        PROGRAM PEMESANAN TIKET KERETA API        ");
            System.out.println("==================================================");
            System.out.println("Menu");
            System.out.println("1. Daftar");
            System.out.println("2. Jenis Tiket");
            System.out.println("3. Daftar Stasiun");
            System.out.println("4. Riwayat Pesanan");
            System.out.println("5. Cek Pesanan");
            System.out.println("6. Keluar");
            System.out.println("==================================================");

            System.out.print("Masukkan pilihan anda:");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1 -> Menu1();
                case 2 -> Menu2();
                case 3 -> Menu3();
                case 4 -> Menu4();
                case 5 -> Menu5();
                case 6 -> System.out.println("Terimakasih telah menggunakan jasa FILKOM EXPRESS");
                default -> System.out.println("Mohon maaf pilihan tersebut tidak tersedia");
            }
        } while (pilihan != 6);
    }

      public static void Menu1() {
        String nama, nomorKTP, nomorTelepon, alamat, tanggalKeberangkatan, stasiunAsal, stasiunTujuan, jenisTiket,kodeJTiket;
        String kodeNIK;
        String kodeSA = null;
        String kodeST = null;
        String kodeTiket = null;

        int jumlahTiket, totalHarga, kembalian;
        int nominalPembayaran;
        int diskon = 0;
        int jarak;
        int hargaTiket = 0;


        Scanner input = new Scanner(System.in);
        //Sistem waktu

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String currentDateStr = currentDate.format(dateFormatter);

        //format mata uang Rupiah Indonesia
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol("Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');

        kursIndo.setDecimalFormatSymbols(formatRp);

        System.out.println("--------------------------------------------------");
        System.out.println("Silahkan masukkan data diri");
        System.out.println("--------------------------------------------------");
        System.out.print("Nama\t\t\t:");
        nama = input.nextLine();
        System.out.print("Nomor KTP\t\t:");
        nomorKTP = input.nextLine();
        System.out.print("Alamat\t\t\t:");
        alamat = input.nextLine();
        System.out.print("Nomor Telepon\t:");
        nomorTelepon = input.nextLine();

        System.out.println("--------------------------------------------------");
        System.out.println("Silahkan masukkan data tiket");
        System.out.println("--------------------------------------------------");

        System.out.println("List Stasiun yang Tersedia:");
        System.out.printf("%-16s %-15s %-9s\n ", " 1. Malang", "4. Semarang", "7. Serang");
        System.out.printf("%-15s %-16s\n ", "2. Surabaya", "5. Bandung");
        System.out.printf("%-15s %-16s\n ", "3. Yogyakarta", "6. Jakarta");


        System.out.println("Jenis Tiket:");
        System.out.printf("%18s %19s %20s\n", "1.Hijau (Ekonomi)", "2.Kuning (Premium)", "3.Merah (Eksklusif)");

        System.out.print("Tanggal Keberangkatan\t:");
        tanggalKeberangkatan = input.nextLine();
        System.out.print("Stasiun Asal\t\t\t:");
        stasiunAsal = input.nextLine();
        System.out.print("Stasiun Tujuan\t\t\t:");
        stasiunTujuan = input.nextLine();
        System.out.print("Jenis Tiket\t\t\t\t:");
        jenisTiket = input.nextLine();
        System.out.print("Jumlah Tiket\t\t\t:");
        jumlahTiket = input.nextInt();
        System.out.print("Nominal Pembayaran\t\t:");
        nominalPembayaran = input.nextInt();
        System.out.println("==================================================");


        //program id tiket
        kodeNIK = nomorKTP.substring(13, 16);

        //kode stasiun
          switch (stasiunAsal) {
              case "Malang" -> kodeSA = "MLG";
              case "Jakarta" -> kodeSA = "JKT";
              case "Surabaya" -> kodeSA = "SBY";
              case "Bandung" -> kodeSA = "BDG";
              case "Semarang" -> kodeSA = "SMR";
              case "Yogyakarta" -> kodeSA = "YOG";
              case "Serang" -> kodeSA = "SRG";
              default -> {
              }
          }

          switch (stasiunTujuan) {
              case "Malang" -> kodeST = "MLG";
              case "Jakarta" -> kodeST = "JKT";
              case "Surabaya" -> kodeST = "SBY";
              case "Bandung" -> kodeST = "BDG";
              case "Semarang" -> kodeST = "SMR";
              case "Yogyakarta" -> kodeST = "YOG";
              case "Serang" -> kodeST = "SRG";
              default -> {
              }
          }

          switch (jenisTiket) {
              case "Hijau" -> kodeTiket = "01";
              case "Kuning" -> kodeTiket = "02";
              case "Merah" -> kodeTiket = "03";
              default -> {
              }
          }

        if (jumlahTiket < 10) {
            kodeJTiket = "00" + jumlahTiket;
        } else {
            kodeJTiket = "0" + jumlahTiket;
        }


        int malang = 0, sura = 100, yogya = 400, semarang = 450, bandung = 800, jakarta = 900, serang = 1000;
        int stasiun1, stasiun2;
          stasiun1 = switch (stasiunAsal) {
              case "Malang" -> malang;
              case "Surabaya" -> sura;
              case "Yogyakarta" -> yogya;
              case "Semarang" -> semarang;
              case "Bandung" -> bandung;
              case "Jakarta" -> jakarta;
              case "Serang" -> serang;
              default -> 0;
          };

          stasiun2 = switch (stasiunTujuan) {
              case "Malang" -> malang;
              case "Surabaya" -> sura;
              case "Yogyakarta" -> yogya;
              case "Semarang" -> semarang;
              case "Bandung" -> bandung;
              case "Jakarta" -> jakarta;
              case "Serang" -> serang;
              default -> 0;
          };
        String jarakk = stasiunAsal + "-" + stasiunTujuan;
        jarak = Math.abs(stasiun2 - stasiun1);
        //program jenis tiket
          switch (jenisTiket) {
              case "Hijau" -> hargaTiket = (4400 / 10) * jarak;
              case "Kuning" -> hargaTiket = (7100 / 10) * jarak;
              case "Merah" -> hargaTiket = (10000 / 10) * jarak;
          }

        //Perhitungan final dan diskon
        totalHarga = hargaTiket * jumlahTiket;

        if (jenisTiket.equalsIgnoreCase("Hijau")) {
            if (jarak > 700) {
                diskon = totalHarga * 20 / 100;
            } else {
                diskon = totalHarga * 5 / 100;
            }

        } else if (jenisTiket.equalsIgnoreCase("Kuning")) {
            if (jarak > 700) {
                diskon = totalHarga * 25 / 100;
            } else if (jarak > 400) {
                diskon = totalHarga * 20 / 100;
            } else {
                diskon = totalHarga * 5 / 100;
            }

        } else if (jenisTiket.equalsIgnoreCase("Merah")) {
            if (jarak > 700) {
                diskon = totalHarga * 30 / 100;
            } else if (jarak > 400) {
                diskon = totalHarga * 25 / 100;
            } else if (jarak >= 300) {
                diskon = totalHarga * 20 / 100;
            } else {
                diskon = totalHarga * 5 / 100;
            }
        }

        int hargaSebenarnya = (totalHarga - diskon);
        kembalian = nominalPembayaran - hargaSebenarnya;

        if (nominalPembayaran >= (totalHarga - diskon)) {
            System.out.println("Pemesanan Tiket Berhasil !");

            //Program Output Tiket
            System.out.println("==================================================");
            System.out.println("                 DETAIL PEMESANAN                 ");
            System.out.println("==================================================");
            System.out.printf("%s %s\n", "ID\t\t\t\t\t\t:", kodeSA + "-" + kodeST + kodeTiket + kodeNIK + kodeJTiket);
            System.out.println("Nama\t\t\t\t\t: " + nama);
            System.out.println("KTP\t\t\t\t\t\t: " + nomorKTP);
            System.out.println("Alamat\t\t\t\t\t: " + alamat);
            System.out.println("Nomor Telepon\t\t\t: " + nomorTelepon);
            System.out.println("Tanggal Keberangkatan\t: " + tanggalKeberangkatan);
            System.out.println("Rute\t\t\t\t\t: " + jarakk + " -> " + jarak + "km");
            System.out.println("Jumlah Tiket\t\t\t: " + jumlahTiket);
            System.out.println("Total Harga\t\t\t\t: " + kursIndo.format(totalHarga));
            System.out.println("Diskon\t\t\t\t\t: " + kursIndo.format(diskon));
            System.out.println("Nominal Pembayaran\t\t: " + kursIndo.format(nominalPembayaran));
            System.out.println("Kembalian\t\t\t\t: " + kursIndo.format(Math.abs(kembalian)));
            System.out.println("--------------------------------------------------");
            System.out.println("Tiket ini dicetak pada " + currentDateStr);
            System.out.println("==================================================");

            System.out.println("Selamat menikmati perjalanan anda\uD83E\uDD70");

            System.out.println("==================================================");

        } else {

            //Program uang tidak cukup
            System.out.println("Maaf, uang Anda tidak mencukupi untuk melakukan pembayaran sebesar " + kursIndo.format(Math.abs(kembalian)) + "!");
            System.out.println("1. Membatalkan pesanan");
            System.out.println("2. Mengulangi pembayaran");
            System.out.println("Masukkan pilihan anda :");
            int pilihanGagalBayar = input.nextInt();
            switch (pilihanGagalBayar) {
                case 1 -> MenuUtama();
                case 2 -> {
                        System.out.print("Nominal Pembayaran\t\t:");
                        nominalPembayaran = input.nextInt();
                        kembalian = nominalPembayaran - (totalHarga - diskon);

                    if (nominalPembayaran >= (totalHarga - diskon)) {
                        System.out.println("Pemesanan Tiket Berhasil !");

                        //Program Output Tiket
                        System.out.println("==================================================");
                        System.out.println("                 DETAIL PEMESANAN                 ");
                        System.out.println("==================================================");
                        System.out.printf("%s %s\n", "ID\t\t\t\t\t\t:", kodeSA + "-" + kodeST + kodeTiket + kodeNIK + kodeJTiket);
                        System.out.println("Nama\t\t\t\t\t: " + nama);
                        System.out.println("KTP\t\t\t\t\t\t: " + nomorKTP);
                        System.out.println("Alamat\t\t\t\t\t: " + alamat);
                        System.out.println("Nomor Telepon\t\t\t: " + nomorTelepon);
                        System.out.println("Tanggal Keberangkatan\t: " + tanggalKeberangkatan);
                        System.out.println("Rute\t\t\t\t\t: " + jarakk + " -> " + jarak + "km");
                        System.out.println("Jumlah Tiket\t\t\t: " + jumlahTiket);
                        System.out.println("Total Harga\t\t\t\t: " + kursIndo.format(totalHarga));
                        System.out.println("Diskon\t\t\t\t\t: " + kursIndo.format(diskon));
                        System.out.println("Nominal Pembayaran\t\t: " + kursIndo.format(nominalPembayaran));
                        System.out.println("Kembalian\t\t\t\t: " + kursIndo.format(Math.abs(kembalian)));
                        System.out.println("--------------------------------------------------");
                        System.out.println("Tiket ini dicetak pada " + currentDateStr);
                        System.out.println("==================================================");

                        System.out.println("Selamat menikmati perjalanan anda\uD83E\uDD70");

                        System.out.println("==================================================");

                    } else {
                        System.out.println("Mohon maaf anda telah melakukan banyak kesalahan");
                        System.out.println("Silahkan memulai dari awal lagi");
                                Menu1();
                    }

                }
            }
        }

        String kodePesanan = kodeSA + "-" + kodeST + kodeTiket + kodeNIK + kodeJTiket;
        String rute = jarakk + " -> " + jarak + "km";
        String pesanan = kodePesanan + ";" + tanggalKeberangkatan + ";" + nomorKTP + ";" + nama + ";" + rute + ";" + tanggalKeberangkatan
                + ";" + jenisTiket + ";" + jumlahTiket;
        if (counter == 5){
            counter = 0;
        }
        tickets[counter++] = pesanan;
    }

    public static void Menu2() {
        System.out.println("List Stasiun yang Tersedia:");
        System.out.printf("%-16s %-15s %-9s\n ", " 1. Malang", "4. Semarang", "7. Serang");
        System.out.printf("%-15s %-16s\n ", "2. Surabaya", "5. Bandung");
        System.out.printf("%-15s %-16s\n ", "3. Yogyakarta", "6. Jakarta");
    }

    public static void Menu3() {
        System.out.println("Jenis Tiket:");
        System.out.printf("%18s %19s %20s\n", "1.Hijau (Ekonomi)", "2.Kuning (Premium)", "3.Merah (Eksklusif)");
    }

    public static void Menu4() {
        System.out.println("--------------------------------------------------");
        System.out.println("Riwayat Pemesanan Tiket");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < maxCounter; i++) {
            if (tickets[i] != null) {
                String[] detailTicket = tickets[i].split(";");
                System.out.println((i + 1) + ". " + (detailTicket[0] + ":" + detailTicket[1]));
            }
        }
    }

    public static void Menu5() {
        Scanner input = new Scanner(System.in);
        System.out.println("--------------------------------------------------");
        System.out.println("Cek Pemesanan Tiket");
        System.out.println("--------------------------------------------------");
                System.out.print("Masukkan ID Pesanan Anda :");
                String idPesanan = input.nextLine();
                System.out.print("Masukkan Nomor KTP Anda :");
                String nomorKTP = input.nextLine();
        for (int i = 0; i < maxCounter; i++) {
            if (tickets[i] != null) {
                String[] detailTicket = tickets[i].split(";");
                if (idPesanan.equals(detailTicket[0]) && nomorKTP.equals(detailTicket[2])) {
                    System.out.println("==================================================");
                    System.out.println("                 DETAIL PEMESANAN                 ");
                    System.out.println("==================================================");
                    System.out.println("Id Pesanan\t\t\t: " + detailTicket[0]);
                    System.out.println("Nomor KTP: " + detailTicket[2]);
                    System.out.println("Nama Pemesan: " + detailTicket[3]);
                    System.out.println("Rute: " + detailTicket[4]);
                    System.out.println("Tanggal Keberangkatan: " + detailTicket[5]);
                    System.out.println("Jenis Tiket: " + detailTicket[6]);
                    System.out.println("Jumlah Tiket " + detailTicket[7]);
                    System.out.println("==================================================");

                } else {
                    System.out.println("Mohon maaf data pesanan tidak ada");
                }
            }
        }
    }
}


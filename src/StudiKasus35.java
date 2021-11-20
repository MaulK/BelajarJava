import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class StudiKasus35 {

    static int maxCounter = 5;
    static String[] tickets = new String[maxCounter];
    static int counter = 0;

    public static void main(String[] args) {
        MenuUtama();
    }
    //Beberapa Method untuk Menu

    static void MenuUtama() {
        int pilihan;
        Scanner in = new Scanner(System.in);

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
            pilihan = in.nextInt();
            switch (pilihan) {
                case 1:
                    Menu1();
                    break;
                case 2:
                    Menu2();
                    break;
                case 3:
                    Menu3();
                    break;
                case 4:
                    Menu4();
                    break;
                case 5:
                    Menu5();
                    break;
                case 6:
                    System.out.println("Terimakasih telah menggunakan jasa FILKOM EXPRESS");
                    break;
                default:
                    System.out.println("Mohon maaf pilihan tersebut tidak tersedia");

            }
        } while (pilihan != 6);
    }

    static void Menu1() {
        String nama, nomorKTP, nomorTelepon, alamat, tanggalKeberangkatan, stasiunAsal, stasiunTujuan, jenisTiket;
        String kodeSA = null;
        String kodeST = null;
        String kodeNIK = null;
        String kodeTiket = null;
        String kodeJTiket = null;
        String nonValid = null;

        int jumlahTiket, totalHarga, kembalian;
        int nominalPembayaran = 0;
        int diskon = 0;
        int jarak = 0;
        int hargaTiket = 0;
        int pilihanGagalTiket = 0;

        Scanner input = new Scanner(System.in);

        //Sistem waktu
        LocalDateTime currentDate = LocalDateTime.now();

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String currentDateStr = currentDate.format(dateFormatter);

        //format mata uang Rupiah Indonesia
        DecimalFormat kursIndo = (DecimalFormat) DecimalFormat.getCurrencyInstance();
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
        if (stasiunAsal.equals("Malang")) {
            kodeSA = "MLG";
        } else if (stasiunAsal.equals("Jakarta")) {
            kodeSA = "JKT";
        } else if (stasiunAsal.equals("Surabaya")) {
            kodeSA = "SBY";
        } else if (stasiunAsal.equals("Bandung")) {
            kodeSA = "BDG";
        } else if (stasiunAsal.equals("Semarang")) {
            kodeSA = "SMR";
        } else if (stasiunAsal.equals("Yogyakarta")) {
            kodeSA = "YOG";
        } else if (stasiunAsal.equals("Serang")) {
            kodeSA = "SRG";
        } else {
            nonValid = "1";
        }

        if (stasiunTujuan.equals("Malang")) {
            kodeST = "MLG";
        } else if (stasiunTujuan.equals("Jakarta")) {
            kodeST = "JKT";
        } else if (stasiunTujuan.equals("Surabaya")) {
            kodeST = "SBY";
        } else if (stasiunTujuan.equals("Bandung")) {
            kodeST = "BDG";
        } else if (stasiunTujuan.equals("Semarang")) {
            kodeST = "SMR";
        } else if (stasiunTujuan.equals("Yogyakarta")) {
            kodeST = "YOG";
        } else if (stasiunTujuan.equals("Serang")) {
            kodeST = "SRG";
        } else {
            nonValid = "1";
        }

        if (jenisTiket.equals("Hijau")) {
            kodeTiket = "01";
        } else if (jenisTiket.equals("Kuning")) {
            kodeTiket = "02";
        } else if (jenisTiket.equals("Merah")) {
            kodeTiket = "03";
        } else {
            nonValid = "1";
        }

        if (jumlahTiket < 10) {
            kodeJTiket = "00" + jumlahTiket;
        } else {
            kodeJTiket = "0" + jumlahTiket;
        }


        int malang = 0, sura = 100, yogya = 400, semarang = 450, bandung = 800, jakarta = 900, serang = 1000;
        int stasiun1, stasiun2;
        switch (stasiunAsal) {
            case "Surabaya":
                stasiun1 = sura;
                break;
            case "Yogyakarta":
                stasiun1 = yogya;
                break;
            case "Semarang":
                stasiun1 = semarang;
                break;
            case "Bandung":
                stasiun1 = bandung;
                break;
            case "Jakarta":
                stasiun1 = jakarta;
                break;
            case "Serang":
                stasiun1 = serang;
                break;
            default:
                stasiun1 = 0;
        }

        switch (stasiunTujuan) {
            case "Surabaya":
                stasiun2 = sura;
                break;
            case "Yogyakarta":
                stasiun2 = yogya;
                break;
            case "Semarang":
                stasiun2 = semarang;
                break;
            case "Bandung":
                stasiun2 = bandung;
                break;
            case "Jakarta":
                stasiun2 = jakarta;
                break;
            case "Serang":
                stasiun2 = serang;
                break;
            default:
                stasiun2 = 0;
        }
        String jarakk = stasiunAsal + "-" + stasiunTujuan;
        jarak = Math.abs(stasiun2 - stasiun1);
        //program jenis tiket
        switch (jenisTiket) {
            case "Hijau":
                hargaTiket = (4400 / 10) * jarak;
                break;
            case "Kuning":
                hargaTiket = (7100 / 10) * jarak;
                break;
            case "Merah":
                hargaTiket = (10000 / 10) * jarak;
                break;
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

        if (nominalPembayaran >= hargaSebenarnya && nonValid != "1") {
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
                case 1:
                    MenuUtama();
                    break;
                case 2:
                    System.out.print("Nominal Pembayaran\t\t:");
                    nominalPembayaran = input.nextInt();
                    kembalian = nominalPembayaran - (totalHarga - diskon);

                    if (nominalPembayaran >= (totalHarga - diskon) && nonValid != "1") {
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
                        System.out.println("Mohon untuk mengulangi lagi!");
                        Menu1();
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

    static void Menu2() {
        System.out.println("List Stasiun yang Tersedia:");
        System.out.printf("%-16s %-15s %-9s\n ", " 1. Malang", "4. Semarang", "7. Serang");
        System.out.printf("%-15s %-16s\n ", "2. Surabaya", "5. Bandung");
        System.out.printf("%-15s %-16s\n ", "3. Yogyakarta", "6. Jakarta");
    }

    static void Menu3() {
        System.out.println("Jenis Tiket:");
        System.out.printf("%18s %19s %20s\n", "1.Hijau (Ekonomi)", "2.Kuning (Premium)", "3.Merah (Eksklusif)");
    }

    static void Menu4() {
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

    static void Menu5() {

        Scanner inp = new Scanner(System.in);

        System.out.println("--------------------------------------------------");
        System.out.println("Cek Pemesanan Tiket");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < maxCounter; i++) {
            if (tickets[i] != null) {
                String[] detailTicket = tickets[i].split(";");
                System.out.print("Masukkan ID Pesanan Anda :");
                String idPesanan = inp.nextLine();
                System.out.print("Masukkan Nomor KTP Anda :");
                String nomorKTP = inp.nextLine();
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


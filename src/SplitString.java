public class SplitString {
    public static void main(String[] args) {
        String ticket = "123;ABCD;31 NOVEMBER 2021";

        String[] detailTicket = ticket.split(";");
        System.out.println("Id Pesanan\t\t\t: " + detailTicket[0]);
        System.out.println("Nomor KTP: " + detailTicket[0]);
        System.out.println("Nama Pemesan: " + detailTicket[0]);
        System.out.println("Rute: " + detailTicket[0]);
        System.out.println("Tanggal Keberangkatan: " + detailTicket[0]);
        System.out.println("Jenis Tiket: " + detailTicket[0]);
        System.out.println("Jumlah Tiket " + detailTicket[0]);
    }
}

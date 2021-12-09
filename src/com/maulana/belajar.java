package com.maulana;
import java.util.*;

class Mahasiswa {
    String nama;
    String nim;
    String jurusan;
    double ipk;
    int umur;
}

public class belajar {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        Mahasiswa mahasiswa1 = new Mahasiswa();

        mahasiswa1.nama = input.nextLine();
        System.out.println(mahasiswa1.nama);
        mahasiswa1.nim = input.nextLine();
        System.out.println(mahasiswa1.nim);
        mahasiswa1.jurusan = input.nextLine();
        System.out.println(mahasiswa1.jurusan);
        mahasiswa1.ipk = input.nextDouble();
        System.out.println(mahasiswa1.ipk);
        mahasiswa1.umur = input.nextInt();
        System.out.println(mahasiswa1.umur);


    }
}

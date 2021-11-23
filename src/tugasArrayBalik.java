
/**
 * Tugas Array Pemrograman Dasar
 * Nama : Maulana Khoirusyifa'
 * NIM : 215150200111014
 */
public class tugasArrayBalik{
    public static void main(String[] args){
        //array awal yang ingin diubah urutannya
        int[] a={1,2,3,4,5,6,7,8,9,10};

        //array untuk menampung hasil urutan
        int[] b=new int[a.length];
        //perulangan untuk mengubah urutan
        for(int i=0;i<a.length;i++){
            //membuat variabel bantu untuk menampung           
            int temp;
            //temp menampung nilai terakhir dari array a
            temp=a[a.length-i-1];
            //mengassign nilai temp ke array b dengan index i
            b[i]=temp;
        }
        //print output array a
        System.out.println("Array Sebelum Dibalik");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        //print output array b
        System.out.println("\nArray Sesudah Dibalik");
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }
}
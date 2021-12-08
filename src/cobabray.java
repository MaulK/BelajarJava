import java.util.Scanner;

public class cobabray {

    static int[] listGerbong;
    public static void main(String[] args) {

        aturKereta();
    }

    private static void aturKereta(){
        Scanner input = new Scanner(System.in);
        int sumKereta = input.nextInt();
        if (sumKereta == 0) {
            System.out.println("Kereta tidak bisa dibuat jika tidak ada lokomotif");
        }
        else{
            listGerbong = new int[sumKereta-1];
            inputGerbong();

            input.nextLine();
            String order = input.nextLine();

            if (order.equals("rotate")){
                rotateGerbong();
            }
            else if (order.equals("detach")){
                int posisiDetach = input.nextInt();
                if (validDetach(posisiDetach)){
                    detachGerbong(posisiDetach);
                }
                else if (posisiDetach == 1) {
                    System.out.println("Lokomotif tidak bisa dilepas");
                    return;
                }
                else {
                    System.out.println("Gerbong kereta tidak ada");
                    printHasil();
                    return;
                }
            }
            printHasil();
        }
    }

    private static void printHasil(){
        System.out.print("1 ");
        for (int j:listGerbong){
            if (j == 0) break;
            System.out.print(j + " ");
        }
    }

    private static void inputGerbong(){
        int posisiGerbong = 2;
        for (int i=0; i<listGerbong.length; i++){
            listGerbong[i] = posisiGerbong;
            posisiGerbong++;
        }
    }

    private static void rotateGerbong(){
        for (int i=0; i<listGerbong.length/2; i++){
            int temporary = listGerbong[i];
            listGerbong[i] = listGerbong[listGerbong.length-i-1];
            listGerbong[listGerbong.length-i-1] = temporary;
        }
    }

    private static boolean validDetach(int posisi){
        if (posisi > listGerbong.length+1) {
            return false;
        }
        else if(posisi == 1) {
            return false;
        }
        else {
            return true;
        }
    }

    private static void detachGerbong(int posisi){
        for (int i=0; i<listGerbong.length; i++){
            if (listGerbong[i] >= posisi){
                listGerbong[i] = 0;
            }
        }
    }
}
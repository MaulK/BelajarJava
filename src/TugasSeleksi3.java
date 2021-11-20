import java.util.Scanner;

public class TugasSeleksi3 {
    public static void main(String[] args) {
        int a,b,n,z = 0;

        Scanner input = new Scanner(System.in);

        n=input.nextInt();
        a=input.nextInt();
        b=input.nextInt();

        if(n > 0){
            if(a > b){
                z = a;
            }
            else{
                //else ini merupakan bagian dari if yang kedua karena satu baris
                //dengan if kedua serta didalam if pertama.
                z = b;
            }
        } else{
            System.out.println("Maaf kondisi tidak memenuhi syarat!");
        }
        System.out.println("Jadi, nilai z adalah " + z);
    }
}

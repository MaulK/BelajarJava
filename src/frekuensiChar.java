import java.util.Scanner;

public class frekuensiChar {

    public static void main( String[] args ) {
        
        Scanner input = new Scanner( System.in );
        String name = input.nextLine();
        input.close();

        int[] array = new int[256];

        for ( int i = 0; i < name.length(); i++ ) {
            char karakter = name.charAt( i );
            int ascii = ( int )karakter;
            array[ascii]++;
        }

        for ( int i = 0; i < array.length; i++ ) {
            if ( array[i] > 0 )
            {
                System.out.println((char)i + ": " + array[i] );
            }
        }
    }
}




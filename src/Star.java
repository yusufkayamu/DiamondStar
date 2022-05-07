import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Give a number for a star");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1 ; j++){
                System.out.print("*");
            }
            System.out.println( );
        }for (int i = (n - 1) ; i > 0 ; i--){
            for (int j =0 ; j < (n -i) ; j++ ){
                System.out.print(" ");
            }
            for ( int k =0 ; k < (i + (i-1)) ; k++){
                System.out.print("*");
            }
            System.out.println( );
        }


    }

}






















import java.util.Scanner;
import java.io.Console;


public class App {
    public static  void main (String[] args){

        Scanner cece= new Scanner(System.in);

        System.out.println("Would like to Encrypt or Decrypt a message");


        String navigationChoice=cece.nextLine();

        if(navigationChoice.equals("Encrypt")){
            System.out.println(" Write your message here ....");
            String gambo = cece.nextLine();

            System.out.println("Write a shift value...... ");
            int koti = cece.nextInt();
            CaesarCipher text3 = new CaesarCipher();

            System.out.println("Encrypted Message is " +  text3.kiki(gambo,koti));


            System.out.println("#################################################");
        } else if
            (navigationChoice.equals("Decrypt")){

            System.out.println(" Write your message here ....");
            String file = cece.nextLine();

            System.out.println("Write a shift value...... ");
            int koko = cece.nextInt();

            Decryption text4 = new Decryption();

            System.out.println("Encrypted Message is " +  text4.kuku(file,koko));
            System.out.println("#################################################");
        }

        }
    }

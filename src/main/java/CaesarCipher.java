import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CaesarCipher {
    public static void main(String args[]) {
        Scanner cece= new Scanner(System.in);
        System.out.println(" Write your message here ....");
        String ciphertext = cece.nextLine();
        int koti;
        char text;
        System.out.println("Write a shift value...... ");
        koti = cece.nextInt();
        ciphertext = cece.nextLine();

        for(int i=0; i < ciphertext.length();i++){
            if(text >= 'a' && text <= 'z'){
                text = (char)(text + koti);
            }
        }
    }
}

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
            if(text >= 'a' && text <= 'z'){
                text = (char)(text + koti);

                if(text > 'z'){
                    text = (char)(text - 'z' + 'a' - 1);
                    }

                    ciphertext  += text;
                }
                else if(text >= 'A' && text <= 'Z'){
                    text = (char)(text + koti);

                    if(text > 'Z'){
                        text = (char)(text - 'Z' + 'A' - 1);
                    }

                    ciphertext += text;
                }
                else {
                    ciphertext += text;
                }
            }

            System.out.println("Encrypted Message = " + ciphertext);
        }
        }
